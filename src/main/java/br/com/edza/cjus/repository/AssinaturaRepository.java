package br.com.edza.cjus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.edza.cjus.model.cjus.Assinatura;

@Repository
public interface AssinaturaRepository extends JpaRepository<Assinatura, Integer>{
	
	@Query("SELECT new  br.com.edza.cjus.model.cjus.Assinatura(\n" +
			"id, fkDocumento, assinatura, algoritmo_hash_assinatura,\n" + 
			"cadeia_certificado_assinatura, codificacao_certificado_assinatura, data_assinatura,\n" + 
			"signatatio_login_identficador) " +
			"FROM Assinatura c WHERE c.fkDocumento = :fkDocumento")
	List<Assinatura> consultarAssinatura(@Param("fkDocumento") Integer fkDocumento);
}
