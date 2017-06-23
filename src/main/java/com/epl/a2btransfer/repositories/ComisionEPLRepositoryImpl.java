package com.epl.a2btransfer.repositories;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.epl.a2btransfer.exception.NotApplicableException;

public class ComisionEPLRepositoryImpl implements NativeEPLComisionDao{
	
	final String sqlString = "SELECT valoracion_pcm.find_pcm(:cliente, :sistema, :fecha) FROM DUAL";
	
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public long findComission(long cliente, long sistema, Date fecha) throws NotApplicableException {
		BigDecimal result =(BigDecimal) em.createNativeQuery(sqlString)
								.setParameter("fecha",fecha)							
								.setParameter("sistema",sistema)
								.setParameter("cliente",cliente)
								.getSingleResult();
		
		if (result==null)
			throw new NotApplicableException(); // No hay resultados o existe colisión...		
		return result.longValue();
	}				 		
	
}
