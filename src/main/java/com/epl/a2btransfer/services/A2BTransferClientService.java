package com.epl.a2btransfer.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Description;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.epl.a2btransfer.dto.Route;
import com.epl.a2btransfer.xto.AvailRq;
import com.epl.a2btransfer.xto.AvailRs;
import com.epl.a2btransfer.xto.BookingRq;
import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.CancelFeeRq;
import com.epl.a2btransfer.xto.CancelFeeRs;
import com.epl.a2btransfer.xto.LocationRq;
import com.epl.a2btransfer.xto.LocationRs;
import com.epl.a2btransfer.xto.ReserveRq;
import com.epl.a2btransfer.xto.ReserveRs;

@Service
public class A2BTransferClientService {

    private static final Logger log = Logger.getLogger(A2BTransferClientService.class);
	          
    @Value("${app.url}")
    private String url;
    
    @Value("${app.username}")
    private String username;
    
    @Value("${app.password}")
    private String password;
    
    @Autowired
    private RestTemplate restTemplate;    
    
    /**
     * avail Devuelve la disponibilidad.
     * @param availRq
     * @return
     */
    public AvailRs avail(AvailRq availRq){
    	log.info("Se va a llamar al metodo de disponibilidad");
    	ResponseEntity<AvailRs> response =  restTemplate.postForEntity(url, availRq, AvailRs.class);    	
    	if (response.getStatusCode().is2xxSuccessful())
    		return response.getBody();
    	// TODO: Handle errors.    	
    	return null;    		
    }
    
    /**
     * block Realiza el bloqueo de una reserva
     */
    public ReserveRs block(ReserveRq reserveRq){
    	log.info("Se va a llamar al metodo de bloqueo");    	
    	ResponseEntity<ReserveRs> response = restTemplate.postForEntity(url, reserveRq, ReserveRs.class );
    	if (response.getStatusCode().is2xxSuccessful())
    		return response.getBody();
    	return null;
    } 
    
    /**
     * Compra de la reserva.
     * @param bookingRq
     * @return
     */
    public BookingRs booking(BookingRq bookingRq){
    	log.info("Se va a llamar al metodo de reserva");
    	ResponseEntity<BookingRs> response = restTemplate.postForEntity(url, bookingRq, BookingRs.class );
    	if (response.getStatusCode().is2xxSuccessful()){
    		BookingRs bookingRs = response.getBody(); 
    		CancelFeeRs cancelFees = this.cancelFees(bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().getBookingRef());
    		// Tener en cuenta los cancelFees.
    		// Podríamos añadir un objeto CancelFee a la respuesta.
    		bookingRs = response.getBody();
    		CancelFeeRs cancelFeeRs = null;
    		if (bookingRs.getTransferOnly().getErrors()!=null){ // Si no hay errores. Asignamos el cancelFee.
    			cancelFeeRs = this.cancelFees(bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().getBookingRef());
    		}
    		bookingRs.setCancelFeeRs(cancelFeeRs);
    		return bookingRs;
    	}
    	return null;
    }    
    
    /***
     * Carga de las rutas de A2BTransfer...
     */
    public String loadRoutes(){
    	log.info("Se va a llamar al método de lectura de rutas");
    	com.epl.a2btransfer.xto.Route route = new com.epl.a2btransfer.xto.Route();
    	route.setTransferOnly(new com.epl.a2btransfer.xto.Route.TransferOnly());
    	route.getTransferOnly().setCacheRoutes(new com.epl.a2btransfer.xto.Route.TransferOnly.CacheRoutes());
    	route.getTransferOnly().getCacheRoutes().setRequest(new com.epl.a2btransfer.xto.Route.TransferOnly.CacheRoutes.Request());
    	route.getTransferOnly().getCacheRoutes().getRequest().setUsername(username);
    	route.getTransferOnly().getCacheRoutes().getRequest().setPassword(password);
    	ResponseEntity<Route> response = restTemplate.postForEntity(url, route, Route.class);
    	if (response.getStatusCode().is2xxSuccessful())
    		log.info("Se ha finalizado con el proceso de carga de rutas");
    	return "OK";
    }
    
    /**
     * Carga de las localizaciones de A2BTransfer en ETOUR.
     * @return
     */
    public String loadLocations(){
    	log.info("Se va a llamar al método de lectura de localizaciones");
    	com.epl.a2btransfer.xto.LocationRq locationRq = new com.epl.a2btransfer.xto.LocationRq();
    	locationRq.setTransferOnly(new com.epl.a2btransfer.xto.LocationRq.TransferOnly());
    	locationRq.getTransferOnly().setCacheLocations(new LocationRq.TransferOnly.CacheLocations());
    	locationRq.getTransferOnly().getCacheLocations().setRequest(new LocationRq.TransferOnly.CacheLocations.Request());
    	locationRq.getTransferOnly().getCacheLocations().getRequest().setUsername(username);
    	locationRq.getTransferOnly().getCacheLocations().getRequest().setPassword(password);
    	locationRq.getTransferOnly().getCacheLocations().getRequest().setLang("ES");
    	ResponseEntity<LocationRs> response = restTemplate.postForEntity(url, locationRq, LocationRs.class);
    	if (response.getStatusCode().is2xxSuccessful())
    		log.info("Se ha finalizado con el proceso de carga de localizaciones");
    	return "OK";
    }
    
    @Description("Busca los gastos de cancelación de una ruta")
    public CancelFeeRs cancelFees(String BookingRef){
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
    	ResponseEntity<CancelFeeRs> response = restTemplate.postForEntity(url, cancelFeeRq, CancelFeeRs.class);
    	if (response.getStatusCode().is2xxSuccessful())
    		log.info("Se ha finalizado con el proceso de consulta de Fees");
    	return response.getBody();
    }
    
}

