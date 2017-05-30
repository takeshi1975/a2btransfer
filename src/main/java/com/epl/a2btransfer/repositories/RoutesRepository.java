package com.epl.a2btransfer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epl.a2btransfer.dto.Route;

@Repository
public interface RoutesRepository extends CrudRepository<Route, Long>{

	public <Routext extends Route> Routext save(Routext entity);		
	public void deleteAll();
	
}
