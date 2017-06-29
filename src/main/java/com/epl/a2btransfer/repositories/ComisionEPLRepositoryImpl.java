package com.epl.a2btransfer.repositories;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Types;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

import com.epl.a2btransfer.exception.NotApplicableException;

public class ComisionEPLRepositoryImpl implements NativeEPLComisionDao{
		
	private String neto;
	private Long id;
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean isNeto(){
		return neto.equals("S");
	}
	
	@Override
	public Long getId(){
		return id;
	}
	
	@Override
	public void findComission(long cliente, long sistema, Date fecha) throws NotApplicableException {
		
		Session session = em.unwrap( Session.class );
		id = session.doReturningWork( 
		    connection -> {
		    try (CallableStatement function = connection
		        .prepareCall(
		            "{ ? = call valoracion_pcm.valoracion_com_epl(?,?,?,?) }" )) {
		        function.registerOutParameter( 1, Types.INTEGER );
		        function.setLong( 2, cliente );
		        function.setLong(3, sistema);
		        function.setDate(4, new java.sql.Date(fecha.getTime()));
		        function.registerOutParameter(5, Types.VARCHAR);
		        function.execute();
		        id = function.getLong(1);
		        neto = function.getString(5);
		        return id;
		    }		    
		});		
	}				 		
	
}
