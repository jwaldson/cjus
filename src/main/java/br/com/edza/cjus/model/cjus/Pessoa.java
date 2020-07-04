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
	
	public Pessoa(Integer id, Integer fkParte, Integer fkAdvogado, String nome, String sexo, String nomeGenitor,
			String nomeGenitora, String dataNascimento, String dataObito, BigInteger numeroDocumentoPrincipal,
			String tipoPessoa, String cidadeNatural, String estadoNatural, String nacionalidade,
			List<Endereco> enderecos, List<OutroNome> outrosNomes,
			List<DocumentoIdentificacao> documentosIdentificacao) {
		super();
		this.id = id;
		this.fkParte = fkParte;
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
		this.enderecos = enderecos;
		this.outrosNomes = outrosNomes;
		this.documentosIdentificacao = documentosIdentificacao;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "fk_id_parte")
	private Integer fkParte;

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
	private BigInteger numeroDocumentoPrincipal;

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
	
}

