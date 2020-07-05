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
@Table(name = "cnj_manifestacao_processual")
public class ManifestacaoProcessual implements Serializable {

	private static final long serialVersionUID = 1L;

	public ManifestacaoProcessual() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ManifestacaoProcessual(Integer id, String entraStatusProcessamento, BigInteger idManifestante,
			String senhaManifestante, Boolean retornoSucesso, String retornoMensagem,
			BigInteger retornoProtocoloRecebimento, String retornoDataOperacao, String retornoRecibo,
			String saiConteudoRetornado, String saiDataAtualizacaoRegistro, String saiErroSistema) {
		super();
		this.id = id;
		this.entraStatusProcessamento = entraStatusProcessamento;
		this.idManifestante = idManifestante;
		this.senhaManifestante = senhaManifestante;
		this.retornoSucesso = retornoSucesso;
		this.retornoMensagem = retornoMensagem;
		this.retornoProtocoloRecebimento = retornoProtocoloRecebimento;
		this.retornoDataOperacao = retornoDataOperacao;
		this.retornoRecibo = retornoRecibo;
		this.saiConteudoRetornado = saiConteudoRetornado;
		this.saiDataAtualizacaoRegistro = saiDataAtualizacaoRegistro;
		this.saiErroSistema = saiErroSistema;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "entra_status_processamento")
	private String entraStatusProcessamento;

	@Column(name = "id_manifestante")
	private BigInteger idManifestante;

	@Column(name = "senha_manifestante")
	private String senhaManifestante;

	@Column(name = "retorno_sucesso")
	private Boolean retornoSucesso;

	@Column(name = "retorno_mensagem")
	private String retornoMensagem;

	@Column(name = "retorno_protocolo_recebimento")
	private BigInteger retornoProtocoloRecebimento;

	@Column(name = "retorno_data_operacao")
	private String retornoDataOperacao;

	@Column(name = "retorno_recibo")
	private String retornoRecibo;

	@Column(name = "sai_conteudo_retornado")
	private String saiConteudoRetornado;

	@Column(name = "sai_data_atualizacao_registro")
	private String saiDataAtualizacaoRegistro;

	@Column(name = "sai_erro_sistema")
	private String saiErroSistema;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkManifestacaoProcessual")
	private List<DadoBasico> dadoBasico;

	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkManifestacaoProcessual")
	private List<Documento> documentos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEntraStatusProcessamento() {
		return entraStatusProcessamento;
	}

	public void setEntraStatusProcessamento(String entraStatusProcessamento) {
		this.entraStatusProcessamento = entraStatusProcessamento;
	}

	public BigInteger getIdManifestante() {
		return idManifestante;
	}

	public void setIdManifestante(BigInteger idManifestante) {
		this.idManifestante = idManifestante;
	}

	public String getSenhaManifestante() {
		return senhaManifestante;
	}

	public void setSenhaManifestante(String senhaManifestante) {
		this.senhaManifestante = senhaManifestante;
	}

	public Boolean getRetornoSucesso() {
		return retornoSucesso;
	}

	public void setRetornoSucesso(Boolean retornoSucesso) {
		this.retornoSucesso = retornoSucesso;
	}

	public String getRetornoMensagem() {
		return retornoMensagem;
	}

	public void setRetornoMensagem(String retornoMensagem) {
		this.retornoMensagem = retornoMensagem;
	}

	public BigInteger getRetornoProtocoloRecebimento() {
		return retornoProtocoloRecebimento;
	}

	public void setRetornoProtocoloRecebimento(BigInteger retornoProtocoloRecebimento) {
		this.retornoProtocoloRecebimento = retornoProtocoloRecebimento;
	}

	public String getRetornoDataOperacao() {
		return retornoDataOperacao;
	}

	public void setRetornoDataOperacao(String retornoDataOperacao) {
		this.retornoDataOperacao = retornoDataOperacao;
	}

	public String getRetornoRecibo() {
		return retornoRecibo;
	}

	public void setRetornoRecibo(String retornoRecibo) {
		this.retornoRecibo = retornoRecibo;
	}

	public String getSaiConteudoRetornado() {
		return saiConteudoRetornado;
	}

	public void setSaiConteudoRetornado(String saiConteudoRetornado) {
		this.saiConteudoRetornado = saiConteudoRetornado;
	}

	public String getSaiDataAtualizacaoRegistro() {
		return saiDataAtualizacaoRegistro;
	}

	public void setSaiDataAtualizacaoRegistro(String saiDataAtualizacaoRegistro) {
		this.saiDataAtualizacaoRegistro = saiDataAtualizacaoRegistro;
	}

	public String getSaiErroSistema() {
		return saiErroSistema;
	}

	public void setSaiErroSistema(String saiErroSistema) {
		this.saiErroSistema = saiErroSistema;
	}

	public List<DadoBasico> getDadoBasico() {
		return dadoBasico;
	}

	public void setDadoBasico(List<DadoBasico> dadoBasico) {
		this.dadoBasico = dadoBasico;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}

}
