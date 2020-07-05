package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.DocumentoIdentificacao;

@Repository
public interface DocumentoIdentificacaoRepository extends JpaRepository<DocumentoIdentificacao, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.DocumentoIdentificacao(\n" +
			"id, fkPessoa, codigoDocumento, emissorDocumento,\n" + 
			"tipoDocumento, nomeDetentora) " +
			"FROM DocumentoIdentificacao c WHERE c.fkPessoa = :fkPessoa")
	List<DocumentoIdentificacao> consultaDocumentoIdentificacao(@Param("fkPessoa") Integer fkPessoa);


}
