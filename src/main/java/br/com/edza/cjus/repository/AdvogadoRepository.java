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
public interface AdvogadoRepository extends JpaRepository<Advogado, Integer>{
	
	@Query("SELECT n " +
            "FROM Advogado as n " +
            "WHERE " +
         "      n.fkParte = :fkParte")	
	List<Advogado> consultaAdvogado(@Param("fkParte") Integer fkParte);
}
