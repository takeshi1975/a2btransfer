package com.testepl.a2btransfer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import com.epl.a2btransfer.Application;
import com.epl.a2btransfer.dto.Agency;
import com.epl.a2btransfer.printer.SecondPage;
import com.epl.a2btransfer.repositories.AgencyRepository;
import com.epl.a2btransfer.xto.AvailRq;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly.Availability;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly.Availability.Request;
import com.epl.a2btransfer.xto.AvailRs;
import com.epl.a2btransfer.xto.BookingRq;
import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.CancelRq;
import com.epl.a2btransfer.xto.CancelRq.TransferOnly.Booking.Cancel;
import com.epl.a2btransfer.xto.CancelRs;
import com.epl.a2btransfer.xto.Errors;
import com.epl.a2btransfer.xto.PrintRq;
import com.epl.a2btransfer.xto.ReserveRq;
import com.epl.a2btransfer.xto.ReserveRs;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class AvailTest {

	private final long AGEN = 1329;
	private final long SYS = 84;

	@Value("${app.name}")
	private String appname;

	@Autowired
	private AgencyRepository agencyRepository;

	
	
	private String port = "8080";
	private String host = "localhost";
	// private String host = "34.251.215.240"; // PROD
	// private String host="34.253.173.28"; // STG
	
	// private String host="doraemon.com";
	// private String port="8080/a2btransfer-1.0";
	
	private final static String NEWFORMAT = "NEWFORMAT";

	@Autowired
	private RestTemplate restTemplate;

	private static final Logger log = Logger.getLogger(AvailTest.class);

	private AvailRs availWithDates() {
		log.info("Se pide disponibilidad por fechas");
		log.info("App Name-->" + appname);
		String url = "http://" + host + ":" + port + "/a2btransfer/avail";
		AvailRq availRq = new AvailRq();
		availRq.setVersion("NEWFORMAT");
		availRq.setAgency(AGEN);
		availRq.setSystem(SYS);
		TransferOnly transferOnly = new TransferOnly();
		availRq.setTransferOnly(transferOnly);
		Availability availability = new Availability();
		transferOnly.setAvailability(availability);
		Request request = new Request();
		availability.setRequest(request);
		request.setAdults((byte) 2);
		request.setChildren((byte) 1);
		request.setInfants((byte) 1);
		request.setArrDate("01/09/17");
		request.setArrTime("10:00");
		request.setRetDate("10/09/17");
		request.setRetTime("10:00");
		request.setDeparturePointCode("PMI");
		request.setArrivalPointCode("AAZ");
		request.setLang("ES");
		request.setUsername("Juacho");
		request.setPassword("Juancho123");
		request.setVehicletype((byte) 0);
		request.setSectorType("SINGLE"); // SINGLE/RETURN
		request.setLatitude("");
		request.setLongitude("");
		request.setGIATAID("");
		request.setTTICode("");
		AvailRs availRs = restTemplate.postForObject(url, availRq, AvailRs.class);
		Assert.notNull(availRs);
		if (availRs.getTransferOnly().getErrors() != null)
			for (Errors.Error error : availRs.getTransferOnly().getErrors().getError()) {
				log.error(error.getText());
			}
		else
			log.info("OK No hay errores en la disponibilidad");
		return availRs;
	}

	public ReserveRs bloqueo() {
		AvailRs rs = availWithDates();
		if (rs.getTransferOnly().getErrors() != null) {
			rs.getTransferOnly().getErrors().getError().forEach(message -> log.error(message));
			return null;
		}
		String url = "http://" + host + ":" + port + "/a2btransfer/block";
		int size = rs.getTransferOnly().getAvailability().getAvline().size();
		if (size == 0)
			throw new RuntimeException("No se ha encontrado disponibilidad en el proceso");
		int index = (int) (Math.random() * 10) % size;
		index=0;
		log.info("Se escoge index -->" + index);
		ReserveRq reserveRq = new ReserveRq();
		reserveRq.setAgency(AGEN);
		reserveRq.setSystem(SYS);
		reserveRq.setDate("30/07/17");
		reserveRq.setVersion(NEWFORMAT);
		reserveRq.setTransferOnly(new ReserveRq.TransferOnly());
		reserveRq.getTransferOnly().setBooking(new ReserveRq.TransferOnly.Booking());
		ReserveRq.TransferOnly.Booking.Reserve reserve = new ReserveRq.TransferOnly.Booking.Reserve();
		reserve.setLang("ES");
		reserve.setUsername("Juacho");
		reserve.setPassword("Juancho123");
		reserve.setAdults((byte) 2);
		reserve.setChildren((byte) 1);
		reserve.setInfants((byte) 1);
		reserve.setArrDate("01/09/17");
		reserve.setArrTime("10:00");
		reserve.setRetDate("10/09/17");
		reserve.setRetTime("10:00");
		reserve.setDeparturePointCode("PMI");
		reserve.setArrivalPointCode("AAZ");
		reserve.setLang("ES");
		reserve.setUsername("Juacho");
		reserve.setPassword("Juancho123");
		reserve.setTransferCode(rs.getTransferOnly().getAvailability().getAvline().get(index).getTransferCode());
		reserve.setSectorType("SINGLE");
		reserve.setLatitude("");
		reserve.setLongitude("");
		reserveRq.getTransferOnly().getBooking().setReserve(reserve);
		ReserveRs reserveRs = restTemplate.postForObject(url, reserveRq, ReserveRs.class);
		return reserveRs;
	}

	public BookingRs booking() {

		BookingRq bookingRq = new BookingRq();
		String url = "http://" + host + ":" + port + "/a2btransfer/book";

		bookingRq.setAgency(AGEN);
		bookingRq.setSystem(SYS);

		bookingRq.setTransferOnly(new BookingRq.TransferOnly());
		bookingRq.getTransferOnly().setBooking(new BookingRq.TransferOnly.Booking());
		bookingRq.setVersion(NEWFORMAT);
		bookingRq.setTransferOnly(new BookingRq.TransferOnly());
		bookingRq.getTransferOnly().setBooking(new BookingRq.TransferOnly.Booking());

		bookingRq.getTransferOnly().getBooking().setConfirm(new BookingRq.TransferOnly.Booking.Confirm());
		bookingRq.getTransferOnly().getBooking().getConfirm().setAccommodationAddress("Accomodation Address 1");
		bookingRq.getTransferOnly().getBooking().getConfirm().setAccommodationAddress2("Acoomodation Address 2");
		bookingRq.getTransferOnly().getBooking().getConfirm().setAgentBref("EPL");
		bookingRq.getTransferOnly().getBooking().getConfirm()
				.setClient(new BookingRq.TransferOnly.Booking.Confirm.Client());
		bookingRq.getTransferOnly().getBooking().getConfirm().getClient().setCountryCode("ES");
		bookingRq.getTransferOnly().getBooking().getConfirm().getClient().setEmail("juanjo.alejandro@gmail");
		bookingRq.getTransferOnly().getBooking().getConfirm().getClient().setFirstName("Juanjo");
		bookingRq.getTransferOnly().getBooking().getConfirm().getClient().setLastName("de Alejandro");
		bookingRq.getTransferOnly().getBooking().getConfirm().getClient().setMobile(34628629988L);
		bookingRq.getTransferOnly().getBooking().getConfirm().getClient().setPhone(34972652489L);
		bookingRq.getTransferOnly().getBooking().getConfirm().getClient().setTitle("Sr");
		bookingRq.getTransferOnly().getBooking().getConfirm().setDepExtraInfo("No extra info");
		bookingRq.getTransferOnly().getBooking().getConfirm().setDepPoint("Casa del cliente");
		bookingRq.getTransferOnly().getBooking().getConfirm().setDepInfo("Information about departure");
		bookingRq.getTransferOnly().getBooking().getConfirm().setPassword("Juancho123");
		bookingRq.getTransferOnly().getBooking().getConfirm().setPropertyName("property name");
		bookingRq.getTransferOnly().getBooking().getConfirm().setRemark("remark");
		bookingRq.getTransferOnly().getBooking().getConfirm().setRetExtraInfo("Ret extra info");
		bookingRq.getTransferOnly().getBooking().getConfirm().setRetInfo("Return info");
		bookingRq.getTransferOnly().getBooking().getConfirm().setRetPoint("Return point");
		bookingRq.getTransferOnly().getBooking().getConfirm().setSendEmailToCustomer((byte) 0x0);
		int transactionNo = this.bloqueo().getTransferOnly().getBooking().getReserve().getTransacNo();
		bookingRq.getTransferOnly().getBooking().getConfirm().setDepInfo("VUE3032");
		bookingRq.getTransferOnly().getBooking().getConfirm().setDepInfo("VUE5598");
		bookingRq.getTransferOnly().getBooking().getConfirm().setDepExtraInfo("Vueling");
		bookingRq.getTransferOnly().getBooking().getConfirm().setRetExtraInfo("Vueling");
		bookingRq.getTransferOnly().getBooking().getConfirm().setTransacNo(transactionNo);
		bookingRq.getTransferOnly().getBooking().getConfirm().setUsername("Juacho");
		BookingRs bookingRs = restTemplate.postForObject(url, bookingRq, BookingRs.class);
		Agency agency = agencyRepository.findOne(AGEN);
		log.info("Datos de la agencia:");
		log.info("Nombre " + agency.getName());
		agency.getAddresses().forEach(address -> {
			log.info(address.getNombreVia() + ", " + address.getPoblacion());
			log.info(address.getTelefono());
		});

		Assert.notNull(bookingRs);
		return bookingRs;
	}

	
	@Test
	public void cancel(){		
		String url = "http://" + host + ":" + port + "/a2btransfer/cancel";
		CancelRq cancelRq = new CancelRq();	
		cancelRq.setTransferOnly(new CancelRq.TransferOnly());
		cancelRq.getTransferOnly().setBooking(new CancelRq.TransferOnly.Booking());
		cancelRq.getTransferOnly().getBooking().setCancel(new Cancel());
		
		cancelRq.getTransferOnly().getBooking().getCancel().setUsername("Juacho");
		cancelRq.getTransferOnly().getBooking().getCancel().setPassword("Juancho123");		
		cancelRq.setVersion(NEWFORMAT);
					
		BookingRs bookingRs = booking();
		cancelRq.getTransferOnly().getBooking().getCancel().setBookingRef(bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().getBookingRef());		
		CancelRs cancelRs = restTemplate.postForObject(url, cancelRq, CancelRs.class);
		Assert.notNull(cancelRs);
	} 	
	
	public static List<String> conversion(List<String> buffer) throws IOException{
		Logger log = Logger.getLogger(SecondPage.class);
		List<String> text = new ArrayList<String>();
		BufferedReader br = null;		
		try{						
			for(String line:buffer){	
				log.info("Input ->"+line);
				line = StringEscapeUtils.unescapeHtml(line);
				int position=-1;
				while ((position = line.indexOf("&#"))>-1){
					int posend = position;
					while (line.charAt(posend)!=';') 
						posend++;
					String sub = line.substring(position+2, posend);
					char x = (char) Integer.valueOf(sub).intValue();
					String replace = new String(new char[]{x});
					line = line.replaceAll("&#"+sub+";", replace);
				}
				log.info("Output ->"+line);
				if (!line.trim().equals("")){
					System.out.println(line);
					text.add(line);
				}						
			}
			text.add(" ");
			text.add(" ");
		} finally{
			if (br!=null)
				br.close();
		}
		return text;
	}
	
	@Test
	public void testBooking() throws IOException {
		BookingRs bookingRs = booking();		
		PrintRq printRq = new PrintRq();		
		printRq.setAgency(AGEN);
		printRq.setLocata("202348239");
		printRq.setTransferOnly(bookingRs.getTransferOnly());
		String xml = printRq.toString();				
		xml = xml.replaceAll("<string>", "").replaceAll("</string>", "");
		log.info("PrintRq:"+xml);
		
		String url = "http://" + host + ":" + port + "/a2btransfer/print";
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();	
	    messageConverters.add(new StringHttpMessageConverter());	
	    restTemplate.setMessageConverters(messageConverters);	    
		HttpHeaders headers = new HttpHeaders();
		MediaType mediaType = new MediaType("application", "xml", StandardCharsets.UTF_8);
		headers.setContentType(mediaType);
		//headers.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> entity = new HttpEntity<String>(xml,headers);		
		ResponseEntity<byte[]> response = restTemplate.exchange(url,
				HttpMethod.POST, entity, byte[].class, "1");		
		if (response.getStatusCode() == HttpStatus.OK) {
			Files.write(Paths.get("fichero2.pdf"), response.getBody());
		}
	}

}