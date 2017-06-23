package com.epl.a2btransfer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.epl.a2btransfer.dto.Agency;

/**
 * Repositorio para agencia y comisiones de agencia/cliente
 * @author Juanjo
 *
 */
public interface AgencyRepository extends CrudRepository<Agency, Long>, NativeAgencyComisionDao {
		
	
}
