package br.com.edza.cjus.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.AssuntoProcessual;
import br.com.edza.cjus.model.cjus.DadoBasico;
import br.com.edza.cjus.model.cjus.Polo;
import br.com.edza.cjus.model.cjus.Prioridade;
import br.com.edza.cjus.model.cjus.ProcessoVinculado;

@Repository
public interface DadoBasicoRepository extends JpaRepository<DadoBasico, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.DadoBasico(\n" +
			"id, fkManifestacaoProcessual, classeProcessual,\n" + 
			"codigoLocalidade, competencia, modalidadeVinculacaoProcesso,\n" + 
			"valorCausa, nivelSigilo, dataAjuizamento, outroParametro) " +
			"FROM DadoBasico c WHERE c.fkManifestacaoProcessual = :fkManifestacaoProcessual")
	List<DadoBasico> consultaRegistrosProcessar(@Param("fkManifestacaoProcessual") Integer fkManifestacaoProcessual);
}
