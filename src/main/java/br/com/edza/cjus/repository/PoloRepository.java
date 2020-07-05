package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.Parte;
import br.com.edza.cjus.model.cjus.Polo;

@Repository
public interface PoloRepository extends JpaRepository<Polo, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.Polo(\n" +
			"id, fkDadosBasicos, polo) " +
			"FROM Polo c WHERE c.fkDadosBasicos = :fkDadosBasicos")
	List<Polo> consultaRegistrosProcessar(@Param("fkDadosBasicos") Integer fkDadosBasicos);
}
