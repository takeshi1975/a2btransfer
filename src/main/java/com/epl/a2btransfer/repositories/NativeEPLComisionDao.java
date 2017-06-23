package com.epl.a2btransfer.repositories;

import java.util.Date;

import com.epl.a2btransfer.exception.NotApplicableException;


/** 
 * Datos que impone la comisión EPL
 * @author Juanjo
 */
public interface NativeEPLComisionDao {
				
	public long findComission(long cliente, long sistema, Date fecha) 
			throws NotApplicableException;
			
}
