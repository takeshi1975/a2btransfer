package com.epl.a2btransfer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.epl.a2btransfer.dto.ComisionEPL;
import com.epl.a2btransfer.dto.ComisionEPLId;

public interface ComisionEPLRepository extends CrudRepository<ComisionEPL, ComisionEPLId>, NativeEPLComisionDao {

	
}
