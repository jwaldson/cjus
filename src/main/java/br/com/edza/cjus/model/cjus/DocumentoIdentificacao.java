package  br.com.edza.cjus.model.cjus;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cnj_documento_identificacao")
public class DocumentoIdentificacao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public DocumentoIdentificacao(Integer id, Integer fkPessoa, String codigoDocumento, String emissorDocumento,
			String tipoDocumento, String nomeDetentora) {
		super();
		this.id = id;
		this.fkPessoa = fkPessoa;
		this.codigoDocumento = codigoDocumento;
		this.emissorDocumento = emissorDocumento;
		this.tipoDocumento = tipoDocumento;
		this.nomeDetentora = nomeDetentora;
	}

	public DocumentoIdentificacao(Integer fkPessoa) {
		super();
		this.fkPessoa = fkPessoa;
	}

	public DocumentoIdentificacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "fk_id_pessoa")
	private Integer fkPessoa;

	@Column(name = "codigo_documento")
	private String codigoDocumento;

	@Column(name = "emissor_documento")
	private String emissorDocumento;

	@Column(name = "Tipo_documento")
	private String tipoDocumento;

	@Column(name = "nome_detentora")
	private String nomeDetentora;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFkPessoa() {
		return fkPessoa;
	}

	public void setFkPessoa(Integer fkPessoa) {
		this.fkPessoa = fkPessoa;
	}

	public String getCodigoDocumento() {
		return codigoDocumento;
	}

	public void setCodigoDocumento(String codigoDocumento) {
		this.codigoDocumento = codigoDocumento;
	}

	public String getEmissorDocumento() {
		return emissorDocumento;
	}

	public void setEmissorDocumento(String emissorDocumento) {
		this.emissorDocumento = emissorDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNomeDetentora() {
		return nomeDetentora;
	}

	public void setNomeDetentora(String nomeDetentora) {
		this.nomeDetentora = nomeDetentora;
	}

}

