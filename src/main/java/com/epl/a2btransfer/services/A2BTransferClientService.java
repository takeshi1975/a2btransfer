package com.epl.a2btransfer.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Description;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.epl.a2btransfer.dto.Agency;
import com.epl.a2btransfer.dto.Route;
import com.epl.a2btransfer.exception.NotApplicableException;
import com.epl.a2btransfer.printer.TransferVoucher;
import com.epl.a2btransfer.repositories.AgencyRepository;
import com.epl.a2btransfer.xto.AvailRq;
import com.epl.a2btransfer.xto.AvailRs;
import com.epl.a2btransfer.xto.AvailRs.TransferOnly.Availability.Avline;
import com.epl.a2btransfer.xto.BookingRq;
import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.CancelFeeRq;
import com.epl.a2btransfer.xto.CancelFeeRs;
import com.epl.a2btransfer.xto.CancelRq;
import com.epl.a2btransfer.xto.CancelRs;
import com.epl.a2btransfer.xto.DisclaimerRq;
import com.epl.a2btransfer.xto.DisclaimerRq.TransferOnly.Info;
import com.epl.a2btransfer.xto.DisclaimerRq.TransferOnly.Info.Disclaimer;
import com.epl.a2btransfer.xto.DisclaimerRs;
import com.epl.a2btransfer.xto.Errors;
import com.epl.a2btransfer.xto.LocationRq;
import com.epl.a2btransfer.xto.LocationRs;
import com.epl.a2btransfer.xto.PrintRq;
import com.epl.a2btransfer.xto.ReserveRq;
import com.epl.a2btransfer.xto.ReserveRs;

@Service
public class A2BTransferClientService {

	private static final Logger log = Logger.getLogger(A2BTransferClientService.class);

	@Value("${app.url}")
	private String url;

	@Value("${app.url}")
	private String version;
	
	@Value("${app.username}")
	private String username;

	@Value("${app.password}")
	private String password;

	@Value("${app.lang}")
	private String lang;
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private PolicyService policyService;	

	@Autowired
	private AgencyRepository agencyRepository;
	
	private Errors handleError(String description) {
		Errors errors = new Errors();
		Errors.Error error = new Errors.Error();		
		errors.setError(new ArrayList<Errors.Error>());
		error.setText(description);
		errors.getError().add(error);
		return errors;
	}

	/**
	 * avail Devuelve la disponibilidad.
	 * @param availRq
	 * @return
	 */
	public AvailRs avail(AvailRq availRq) {
		log.info("Se va a llamar al metodo de disponibilidad");
		ResponseEntity<AvailRs> response = restTemplate.postForEntity(url, availRq, AvailRs.class);
		if (response.getStatusCode().is2xxSuccessful()) {
			AvailRs availRs = response.getBody();
			if (availRs.getTransferOnly().getErrors() == null)
				try {
					List<Avline> lines = availRs.getTransferOnly().getAvailability()
							.getAvline();					
					DateFormat df = new SimpleDateFormat("dd/MM/yy");
					Date date = df.parse(availRq.getTransferOnly().getAvailability().getRequest().getArrDate());
					long cliente = availRq.getAgency();
					long sistema = availRq.getSystem();
					policyService.calculatePrice(lines,cliente, sistema, date); // Modifica los precios de las líneas.										
				} catch (Exception ex) {
					log.error("Error en el cálculo de comisiones", ex);
					availRs.getTransferOnly().setAvailability(null);
					availRs.getTransferOnly().setErrors(this.handleError(ex.toString()));
				} 
			
				try{
					List<Avline> lines = availRs.getTransferOnly().getAvailability()
							.getAvline();
					lines.forEach(line ->{
						if (line.getDisclaimer()==1){																													
							DisclaimerRs disclaimerRs = this.disclaimer(line.getTransferCode());
							line.setDisclaimerTitle(disclaimerRs.getTransferOnly().getInfo().getDisclaimer().getDisclaimerInfo().getTitle());
							line.setDisclaimerTxt(disclaimerRs.getTransferOnly().getInfo().getDisclaimer().getDisclaimerInfo().getDescription());
						}						
					});
				}catch(Exception ex){
					log.error("No se ha podido obtener la descarga de responsabilidad", ex);
				}
			return availRs;
		} else
			log.error("No se ha podido establecer comunicacion con el servicio externo");
		return null;
	}

