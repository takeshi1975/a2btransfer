package com.epl.a2btransfer.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.epl.a2btransfer.model.AvailRq;
import com.epl.a2btransfer.model.AvailRs;


@Service
public class QueryService {

    private static final Logger logger = Logger.getLogger(QueryService.class);
	          
    private String url= "http://test.xmlp2p.com/xml/";
        
    
    public AvailRs avail(AvailRq request){
    	String xml = request.toXML();
    	logger.info("=========================  avail ========================= ");
    	RestTemplate restTemplate = new RestTemplate();
    	List<ClientHttpRequestInterceptor> listInterceptors = new ArrayList<ClientHttpRequestInterceptor>();
    	
    	listInterceptors.add(new LoggingRequestInterceptor());
    	restTemplate.setInterceptors(listInterceptors);
    	
    	ResponseEntity<AvailRs> response =  restTemplate.postForEntity(url, xml, AvailRs.class);
    	if (response.getStatusCode().is2xxSuccessful()){
    		logger.info("========================= fin del avail =========================");
    		return response.getBody();
    	}  
    	else throw new RuntimeException(response.getStatusCode().getReasonPhrase());
    	
    }
    
}

