package com.epl.a2btransfer.repositories;

import java.util.Date;

import com.epl.a2btransfer.exception.NotApplicableException;


/** 
 * Datos que impone la comisión EPL
 * @author Juanjo
 */
public interface NativeEPLComisionDao {
	
	public boolean isNeto();
	
	public Long getId();
	
	public void findComission(long cliente, long sistema, Date fecha) 
			throws NotApplicableException;
			
	
	
}
