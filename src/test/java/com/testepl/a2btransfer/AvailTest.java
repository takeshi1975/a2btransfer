package com.testepl.a2btransfer;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.epl.a2btransfer.Application;
import com.epl.a2btransfer.xto.AvailRq;
import com.epl.a2btransfer.xto.AvailRs;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly.Availability;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly.Availability.Request;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class AvailTest {

	@Autowired
	private TestRestTemplate restTemplate;
	private static final Logger log = Logger.getLogger(AvailTest.class);

	private HttpEntity<String> getHttpEntity(String body) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> request = new HttpEntity<String>(body, headers);
		return request;
	}

	@Test
	public void testAvailWithDates() {
//		log.info("Se pide disponibilidad por fechas");
//		String url = "/a2btransfer/avail";
//		// url = "http://test.xmlp2p.com/xml/";
//		AvailRq availRq = new AvailRq();
//		availRq.setVersion("NEWFORMAT");
//		TransferOnly transferOnly = new TransferOnly();
//		Availability availability = new Availability();
//		transferOnly.setAvailability(availability);
//		Request request = new Request();
//		availability.setRequest(request);
//		availRq.setTransferOnly(transferOnly);
//		request.setAdults((byte) 2);
//		request.setChildren((byte) 1);
//		request.setInfants((byte) 1);
//		request.setArrDate("25/05/17");
//		request.setArrTime("09:15");
//		request.setRetDate("10/06/17");
//		request.setRetTime("09:15");
//		request.setDeparturePointCode("PMI");
//		request.setArrivalPointCode("ARE");
//		request.setLang("ES");
//		request.setUsername("Juacho");
//		request.setPassword("Juancho123");
//		request.setVehicletype((byte) 0);
//		request.setSectorType("RETURN");
//		request.setLatitude("");
//		request.setLongitude("");		
//		
//		request.setGIATAID("");
//		request.setTTICode("");
//		String xml = availRq.toString();
//		log.info(xml);
//		restTemplate.getMessageConverters().add(0, new org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter());
//		ResponseEntity<AvailRs> response = this.restTemplate.postForEntity(url, this.getHttpEntity(xml), AvailRs.class);
//		Assert.assertNotNull(response);
//		AvailRs availRs = response.getBody();
//		if (response.getStatusCode().is2xxSuccessful()) {
//			for (AvailRs.TransferOnly.Availability.Avline avail : availRs.getTransferOnly().getAvailability()
//					.getAvline()) {
//				log.info(avail.getTransferTotalPrice() + " " + avail.getCurrencyCode());
//			}
//		}
	}
}