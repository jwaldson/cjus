package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.Prioridade;

@Repository
public interface PrioridadeRepository extends JpaRepository<Prioridade, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.Prioridade(\n" +
			"id, fkDadosBasicos, prioridade, vinculo " +
			"FROM ProcessoVinculado c WHERE c.fkDadosBasicos = :fkDadosBasicos")
	List<Prioridade> consultaRegistrosProcessar(@Param("fkDadosBasicos") Integer fkProcessoVinculado);
}
