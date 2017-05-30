package com.epl.a2btransfer;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.epl.a2btransfer.xto.AvailRq;
import com.epl.a2btransfer.xto.AvailRs;
import com.epl.a2btransfer.xto.Errors;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly.Availability;
import com.epl.a2btransfer.xto.AvailRq.TransferOnly.Availability.Request;

@SpringBootApplication
@ComponentScan({"com.epl.a2btransfer.controller",
				"com.epl.a2btransfer.services", 
				"com.epl.a2btransfer.repositories",
				"com.epl.a2btransfer.components"})
public class Application {

	private final static Logger log = Logger.getLogger(Application.class);
	
	@Autowired
	private com.epl.a2btransfer.controller.A2BController client;	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
		
	@Bean
	public CommandLineRunner fullBooking(ApplicationContext ctx){
		return args -> {			
			log.info("Se va a llamar al metodo de fullBooking");
			AvailRq availRq = new AvailRq();
        	availRq.setVersion("NEWFORMAT");
    		TransferOnly transferOnly = new TransferOnly();
    		Availability availability = new Availability();
    		transferOnly.setAvailability(availability);
    		Request request = new Request();
    		availability.setRequest(request);
    		availRq.setTransferOnly(transferOnly);
    		request.setAdults((byte) 2);
    		request.setChildren((byte) 1);
    		request.setInfants((byte) 1);
    		request.setArrDate("26/05/17");
    		request.setArrTime("09:15");
    		request.setRetDate("11/06/17");
    		request.setRetTime("09:15");
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
    		client.locations();
			client.routes();
			log.info("Fin de la aplicación");
		};
	}
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
        	log.info("Se ha iniciado la aplicación");
        	AvailRq availRq = new AvailRq();
        	availRq.setVersion("NEWFORMAT");
    		TransferOnly transferOnly = new TransferOnly();
    		Availability availability = new Availability();
    		transferOnly.setAvailability(availability);
    		Request request = new Request();
    		availability.setRequest(request);
    		availRq.setTransferOnly(transferOnly);
    		request.setAdults((byte) 2);
    		request.setChildren((byte) 1);
    		request.setInfants((byte) 1);
    		request.setArrDate("26/05/17");
    		request.setArrTime("09:15");
    		request.setRetDate("11/06/17");
    		request.setRetTime("09:15");
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
        	AvailRs availRs = client.avail(availRq);
        	if (availRs.getTransferOnly().getErrors()!=null){
        		for (Errors.Error error: availRs.getTransferOnly().getErrors().getError()){
        			log.info(error.getText());
        		}
        	} else 
        	if (availRs!=null)
    			for (AvailRs.TransferOnly.Availability.Avline avail : availRs.getTransferOnly().getAvailability()
    					.getAvline()) {
    				log.info(avail.getTransferTotalPrice() + " " + avail.getCurrencyCode());
    			}    		
        	log.info("Fin de la aplicación");
        };
	}
}
