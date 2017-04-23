package com.epl.a2btransfer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epl.a2btransfer.model.AvailRq;
import com.epl.a2btransfer.model.AvailRs;

@Component
public class Availability {
	
	@Autowired 
	private QueryService queryService;

	public AvailRs avail(AvailRq availRq){		 
		return queryService.avail(availRq);
	}
	
   
}
