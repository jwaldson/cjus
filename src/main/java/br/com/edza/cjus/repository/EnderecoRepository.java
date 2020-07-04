package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.Endereco(\n" +
			"id, fkPessoa, fkAdvogado, cep, logradouro, numero,\n" + 
			"complemento, bairro, cidade, estado, pais " +
			"FROM Endereco c WHERE c.fkAdvogado = :fkAdvogado")
	List<Endereco> consultaEnderecoAdvogado(@Param("fkAdvogado") Integer fkAdvogado);

	@Query("SELECT new  br.com.edza.cjus.model.cjus.Endereco(\n" +
			"id, fkPessoa, fkAdvogado, cep, logradouro, numero,\n" + 
			"complemento, bairro, cidade, estado, pais " +
			"FROM Endereco c WHERE c.fkPessoa = :fkPessoa")
	List<Endereco> consultaEnderecoPessoa(@Param("fkPessoa") Integer fkPessoa);

}
