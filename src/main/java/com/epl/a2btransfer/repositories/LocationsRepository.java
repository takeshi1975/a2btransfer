package com.epl.a2btransfer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epl.a2btransfer.dto.Location;

@Repository
public interface LocationsRepository extends CrudRepository<Location, String>{

	public <Locationext extends Location> Locationext save(Locationext entity);	
	public void deleteAll();
	
}
