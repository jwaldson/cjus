package  br.com.edza.cjus.model.cjus;

import java.io.Serializable;
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
@Table(name = "cnj_advogado")
public class Advogado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Advogado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Advogado(Integer id, Integer fkParte, Boolean intimacao, String nome, String inscricao,
			String numeroDocumentoPrincipal, String tipoRepresentante, List<Endereco> enderecos, List<Pessoa> pessoas) {
		super();
		this.id = id;
		this.fkParte = fkParte;
		Intimacao = intimacao;
		this.nome = nome;
		this.inscricao = inscricao;
		this.numeroDocumentoPrincipal = numeroDocumentoPrincipal;
		this.tipoRepresentante = tipoRepresentante;
		this.enderecos = enderecos;
		this.pessoas = pessoas;
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "fk_id_parte")
	private Integer fkParte;

	@Column(name = "intimacao")
	private Boolean Intimacao;

	@Column(name = "nome")
	private String nome;

	@Column(name = "inscricao")
	private String inscricao;

	@Column(name = "numero_documento_principal")
	private String numeroDocumentoPrincipal;

	@Column(name = "tipo_representante")
	private String tipoRepresentante;

	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkAdvogado")
	List<Endereco> enderecos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkAdvogado")
	List<Pessoa> pessoas;
}

