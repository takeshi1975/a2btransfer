package com.epl.a2btransfer.repositories;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.epl.a2btransfer.exception.NotApplicableException;

public class AgencyRepositoryImpl implements NativeAgencyComisionDao {

	private final static Logger log = Logger.getLogger(AgencyRepositoryImpl.class);
	
	final String sqlString = "SELECT valoracion_pcm.valoracion_com(:cliente, :sistema, :fecha) FROM DUAL";
	final String sqlComissionValue = "SELECT com FROM COMISION WHERE ID=:comisionId";
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public long findCustomerComision(long cliente, long sistema, Date fecha) throws NotApplicableException {
		BigDecimal result =(BigDecimal) em.createNativeQuery(sqlString)
								.setParameter("cliente",cliente)				
								.setParameter("sistema",sistema)
								.setParameter("fecha",fecha)																							
								.getSingleResult();
		
		if (result==null)
			throw new NotApplicableException(); // No hay resultados o existe colisión...		
		return result.longValue();
	}
	
	@Override
	public float findComissionValue(long comissionId){
		BigDecimal response =  (BigDecimal) em.createNativeQuery(sqlComissionValue)
						 .setParameter("comisionId", comissionId)
						 .getSingleResult();
		log.info("Respuesta de comisión de cliente "+response.floatValue());
		return response.floatValue();
	}
	
}
