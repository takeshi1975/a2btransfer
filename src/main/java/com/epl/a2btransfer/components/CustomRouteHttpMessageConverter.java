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

import com.epl.a2btransfer.dto.Route;
import com.epl.a2btransfer.repositories.RoutesRepository;

@Component
public class CustomRouteHttpMessageConverter implements GenericHttpMessageConverter<Route> {

	private final static Logger log = Logger.getLogger(CustomRouteHttpMessageConverter.class);
	private final XMLInputFactory inputFactory = createXmlInputFactory();
	
	@Autowired
	private RoutesRepository routesRepository;

	@Override
	public boolean canRead(Class<?> clazz, MediaType mediaType) {
		boolean accepted = true;
		accepted = mediaType == null || (mediaType.getType().equals("text") && mediaType.getSubtype().equals("xml"));
		accepted = accepted && clazz.equals(Route.class);
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
	
	private void performPersistence(com.epl.a2btransfer.dto.Route route){
		try{
			routesRepository.save(route);
		}catch(Exception ex){
			log.warn("Error en la consolidación de la ruta", ex);
		}
	}

	@Override
	public Route read(Class<? extends Route> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		int id = 0;
		final String TAG_ROUTE = "Route";
		final String ATTR_FROM = "CodeFrom";
		final String ATTR_TO = "CodeTo";
		com.epl.a2btransfer.dto.Route route = null;
		routesRepository.deleteAll(); // Borramos todos los datos.
		try {
			XMLStreamReader xmlStreamReader = inputFactory.createXMLStreamReader(inputMessage.getBody());
			while (xmlStreamReader.hasNext()) {
				int eventType = xmlStreamReader.next();
				switch (eventType) {
				case XMLEvent.START_ELEMENT:
					String tag = xmlStreamReader.getLocalName();
					if (tag.equals(TAG_ROUTE)) {
						route = new com.epl.a2btransfer.dto.Route();
						String from = xmlStreamReader.getAttributeValue(null, ATTR_FROM);
						String to = xmlStreamReader.getAttributeValue(null, ATTR_TO);
						route.setId(++id);
						route.setCodeFrom(from);
						route.setCodeTo(to);
						this.performPersistence(route);
						log.info(route);
					}
					break;
				default:
					break;
				}
			}
		} catch (XMLStreamException e) {
			log.error("Error en la lectura del XML", e);
		}
		log.info("Fin del proceso de lectura del xml");
		return route; // devuelve el último elemento escrito en la base de datos.
	}

	@Override
	public void write(Route t, MediaType contentType, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canRead(Type type, Class<?> contextClass, MediaType mediaType) {
		log.info(" --> "+type.getTypeName());
		log.info(" --> "+Route.class.getName());
		return (type.getTypeName().equals(Route.class.getName()));
	}

	@Override
	public Route read(Type type, Class<?> contextClass, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		return this.read(null, inputMessage);
	}

	@Override
	public boolean canWrite(Type type, Class<?> clazz, MediaType mediaType) {
		return false;
	}

	@Override
	public void write(Route t, Type type, MediaType contentType, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// Nada
	}

}