	/**
	 * block Realiza el bloqueo de una reserva
	 */
	public ReserveRs block(ReserveRq reserveRq) {
		log.info("Se va a llamar al metodo de bloqueo");
		ResponseEntity<ReserveRs> response = restTemplate.postForEntity(url, reserveRq, ReserveRs.class);
		if (response.getStatusCode().is2xxSuccessful()){
			ReserveRs reserveRs =  response.getBody();
			if (reserveRs.getTransferOnly().getErrors()==null){
				try{
					DateFormat df = new SimpleDateFormat("dd/MM/yy");
					Date bookingDate = df.parse(reserveRq.getDate());
					long agency = reserveRq.getAgency();
					long system = reserveRq.getSystem();										
					
					reserveRs = policyService.calculatePrice(reserveRs, agency, system, bookingDate);
					float priceEPL = reserveRs.getTransferOnly().getBooking().getReserve().getHolidayValue();
					reserveRs.setBreakdown(this.policyService.breakdown(priceEPL, agency, system, bookingDate));
				}catch(Exception ex){
					log.error("Error en el parseo del bloqueo (rs)...", ex);
					reserveRs.getTransferOnly().setBooking(null);
					reserveRs.getTransferOnly().setErrors(this.handleError(ex.toString()));
				}
				return reserveRs;
			}else 
				return reserveRs; 
		} else log.error("Error en las comunicaciones. No se ha podido obtener una respuesta valida");
		return null;
	}

	/**
	 * Compra de la reserva.
	 * Añade a la reserva el objeto cancelFee.
	 * @param bookingRq
	 * @return
	 */
	public BookingRs booking(BookingRq bookingRq) {
		log.info("Se va a llamar al metodo de reserva");
		ResponseEntity<BookingRs> response = restTemplate.postForEntity(url, bookingRq, BookingRs.class);
		if (response.getStatusCode().is2xxSuccessful()) {
			BookingRs bookingRs = response.getBody();
			CancelFeeRs cancelFeeRs = null;
			bookingRs = response.getBody();
			if (bookingRs.getTransferOnly().getErrors() == null) {
				// Si no hay errores asignamos el cancelFee que puede estar vacío!.
				cancelFeeRs = this.cancelFees(
						bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().getBookingRef());

				bookingRs.setCancelFee(cancelFeeRs.getTransferOnly().getBooking().getCancelFees()); // Asignar el cancelFee...														
				try {
					String strDate = bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo()
							.getOutboundTransferDetails().getArrDate();
					DateFormat df = new SimpleDateFormat("dd/MM/yy");
					Date date = df.parse(strDate);					
					long agencia = bookingRq.getAgency();
					long sistema = bookingRq.getSystem();
					// Comision de EPL
					
					bookingRs = policyService.calculatePrice(bookingRs,agencia, sistema, date);
					float priceEPL = bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().getInvoiceValue();					
					bookingRs.setBreakdown(policyService.breakdown(priceEPL, agencia, sistema, date));
					
					return bookingRs;
				} catch (NumberFormatException nfex){
					log.error("No se ha podido obtener informacion de la agencia");
					bookingRs.getTransferOnly().setBooking(null);
					bookingRs.getTransferOnly().setErrors(handleError("No se ha podido obtener la agencia "+nfex.toString()));
				} catch (NotApplicableException naex) {			
					bookingRs.getTransferOnly().setBooking(null);
					bookingRs.getTransferOnly().setErrors(this.handleError(naex.toString()));
					log.error("Error en la comisión", naex);
				} catch (ParseException parex) {
					bookingRs.getTransferOnly().setBooking(null);
					bookingRs.getTransferOnly().setErrors(this.handleError(parex.toString()));
					log.error("Error en la comisión", parex);
				}
			} else
				log.error("No se ha podido establecer comunicación con el servico externo");
		}
		return null;
	}

	/***
	 * Carga de las rutas de A2BTransfer...
	 */
	public String loadRoutes() {
		log.info("Se va a llamar al método de lectura de rutas");
		com.epl.a2btransfer.xto.RouteRq route = new com.epl.a2btransfer.xto.RouteRq();
		route.setVersion(version);
		route.setTransferOnly(new com.epl.a2btransfer.xto.RouteRq.TransferOnly());
		route.getTransferOnly().setCacheRoutes(new com.epl.a2btransfer.xto.RouteRq.TransferOnly.CacheRoutes());
		route.getTransferOnly().getCacheRoutes()
				.setRequest(new com.epl.a2btransfer.xto.RouteRq.TransferOnly.CacheRoutes.Request());
		route.getTransferOnly().getCacheRoutes().getRequest().setUsername(username);
		route.getTransferOnly().getCacheRoutes().getRequest().setPassword(password);
		ResponseEntity<Route> response = restTemplate.postForEntity(url, route, Route.class);
		if (response.getStatusCode().is2xxSuccessful())
			log.info("Se ha finalizado con el proceso de carga de rutas");
		return "OK";
	}

