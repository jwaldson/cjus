package  br.com.edza.cjus.model.cjus;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cnj_assinatura")
public class Assinatura implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "fk_id_documento")
	private Integer fkDocumento;
	
	@Column(name = "assinatura")
	private String assinatura;

	@Column(name = "algoritmo_hash_assinatura")
	private String algoritmo_hash_assinatura;

	@Column(name = "cadeia_certificado_assinatura")
	private String cadeia_certificado_assinatura;

	@Column(name = "codificacao_certificado_assinatura")
	private String codificacao_certificado_assinatura;

	@Column(name = "data_assinatura")
	private String data_assinatura;

	@Column(name = "signatatio_login_identficador")
	private String signatatio_login_identficador;

}

