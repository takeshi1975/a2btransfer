package com.testepl.a2btransfer;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import com.epl.a2btransfer.Application;
import com.epl.a2btransfer.dto.Agency;
import com.epl.a2btransfer.repositories.AgencyRepository;
import com.epl.a2btransfer.xto.AvailRq;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly.Availability;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly.Availability.Request;
import com.epl.a2btransfer.xto.AvailRs;
import com.epl.a2btransfer.xto.BookingRq;
import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.Errors;
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
	
	//@Value("${local.server.port}")
	private String port="8080/a2btransfer-1.0";
	//private String port="8080";
	//private String host="localhost";
	private String host="34.253.173.28";
	//private String host="doraemon.com"
	
	private final static String NEWFORMAT = "NEWFORMAT"; 
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final Logger log = Logger.getLogger(AvailTest.class);
	
	private AvailRs availWithDates() {
		log.info("Se pide disponibilidad por fechas");
		log.info("App Name-->"+appname);
		String url = "http://"+host+":"+port+"/a2btransfer/avail";
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
		request.setArrivalPointCode("ARE");
		request.setLang("ES");
		request.setUsername("Juacho");
		request.setPassword("Juancho123");
		request.setVehicletype((byte) 0);
		request.setSectorType("RETURN");
		request.setLatitude("");
		request.setLongitude("");		
		
		request.setGIATAID("");
		request.setTTICode("");		
		AvailRs availRs = restTemplate.postForObject(url, availRq, AvailRs.class);
		Assert.notNull(availRs);	
		if (availRs.getTransferOnly().getErrors()!=null)
			for (Errors.Error error : availRs.getTransferOnly().getErrors().getError()){
				log.error(error.getText());
			}
		else log.info("OK No hay errores en la disponibilidad");
		return availRs;
	}			
	
	public ReserveRs bloqueo(){
		AvailRs rs = availWithDates();
		if (rs.getTransferOnly().getErrors()!=null){
			rs.getTransferOnly().getErrors().getError().forEach(message->log.error(message));
			return null;
		}
		String url = "http://"+host+":"+port+"/a2btransfer/block";
		int size = rs.getTransferOnly().getAvailability().getAvline().size();	
		if (size==0)
			throw new RuntimeException("No se ha encontrado disponibilidad en el proceso");
		int index = (int) (Math.random()*10) % size;
		log.info("Se escoge index -->" +index);
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
		reserve.setArrDate("30/07/17");
		reserve.setArrTime("10:00");
		reserve.setRetDate("10/08/17");
		reserve.setRetTime("10:00");
		reserve.setDeparturePointCode("PMI");
		reserve.setArrivalPointCode("ARE");
		reserve.setLang("ES");
		reserve.setUsername("Juacho");
		reserve.setPassword("Juancho123");
		reserve.setTransferCode(rs.getTransferOnly().getAvailability().getAvline().get(index).getTransferCode());
		reserve.setSectorType("RETURN");
		reserve.setLatitude("");
		reserve.setLongitude("");
		reserveRq.getTransferOnly().getBooking().setReserve(reserve);
		ReserveRs reserveRs = restTemplate.postForObject(url, reserveRq,ReserveRs.class);
		return reserveRs;
	}
	
	public BookingRs booking(){
		
		BookingRq bookingRq = new BookingRq();
		String url = "http://"+host+":"+port+"/a2btransfer/book";
		
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
		bookingRq.getTransferOnly().getBooking().getConfirm().getClient().setMobile(628629988L);
		bookingRq.getTransferOnly().getBooking().getConfirm().getClient().setPhone(972652489L);
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
		
		bookingRq.getTransferOnly().getBooking().getConfirm().setTransacNo(transactionNo);
		bookingRq.getTransferOnly().getBooking().getConfirm()
				.setUsername("Juacho");
		BookingRs bookingRs = restTemplate.postForObject(url,bookingRq, BookingRs.class);
		Agency agency = agencyRepository.findOne(AGEN);
		log.info("Datos de la agencia:");
		log.info("Nombre "+agency.getName());
		agency.getAddresses().forEach(address->{ 
			log.info(address.getNombreVia()+", "+address.getPoblacion());
			log.info(address.getTelefono());
		});
		
		Assert.notNull(bookingRs);
		bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().getJoiningIns().getJoinline().forEach(t->System.out.println(t));
		return bookingRs;
	}
	
	@Test
	public void testBooking(){
		booking();
		log.info("Fin del proceso!!!");
	}
}