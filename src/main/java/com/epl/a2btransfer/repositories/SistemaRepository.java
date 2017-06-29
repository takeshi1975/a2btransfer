package com.epl.a2btransfer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epl.a2btransfer.dto.Sistema;

@Repository
public interface SistemaRepository extends CrudRepository<Sistema, Long>{

}
