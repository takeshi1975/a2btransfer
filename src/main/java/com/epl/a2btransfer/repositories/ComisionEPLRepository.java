package com.epl.a2btransfer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.epl.a2btransfer.dto.ComisionEPL;

public interface ComisionEPLRepository extends CrudRepository<ComisionEPL, Long>, NativeEPLComisionDao {

	
}
