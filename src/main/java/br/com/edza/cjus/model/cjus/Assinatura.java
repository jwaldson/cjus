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

	public Assinatura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assinatura(Integer id, Integer fkDocumento, String assinatura, String algoritmo_hash_assinatura,
			String cadeia_certificado_assinatura, String codificacao_certificado_assinatura, String data_assinatura,
			String signatatio_login_identficador) {
		super();
		this.id = id;
		this.fkDocumento = fkDocumento;
		this.assinatura = assinatura;
		this.algoritmo_hash_assinatura = algoritmo_hash_assinatura;
		this.cadeia_certificado_assinatura = cadeia_certificado_assinatura;
		this.codificacao_certificado_assinatura = codificacao_certificado_assinatura;
		this.data_assinatura = data_assinatura;
		this.signatatio_login_identficador = signatatio_login_identficador;
	}

	public Assinatura(Integer fkDocumento) {
		super();
		this.fkDocumento = fkDocumento;
	}

	
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

