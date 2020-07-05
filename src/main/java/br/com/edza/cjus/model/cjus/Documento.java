package  br.com.edza.cjus.model.cjus;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cnj_documento")
public class Documento implements Serializable {

	public Documento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Documento(Integer id, Integer fkManifestacaoProcessual, String idDocumento, String idDocumentoVinculado,
			String tipoDocumentoConsultapje, String dataHoraDocumento, String descricaoDocumento, String hashDocumento,
			BigInteger nivelSigiloDocumento, String tipoDocumento, String conteudoDocumento, String mimetypeDocumento) {
		super();
		this.id = id;
		this.fkManifestacaoProcessual = fkManifestacaoProcessual;
		this.idDocumento = idDocumento;
		this.idDocumentoVinculado = idDocumentoVinculado;
		this.tipoDocumentoConsultapje = tipoDocumentoConsultapje;
		this.dataHoraDocumento = dataHoraDocumento;
		this.descricaoDocumento = descricaoDocumento;
		this.hashDocumento = hashDocumento;
		this.nivelSigiloDocumento = nivelSigiloDocumento;
		this.tipoDocumento = tipoDocumento;
		this.conteudoDocumento = conteudoDocumento;
		this.mimetypeDocumento = mimetypeDocumento;
	}

	public Documento(Integer fkManifestacaoProcessual) {
		super();
		this.fkManifestacaoProcessual = fkManifestacaoProcessual;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "fk_id_mnifestacao_processual")
	private Integer fkManifestacaoProcessual;

	@Column(name = "id_documento")
	private String idDocumento;

	@Column(name = "id_documento_vinculado")
	private String idDocumentoVinculado;

	@Column(name = "tipo_documento_consultapje ")
	private String tipoDocumentoConsultapje ;

	@Column(name = "data_hora_documento")
	private String dataHoraDocumento;

	@Column(name = "descricao_documento")
	private String descricaoDocumento;

	@Column(name = "hash_documento")
	private String hashDocumento;

	@Column(name = "nivel_sigilo_documento")
	private BigInteger nivelSigiloDocumento;

	@Column(name = "tipo_documento")
	private String tipoDocumento;

	@Column(name = "conteudo_documento")
	private String conteudoDocumento;

	@Column(name = "mimetype_documento")
	private String mimetypeDocumento;

	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkDocumento")
	private List<Assinatura> assinatura;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFkManifestacaoProcessual() {
		return fkManifestacaoProcessual;
	}

	public void setFkManifestacaoProcessual(Integer fkManifestacaoProcessual) {
		this.fkManifestacaoProcessual = fkManifestacaoProcessual;
	}

	public String getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getIdDocumentoVinculado() {
		return idDocumentoVinculado;
	}

	public void setIdDocumentoVinculado(String idDocumentoVinculado) {
		this.idDocumentoVinculado = idDocumentoVinculado;
	}

	public String getTipoDocumentoConsultapje() {
		return tipoDocumentoConsultapje;
	}

	public void setTipoDocumentoConsultapje(String tipoDocumentoConsultapje) {
		this.tipoDocumentoConsultapje = tipoDocumentoConsultapje;
	}

	public String getDataHoraDocumento() {
		return dataHoraDocumento;
	}

	public void setDataHoraDocumento(String dataHoraDocumento) {
		this.dataHoraDocumento = dataHoraDocumento;
	}

	public String getDescricaoDocumento() {
		return descricaoDocumento;
	}

	public void setDescricaoDocumento(String descricaoDocumento) {
		this.descricaoDocumento = descricaoDocumento;
	}

	public String getHashDocumento() {
		return hashDocumento;
	}

	public void setHashDocumento(String hashDocumento) {
		this.hashDocumento = hashDocumento;
	}

	public BigInteger getNivelSigiloDocumento() {
		return nivelSigiloDocumento;
	}

	public void setNivelSigiloDocumento(BigInteger nivelSigiloDocumento) {
		this.nivelSigiloDocumento = nivelSigiloDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getConteudoDocumento() {
		return conteudoDocumento;
	}

	public void setConteudoDocumento(String conteudoDocumento) {
		this.conteudoDocumento = conteudoDocumento;
	}

	public String getMimetypeDocumento() {
		return mimetypeDocumento;
	}

	public void setMimetypeDocumento(String mimetypeDocumento) {
		this.mimetypeDocumento = mimetypeDocumento;
	}

	public List<Assinatura> getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(List<Assinatura> assinatura) {
		this.assinatura = assinatura;
	}
}

