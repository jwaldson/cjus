package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.Advogado;
import br.com.edza.cjus.model.cjus.Endereco;
import br.com.edza.cjus.model.cjus.Parte;
import br.com.edza.cjus.model.cjus.Pessoa;

@Repository
public interface ParteRepository extends JpaRepository<Advogado, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.Advogado(\n" +
			"id, fkParte, intimacao, nome, inscricao,\n" + 
			"numeroDocumentoPrincipal, tipoRepresentante, enderecos, pessoas " +
			"FROM Advogado c WHERE c.fkParte = :fkParte")
	List<Advogado> consultaRegistrosProcessar(@Param("fkParte") Integer fkParte);
}
