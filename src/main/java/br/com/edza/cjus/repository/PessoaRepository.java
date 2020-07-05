package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.Pessoa(\n" +
			"id, fkParte, fkAdvogado, nome, sexo, nomeGenitor,\n" + 
			"nomeGenitora, dataNascimento, dataObito, numeroDocumentoPrincipal,\n" + 
			"tipoPessoa, cidadeNatural, estadoNatural, nacionalidade)\n" + 
			"FROM Pessoa c WHERE c.fkParte = :fkParte")
	List<Pessoa> consultarPessoa(@Param("fkParte") Integer fkParte);
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.Pessoa(\n" +
			"id, fkParte, fkAdvogado, nome, sexo, nomeGenitor,\n" + 
			"nomeGenitora, dataNascimento, dataObito, numeroDocumentoPrincipal,\n" + 
			"tipoPessoa, cidadeNatural, estadoNatural, nacionalidade)\n" + 
			"FROM Pessoa c WHERE c.fkAdvogado = :fkAdvogado")
	List<Pessoa> consultarAdvogado(@Param("fkAdvogado") Integer fkAdvogado);
	
}
