package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.ManifestacaoProcessual;

@Repository
public interface ManifestacaoProcessualRepository extends JpaRepository<ManifestacaoProcessual, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.ManifestacaoProcessual(\n" +
			"id, entraStatusProcessamento, idManifestante,\n" +
			"senhaManifestante, retornoSucesso, retornoMensagem,\n" +
			"retornoProtocoloRecebimento, retornoDataOperacao, retornoRecibo,\n" +
			"saiConteudoRetornado, saiDataAtualizacaoRegistro, saiErroSistema) \n" +
			"FROM ManifestacaoProcessual c WHERE c.entraStatusProcessamento = '00'")
	List<ManifestacaoProcessual> consultaRegistrosProcessar();
}
