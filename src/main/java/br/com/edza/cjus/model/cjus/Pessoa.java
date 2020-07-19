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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cnj_pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Integer id, Integer fkAdvogado, String nome, String sexo, String nomeGenitor,
			String nomeGenitora, String dataNascimento, String dataObito, String numeroDocumentoPrincipal,
			String tipoPessoa, String cidadeNatural, String estadoNatural, String nacionalidade) {
		super();
		this.id = id;
		this.fkAdvogado = fkAdvogado;
		this.nome = nome;
		this.sexo = sexo;
		this.nomeGenitor = nomeGenitor;
		this.nomeGenitora = nomeGenitora;
		this.dataNascimento = dataNascimento;
		this.dataObito = dataObito;
		this.numeroDocumentoPrincipal = numeroDocumentoPrincipal;
		this.tipoPessoa = tipoPessoa;
		this.cidadeNatural = cidadeNatural;
		this.estadoNatural = estadoNatural;
		this.nacionalidade = nacionalidade;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "cnj_pessoa_id")
	private Integer id;

	@Column(name = "fk_id_advogado")
	private Integer fkAdvogado;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "sexo")
	private String sexo;

	@Column(name = "nome_genitor")
	private String nomeGenitor;

	@Column(name = "nome_genitora")
	private String nomeGenitora;

	@Column(name = "data_nascimento")
	private String dataNascimento;

	@Column(name = "data_obito")
	private String dataObito;

	@Column(name = "numero_documento_principal")
	private String numeroDocumentoPrincipal;

	@Column(name = "tipo_pessoa")
	private String tipoPessoa;

	@Column(name = "cidade_natural")
	private String cidadeNatural;

	@Column(name = "estado_natural")
	private String estadoNatural;

	@Column(name = "nacionalidade")
	private String nacionalidade;

	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkPessoa")
	private List<Endereco> enderecos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkPessoa")
	private List<OutroNome> outrosNomes;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkPessoa")
	private List<DocumentoIdentificacao> documentosIdentificacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFkAdvogado() {
		return fkAdvogado;
	}

	public void setFkAdvogado(Integer fkAdvogado) {
		this.fkAdvogado = fkAdvogado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNomeGenitor() {
		return nomeGenitor;
	}

	public void setNomeGenitor(String nomeGenitor) {
		this.nomeGenitor = nomeGenitor;
	}

	public String getNomeGenitora() {
		return nomeGenitora;
	}

	public void setNomeGenitora(String nomeGenitora) {
		this.nomeGenitora = nomeGenitora;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataObito() {
		return dataObito;
	}

	public void setDataObito(String dataObito) {
		this.dataObito = dataObito;
	}

	public String getNumeroDocumentoPrincipal() {
		return numeroDocumentoPrincipal;
	}

	public void setNumeroDocumentoPrincipal(String numeroDocumentoPrincipal) {
		this.numeroDocumentoPrincipal = numeroDocumentoPrincipal;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getCidadeNatural() {
		return cidadeNatural;
	}

	public void setCidadeNatural(String cidadeNatural) {
		this.cidadeNatural = cidadeNatural;
	}

	public String getEstadoNatural() {
		return estadoNatural;
	}

	public void setEstadoNatural(String estadoNatural) {
		this.estadoNatural = estadoNatural;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<OutroNome> getOutrosNomes() {
		return outrosNomes;
	}

	public void setOutrosNomes(List<OutroNome> outrosNomes) {
		this.outrosNomes = outrosNomes;
	}

	public List<DocumentoIdentificacao> getDocumentosIdentificacao() {
		return documentosIdentificacao;
	}

	public void setDocumentosIdentificacao(List<DocumentoIdentificacao> documentosIdentificacao) {
		this.documentosIdentificacao = documentosIdentificacao;
	}
	
}

