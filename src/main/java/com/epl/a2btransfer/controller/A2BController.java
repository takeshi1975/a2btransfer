package com.epl.a2btransfer.controller;

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.epl.a2btransfer.xto.AvailRq;
import com.epl.a2btransfer.xto.AvailRs;
import com.epl.a2btransfer.xto.BookingRq;
import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.CancelFeeRq;
import com.epl.a2btransfer.xto.CancelFeeRs;
import com.epl.a2btransfer.xto.Errors;
import com.epl.a2btransfer.xto.ReserveRq;
import com.epl.a2btransfer.xto.ReserveRs;

@RestController
@RequestMapping("/a2btransfer")
public class A2BController {

	private final Logger log = Logger.getLogger(A2BController.class);

	@Autowired
	private com.epl.a2btransfer.services.A2BTransferClientService client;

	@RequestMapping(value = "/avail", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public AvailRs avail(@RequestBody AvailRq availRq) {
		log.info("====================== Avail Controller ======================");
		return client.avail(availRq);
	}

	@RequestMapping(value = "/block", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public ReserveRs block(@RequestBody ReserveRq reserveRq) {
		log.info("====================== Avail Controller ======================");
		return client.block(reserveRq);
	}

	@RequestMapping(value = "/book", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public BookingRs book(@RequestBody BookingRq bookingRq) {
		log.info("====================== Avail Controller ======================");
		return client.booking(bookingRq);
	}

	// Conversión de dos variable que son casi iguales...
	ReserveRq.TransferOnly.Booking.Reserve fromReserve(AvailRq.TransferOnly.Availability.Request reserve)
			throws ReflectiveOperationException {
		ReserveRq.TransferOnly.Booking.Reserve result = new ReserveRq.TransferOnly.Booking.Reserve();
		for (Field f2 : AvailRq.TransferOnly.Availability.Request.class.getDeclaredFields()) {
			Field f1 = ReserveRq.TransferOnly.Booking.Reserve.class.getDeclaredField(f2.getName());
			f1.set(result, f2.get(reserve));
		}
		return result;
	}

	private BookingRs fixErrors(Errors errors) {
		BookingRs bookingRs = new BookingRs();
		bookingRs.setTransferOnly(new BookingRs.TransferOnly());
		bookingRs.getTransferOnly().setErrors(errors);
		return bookingRs;
	}

	@RequestMapping(value = "/bookCheapest", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public BookingRs bookCheapest(@RequestBody AvailRq availRq) {
		log.info("====================== Avail Controller ======================");
		// AvailRq availRq = getDefaultAvailRq();
		AvailRs availRs = client.avail(availRq);
		if (availRs.getTransferOnly().getErrors() != null)
			return fixErrors(availRs.getTransferOnly().getErrors());
		String transferCode = availRs.getTransferOnly().getAvailability().getAvline().get(0).getTransferCode();
		AvailRq.TransferOnly.Availability.Request request = availRq.getTransferOnly().getAvailability().getRequest();
		ReserveRq reserveRq = new ReserveRq();
		reserveRq.setVersion(availRq.getVersion());
		reserveRq.setTransferOnly(new ReserveRq.TransferOnly());
		reserveRq.getTransferOnly().setBooking(new ReserveRq.TransferOnly.Booking());
		reserveRq.getTransferOnly().getBooking().setReserve(new ReserveRq.TransferOnly.Booking.Reserve());
		// Bloqueo
		reserveRq.getTransferOnly().getBooking().getReserve().setAdults(request.getAdults());
		reserveRq.getTransferOnly().getBooking().getReserve().setArrDate(request.getArrDate());
		reserveRq.getTransferOnly().getBooking().getReserve().setArrTime(request.getArrTime());
		reserveRq.getTransferOnly().getBooking().getReserve().setArrivalPointCode(request.getArrivalPointCode());
		reserveRq.getTransferOnly().getBooking().getReserve().setChildren(request.getChildren());
		reserveRq.getTransferOnly().getBooking().getReserve().setDeparturePointCode(request.getDeparturePointCode());
		reserveRq.getTransferOnly().getBooking().getReserve().setGIATAID(request.getGIATAID());
		reserveRq.getTransferOnly().getBooking().getReserve().setInfants(request.getInfants());
		reserveRq.getTransferOnly().getBooking().getReserve().setLang(request.getLang());
		reserveRq.getTransferOnly().getBooking().getReserve().setLatitude(request.getLatitude());
		reserveRq.getTransferOnly().getBooking().getReserve().setLongitude(request.getLongitude());
		reserveRq.getTransferOnly().getBooking().getReserve().setPassword(request.getPassword());
		reserveRq.getTransferOnly().getBooking().getReserve().setRetDate(request.getRetDate());
		reserveRq.getTransferOnly().getBooking().getReserve().setRetTime(request.getRetTime());
		reserveRq.getTransferOnly().getBooking().getReserve().setSectorType(request.getSectorType());
		reserveRq.getTransferOnly().getBooking().getReserve().setTransferCode(transferCode);
		reserveRq.getTransferOnly().getBooking().getReserve().setTTICode(request.getTTICode());
		reserveRq.getTransferOnly().getBooking().getReserve().setUsername(request.getUsername());
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		try {
			date = df.parse(request.getArrDate());
		} catch (Exception ex) {
			// Nothing to do...
		}
		ReserveRs reserveRs = client.block(reserveRq);
		// Reserva
		if (reserveRs.getTransferOnly().getErrors() != null)
			return fixErrors(reserveRs.getTransferOnly().getErrors());
		int transactionNumber = reserveRs.getTransferOnly().getBooking().getReserve().getTransacNo();
		BookingRq bookingRq = new BookingRq();
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
		bookingRq.getTransferOnly().getBooking().getConfirm().setPassword(request.getPassword());
		bookingRq.getTransferOnly().getBooking().getConfirm().setPropertyName("property name");
		bookingRq.getTransferOnly().getBooking().getConfirm().setRemark("remark");
		bookingRq.getTransferOnly().getBooking().getConfirm().setRetExtraInfo("Ret extra info");
		bookingRq.getTransferOnly().getBooking().getConfirm().setRetInfo("Return info");
		bookingRq.getTransferOnly().getBooking().getConfirm().setRetPoint("Return point");
		bookingRq.getTransferOnly().getBooking().getConfirm().setSendEmailToCustomer((byte) 0x0);
		bookingRq.getTransferOnly().getBooking().getConfirm().setTransacNo(transactionNumber);
		bookingRq.getTransferOnly().getBooking().getConfirm()
				.setUsername(availRq.getTransferOnly().getAvailability().getRequest().getUsername());
		BookingRs bookingRs = client.booking(bookingRq);
		return bookingRs;
	}

	@RequestMapping(value = "/loadRoutes", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String routes() {
		return client.loadRoutes();
	}

	@RequestMapping(value = "/loadLocations", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String locations() {
		return client.loadLocations();
	}

	@RequestMapping(value = "/cancelFees", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public CancelFeeRs cancelFees(@RequestBody CancelFeeRq cancelFeeRq) {
		String bookingRef = cancelFeeRq.getTransferOnly().getBooking().getCancelFees().getBookingRef();
		return client.cancelFees(bookingRef);
	}

}
