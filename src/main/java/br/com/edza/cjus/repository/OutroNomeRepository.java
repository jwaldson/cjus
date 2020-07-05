package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.OutroNome;

@Repository
public interface OutroNomeRepository extends JpaRepository<OutroNome, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.OutroNome(\n" +
			"id, fkPessoa, outroNome) " +
			"FROM OutroNome c WHERE c.fkPessoa = :fkPessoa")
	List<OutroNome> consultaOutroNome(@Param("fkPessoa") Integer fkPessoa);


}
