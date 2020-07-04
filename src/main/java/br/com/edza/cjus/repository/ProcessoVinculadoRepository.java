package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.ProcessoVinculado;

@Repository
public interface ProcessoVinculadoRepository extends JpaRepository<ProcessoVinculado, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.ProcessoVinculado(\n" +
			"fkDadosBasicos,\n" + 
			"numeroProcesso,\n" + 
			"vinculo " +
			"FROM ProcessoVinculado c WHERE c.fkDadosBasicos = :fkDadosBasicos")
	List<ProcessoVinculado> consultaRegistrosProcessar(@Param("fkDadosBasicos") Integer fkProcessoVinculado);
}
