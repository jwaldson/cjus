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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cnj_dados_basicos")
public class DadoBasico implements Serializable {

	private static final long serialVersionUID = 1L;

	public DadoBasico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DadoBasico(Integer id, Integer fkManifestacaoProcessual, Integer classeProcessual,
			String codigoLocalidade, Integer competencia, String modalidadeVinculacaoProcesso,
			Double valorCausa, Integer nivelSigilo, String dataAjuizamento, String outroParametro) {
		super();
		this.id = id;
		this.fkManifestacaoProcessual = fkManifestacaoProcessual;
		this.classeProcessual = classeProcessual;
		this.codigoLocalidade = codigoLocalidade;
		this.competencia = competencia;
		this.modalidadeVinculacaoProcesso = modalidadeVinculacaoProcesso;
		this.valorCausa = valorCausa;
		this.nivelSigilo = nivelSigilo;
		this.dataAjuizamento = dataAjuizamento;
		this.outroParametro = outroParametro;
		this.assuntos = assuntos;
		this.prcessosVinculados = prcessosVinculados;
		this.prioridades = prioridades;
		this.polo = polo;
	}

	public DadoBasico(Integer fkManifestacaoProcessual) {
		super();
		this.fkManifestacaoProcessual = fkManifestacaoProcessual;
	}


	@Id
	@Column(name = "cnj_dados_basicos_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "fk_id_mnifestacao_processual")
	private Integer fkManifestacaoProcessual;
	
	@Column(name = "classe_processual")
	private Integer classeProcessual;
	
	@Column(name = "codigo_localidade")
	private String codigoLocalidade;
	
	@Column(name = "competencia")
	private Integer competencia;

	@Column(name = "modalidade_vinculacao_processo")
	private String modalidadeVinculacaoProcesso;

	@Column(name = "valor_causa")
	private Double valorCausa;

	@Column(name = "nivel_sigilo")
	private Integer nivelSigilo;

	@Column(name = "data_ajuizamento")
	private String dataAjuizamento;

	@Column(name = "outro_parametro")
	private String outroParametro;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkDadosBasicos")
	private List<AssuntoProcessual> assuntos;

	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkDadosBasicos")
	private List<ProcessoVinculado> prcessosVinculados;

	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkDadosBasicos")
	private List<Prioridade> prioridades;

	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkDadosBasicos")
	private List<Polo> polo;

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

	public Integer getClasseProcessual() {
		return classeProcessual;
	}

	public void setClasseProcessual(Integer classeProcessual) {
		this.classeProcessual = classeProcessual;
	}

	public String getCodigoLocalidade() {
		return codigoLocalidade;
	}

	public void setCodigoLocalidade(String codigoLocalidade) {
		this.codigoLocalidade = codigoLocalidade;
	}

	public Integer getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Integer competencia) {
		this.competencia = competencia;
	}

	public String getModalidadeVinculacaoProcesso() {
		return modalidadeVinculacaoProcesso;
	}

	public void setModalidadeVinculacaoProcesso(String modalidadeVinculacaoProcesso) {
		this.modalidadeVinculacaoProcesso = modalidadeVinculacaoProcesso;
	}

	public Double getValorCausa() {
		return valorCausa;
	}

	public void setValorCausa(Double valorCausa) {
		this.valorCausa = valorCausa;
	}

	public Integer getNivelSigilo() {
		return nivelSigilo;
	}

	public void setNivelSigilo(Integer nivelSigilo) {
		this.nivelSigilo = nivelSigilo;
	}

	public String getDataAjuizamento() {
		return dataAjuizamento;
	}

	public void setDataAjuizamento(String dataAjuizamento) {
		this.dataAjuizamento = dataAjuizamento;
	}

	public String getOutroParametro() {
		return outroParametro;
	}

	public void setOutroParametro(String outroParametro) {
		this.outroParametro = outroParametro;
	}

	public List<AssuntoProcessual> getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(List<AssuntoProcessual> assuntos) {
		this.assuntos = assuntos;
	}

	public List<ProcessoVinculado> getPrcessosVinculados() {
		return prcessosVinculados;
	}

	public void setPrcessosVinculados(List<ProcessoVinculado> prcessosVinculados) {
		this.prcessosVinculados = prcessosVinculados;
	}

	public List<Prioridade> getPrioridades() {
		return prioridades;
	}

	public void setPrioridades(List<Prioridade> prioridades) {
		this.prioridades = prioridades;
	}

	public List<Polo> getPolo() {
		return polo;
	}

	public void setPolo(List<Polo> polo) {
		this.polo = polo;
	}
}

