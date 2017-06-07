package com.epl.a2btransfer.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.epl.a2btransfer.components.CustomLocHttpMessageConverter;
import com.epl.a2btransfer.components.CustomRouteHttpMessageConverter;
import com.epl.a2btransfer.inteceptor.LoggingRequestInterceptor;

@Component
public class AppConfig {
	
	private final static Logger log = Logger.getLogger(AppConfig.class);
	
	@Autowired
	private CustomRouteHttpMessageConverter routeHttpMessageConverter;
	
	@Autowired 
	private CustomLocHttpMessageConverter locHttpMessageConverter;
    
			
	/**	 
	 * Creación de la plantilla Restful.
	 * @return
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		log.info("Configuración de la plantilla para WS-RESTful");
		RestTemplate restTemplate = new RestTemplate(
				new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
		List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
		interceptors.add(new LoggingRequestInterceptor());
		restTemplate.setInterceptors(interceptors);
		restTemplate.getMessageConverters().clear();
		restTemplate.getMessageConverters().add(0, routeHttpMessageConverter); // Añado un conversor propio para leer múltiples datos.
		restTemplate.getMessageConverters().add(1, locHttpMessageConverter);
		restTemplate.getMessageConverters().add(2, new Jaxb2RootElementHttpMessageConverter());		
		return restTemplate;
	}

}
