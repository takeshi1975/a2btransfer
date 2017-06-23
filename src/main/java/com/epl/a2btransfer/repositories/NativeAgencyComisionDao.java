package com.epl.a2btransfer.repositories;

import java.util.Date;

import com.epl.a2btransfer.exception.NotApplicableException;

public interface NativeAgencyComisionDao {
	
	long findCustomerComision(long cliente, long sistema, Date fecha) 
			throws NotApplicableException;
	
	public float findComissionValue(long comissionId);
}
