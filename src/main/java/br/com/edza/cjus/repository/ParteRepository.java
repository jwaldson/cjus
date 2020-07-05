package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.Parte;

@Repository
public interface ParteRepository extends JpaRepository<Parte, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.Parte(\n" +
			"id, fkPolo, assistencia_judiciaria, intimacaoPendente) " +
			"FROM Parte c WHERE c.fkPolo = :fkPolo")
	List<Parte> consultaRegistrosProcessar(@Param("fkPolo") Integer fkPolo);
}
