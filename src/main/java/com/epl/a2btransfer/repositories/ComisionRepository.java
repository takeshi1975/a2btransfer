package com.epl.a2btransfer.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.epl.a2btransfer.dto.Comision;

public interface ComisionRepository extends CrudRepository<Comision, Long> {

	final String SQL_COMISION = "select com from Comision com where :fecha between com.fecha1 and com.fecha2";	
	
	@Query(SQL_COMISION)
	List<Comision> findComision(@Param("fecha") Date fecha);
	
}
