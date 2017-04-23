package com.epl.a2btransfer.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.epl.a2btransfer.model.AvailRq;


@RestController
@RequestMapping("/a2btransfer")
@ComponentScan({"com.epl.a2btransfer.services"})
public class A2BController {

	private final Logger log =Logger.getLogger(A2BController.class);
			
	@Autowired
	private com.epl.a2btransfer.services.Availability availability; 
		
	// <Username>myusername</Username> <Password>mypassword</Password> <Lang>EN</Lang> <DeparturePointCode>PMI</DeparturePointCode> <ArrivalPointCode>ARE</ArrivalPointCode> <SectorType>RETURN</SectorType> <ArrDate>30/07/15</ArrDate> <ArrTime>10:00</ArrTime> <RetDate>10/08/15</RetDate> <RetTime>10:00</RetTime> <Adults>2</Adults> <Children>0</Children> <Infants>0</Infants> <Vehicletype>0</Vehicletype> <Latitude></Latitude> <Longitude></Longitude> <TTICode></TTICode> <GIATA_ID></GIATA_ID>
	
	private AvailRq getDefaultAvailRq(){
		AvailRq availRq = new AvailRq();
		
		return availRq;
	}
	
	@Transactional
	@RequestMapping(value="/avail",method=RequestMethod.POST, produces=MediaType.APPLICATION_XML_VALUE, consumes=MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String avail(@RequestBody AvailRq availRq){
		log.info("====================== Avail Controller ======================");
		//AvailRq availRq = getDefaultAvailRq();
		availability.avail(availRq);		
		log.info("====================== End Avail Controller ======================");
		return "<Response>OK</Response>";
	}
}
