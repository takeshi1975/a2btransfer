package com.epl.a2btransfer.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.epl.a2btransfer.dto.Comision;

public interface ComisionRepository extends CrudRepository<Comision, Long> {

	public final static String SQL_COMISION = "SELECT T2.ID, T2.CODIGO, MARGEN, COMI, FECHA_INICION, FECHA_FIN FROM POLITICA_COMERCIAL_MEDIDA T1 "+
			  		"LEFT JOIN TIPO_SERVICIO T2 ON (T1.TIPO_SERVICIO_ID=T2.ID) "+
			  		 "LEFT JOIN INTEGRACION T3 ON (T1.INTEGRACION_ID=T3.ID) "+
			  		 "WHERE  (T3.CODIGO='A2B' AND T2.CODIGO='TRAS') AND :fecha BETWEEN FECHA_INICIO AND FECHA_FIN";
	
	@Query(SQL_COMISION)
	public List<Comision> findComision(Date fecha);
	
}