	/**
	 * Carga de las localizaciones de A2BTransfer en ETOUR.
	 * 
	 * @return
	 */
	public String loadLocations() {
		log.info("Se va a llamar al método de lectura de localizaciones");
		com.epl.a2btransfer.xto.LocationRq locationRq = new com.epl.a2btransfer.xto.LocationRq();
		locationRq.setVersion("NEWFORMAT");
		locationRq.setTransferOnly(new com.epl.a2btransfer.xto.LocationRq.TransferOnly());
		locationRq.getTransferOnly().setCacheLocations(new LocationRq.TransferOnly.CacheLocations());
		locationRq.getTransferOnly().getCacheLocations()
				.setRequest(new LocationRq.TransferOnly.CacheLocations.Request());
		locationRq.getTransferOnly().getCacheLocations().getRequest().setUsername(username);
		locationRq.getTransferOnly().getCacheLocations().getRequest().setPassword(password);
		locationRq.getTransferOnly().getCacheLocations().getRequest().setLang("ES");
		ResponseEntity<LocationRs> response = restTemplate.postForEntity(url, locationRq, LocationRs.class);
		if (response.getStatusCode().is2xxSuccessful())
			log.info("Se ha finalizado con el proceso de carga de localizaciones");
		return "OK";
	}

	@Description("Busca los gastos de cancelación de una ruta")
	public CancelFeeRs cancelFees(String BookingRef) {
		log.info("Se va a llamar para obtener los gastos de cancelación");
		CancelFeeRq cancelFeeRq = new CancelFeeRq();
		cancelFeeRq.setVersion("NEWFORMAT");	
		cancelFeeRq.setSess("");		
		cancelFeeRq.setTransferOnly(new CancelFeeRq.TransferOnly());
		cancelFeeRq.getTransferOnly().setBooking(new CancelFeeRq.TransferOnly.Booking());
		cancelFeeRq.getTransferOnly().getBooking().setCancelFees(new CancelFeeRq.TransferOnly.Booking.CancelFees());
		cancelFeeRq.getTransferOnly().getBooking().getCancelFees().setBookingRef(BookingRef);
		cancelFeeRq.getTransferOnly().getBooking().getCancelFees().setPassword(password);
		cancelFeeRq.getTransferOnly().getBooking().getCancelFees().setUsername(username);
		try{ Thread.sleep(5000); } catch(Exception ex){}
		ResponseEntity<CancelFeeRs> response = restTemplate.postForEntity(url, cancelFeeRq, CancelFeeRs.class);
		if (response.getStatusCode().is2xxSuccessful())
			log.info("Se ha finalizado con el proceso de consulta de Fees");
		return response.getBody();
	}

	@Description("Impresión del bono")
	public byte[] print(PrintRq printRq){
		TransferVoucher transferVoucher = new TransferVoucher();
		String locata = printRq.getLocata();
		long agencyId = printRq.getAgency();
		Agency agency = agencyRepository.findOne(agencyId); 
		try {
			return transferVoucher.build(locata, agency, printRq.getTransferOnly());
		}catch(Exception exception){
			log.error("No se ha impreso el bono", exception);
			return null;
		}		
	}
	
	@Description("Cancelación de reserva")
	public CancelRs cancel(CancelRq cancelRq){
		try{
			ResponseEntity<CancelRs> response = restTemplate.postForEntity(url, cancelRq, CancelRs.class);
			return response.getBody();
		}catch(Exception exception){
			log.error("No se ha podido efectuar la cancelación", exception);
			return null;
		}
	}
	
	@Description("Texto legal para descarga de responsabilidad")
	private DisclaimerRs disclaimer(String transferCode){
		DisclaimerRq disclaimerRq = new DisclaimerRq();
		disclaimerRq.setTransferOnly(new DisclaimerRq.TransferOnly());
		disclaimerRq.setVersion(version);							
		disclaimerRq.getTransferOnly().setInfo(new Info());
		disclaimerRq.getTransferOnly().getInfo().setDisclaimer(new Disclaimer());
		disclaimerRq.getTransferOnly().getInfo().getDisclaimer().setLang(lang);
		disclaimerRq.getTransferOnly().getInfo().getDisclaimer().setPassword(this.password);
		disclaimerRq.getTransferOnly().getInfo().getDisclaimer().setUsername(this.username);
		disclaimerRq.getTransferOnly().getInfo().getDisclaimer().setTransferCode(transferCode);
		try{
			ResponseEntity<DisclaimerRs> response = restTemplate.postForEntity(url, disclaimerRq, DisclaimerRs.class);
			return response.getBody();
		}catch(Exception exception){
			log.error("No se ha podido obtener el disclaimer", exception);
			return null;
		}
	}
	
}
