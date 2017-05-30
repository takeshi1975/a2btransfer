package com.epl.a2btransfer.components;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLResolver;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import com.epl.a2btransfer.dto.Location;
import com.epl.a2btransfer.repositories.LocationsRepository;
import com.epl.a2btransfer.xto.LocationRq;

@Component
public class CustomLocHttpMessageConverter implements GenericHttpMessageConverter<Location> {
	
	private final static Logger log = Logger.getLogger(CustomLocHttpMessageConverter.class);
	
	@Autowired
	private LocationsRepository locationsRepository;
	
	@Override
	public boolean canRead(Class<?> clazz, MediaType mediaType) {
		boolean accepted = true;
		accepted = mediaType==null || (mediaType.getType().equals("text") && mediaType.getSubtype().equals("xml"));
		accepted = accepted && clazz.equals(LocationRq.class);				
		return accepted;					
	}

	@Override
	public boolean canWrite(Class<?> clazz, MediaType mediaType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MediaType> getSupportedMediaTypes() {
	    return new ArrayList<MediaType>();		    								
	}
			
	protected XMLInputFactory createXmlInputFactory() {
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		inputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
		inputFactory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
		inputFactory.setXMLResolver(NO_OP_XML_RESOLVER);
		return inputFactory;
	}


	private static final XMLResolver NO_OP_XML_RESOLVER = new XMLResolver() {
		@Override
		public Object resolveEntity(String publicID, String systemID, String base, String ns) {
			return StreamUtils.emptyInput();
		}
	};

	private void performPersistence(Location location){
		try{
			locationsRepository.save(location);
		}catch(Exception sqlex){
			log.warn("No se ha podido consolidar el registro", sqlex);
		}
	}	
	
	private final XMLInputFactory inputFactory = createXmlInputFactory();
	
	@Override
	public Location read(Class<? extends Location> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		log.info("Se inicia el metodo de lectura de locations");
		final String TAG_LOCATION = "Location";
		final String TAG_CODE = "Code";
		final String TAG_LOCATION_NAME = "LocationName";
		final String TAG_LOCATION_TYPE = "LocationType";
		final String TAG_COUNTRY_CODE = "CountryCode";
		final String TAG_COUNTRY = "Country";
		final String TAG_LATITUDE="Latitude";
		final String TAG_LONGITUDE="Longitude";
		Location location = null;
		locationsRepository.deleteAll(); // Borramos todos los datos.		
		try {				
			XMLStreamReader xmlStreamReader = inputFactory.createXMLStreamReader(inputMessage.getBody());
			while (xmlStreamReader.hasNext()) {
				int eventType = xmlStreamReader.next();				
				switch (eventType) {
				case XMLEvent.START_ELEMENT:
					String tag = xmlStreamReader.getLocalName();
					switch (tag){
					case TAG_LOCATION:
							location = new Location();
							break;
					case TAG_CODE:
							location.setCode(xmlStreamReader.getElementText());
							break;
					case TAG_LOCATION_NAME:
							location.setName(xmlStreamReader.getElementText());
							break;
					case TAG_LOCATION_TYPE:
							location.setType(xmlStreamReader.getElementText());
							break;
					case TAG_COUNTRY_CODE:
							location.setCountryCode(xmlStreamReader.getElementText());
							break;
					case TAG_COUNTRY:
						location.setCountry(xmlStreamReader.getElementText());
							break;
					case TAG_LATITUDE:
							location.setLatitude(Float.valueOf(xmlStreamReader.getElementText()));
							break;
					case TAG_LONGITUDE:
							location.setLongitude(Float.valueOf(xmlStreamReader.getElementText()));
							break;						
					}
					break;
				case XMLEvent.END_ELEMENT:
					String endtag = xmlStreamReader.getLocalName();
					if (endtag.equals(TAG_LOCATION))
						performPersistence(location);							 						
					break;
				default:
					break;
				}
			}
		} catch (XMLStreamException e) {			
			log.error("Error en la lectura del XML", e );
		}
		log.info("Fin del proceso de lectura del xml de locations");
		return location;
	}

	@Override
	public void write(Location t, MediaType contentType, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canRead(Type type, Class<?> contextClass, MediaType mediaType) {
		return (type.getClass()==com.epl.a2btransfer.dto.Route.class);							
	}

	@Override
	public Location read(Type type, Class<?> contextClass, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		return this.read(null, inputMessage);
	}

	@Override
	public boolean canWrite(Type type, Class<?> clazz, MediaType mediaType) { 
		return false;
	}

	@Override
	public void write(Location t, Type type, MediaType contentType, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {			
		// Nada
	}
	
}
