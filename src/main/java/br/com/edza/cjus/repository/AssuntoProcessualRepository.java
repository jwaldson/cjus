package br.com.edza.cjus.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.DadoBasico;

@Repository
public interface AssuntoProcessualRepository extends JpaRepository<DadoBasico, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.AssuntoProcessual(\n" +
			"id, fkDadosBasicos, principal, codigoNacional,\n" + 
			"codigoAssunto, codigoPaiNacional, descricao) " +
			"FROM AssuntoProcessual c WHERE c.fkDadosBasicos = :fkDadosBasicos")
	List<DadoBasico> consultaRegistrosProcessar(@Param("fkDadosBasicos") Integer fkDadosBasicos);
}
