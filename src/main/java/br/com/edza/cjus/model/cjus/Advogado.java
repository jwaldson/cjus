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
			String numeroDocumentoPrincipal, String tipoRepresentante) {
		super();
		this.id = id;
		this.fkParte = fkParte;
		this.Intimacao = intimacao;
		this.nome = nome;
		this.inscricao = inscricao;
		this.numeroDocumentoPrincipal = numeroDocumentoPrincipal;
		this.tipoRepresentante = tipoRepresentante;
	}

	public Advogado(Integer fkParte) {
		super();
		this.fkParte = fkParte;
	}

	
	@Id
	@Column(name = "cnj_advogado_id")
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFkParte() {
		return fkParte;
	}

	public void setFkParte(Integer fkParte) {
		this.fkParte = fkParte;
	}

	public Boolean getIntimacao() {
		return Intimacao;
	}

	public void setIntimacao(Boolean intimacao) {
		Intimacao = intimacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public String getNumeroDocumentoPrincipal() {
		return numeroDocumentoPrincipal;
	}

	public void setNumeroDocumentoPrincipal(String numeroDocumentoPrincipal) {
		this.numeroDocumentoPrincipal = numeroDocumentoPrincipal;
	}

	public String getTipoRepresentante() {
		return tipoRepresentante;
	}

	public void setTipoRepresentante(String tipoRepresentante) {
		this.tipoRepresentante = tipoRepresentante;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Intimacao == null) ? 0 : Intimacao.hashCode());
		result = prime * result + ((enderecos == null) ? 0 : enderecos.hashCode());
		result = prime * result + ((fkParte == null) ? 0 : fkParte.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inscricao == null) ? 0 : inscricao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroDocumentoPrincipal == null) ? 0 : numeroDocumentoPrincipal.hashCode());
		result = prime * result + ((pessoas == null) ? 0 : pessoas.hashCode());
		result = prime * result + ((tipoRepresentante == null) ? 0 : tipoRepresentante.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Advogado other = (Advogado) obj;
		if (Intimacao == null) {
			if (other.Intimacao != null)
				return false;
		} else if (!Intimacao.equals(other.Intimacao))
			return false;
		if (enderecos == null) {
			if (other.enderecos != null)
				return false;
		} else if (!enderecos.equals(other.enderecos))
			return false;
		if (fkParte == null) {
			if (other.fkParte != null)
				return false;
		} else if (!fkParte.equals(other.fkParte))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inscricao == null) {
			if (other.inscricao != null)
				return false;
		} else if (!inscricao.equals(other.inscricao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroDocumentoPrincipal == null) {
			if (other.numeroDocumentoPrincipal != null)
				return false;
		} else if (!numeroDocumentoPrincipal.equals(other.numeroDocumentoPrincipal))
			return false;
		if (pessoas == null) {
			if (other.pessoas != null)
				return false;
		} else if (!pessoas.equals(other.pessoas))
			return false;
		if (tipoRepresentante == null) {
			if (other.tipoRepresentante != null)
				return false;
		} else if (!tipoRepresentante.equals(other.tipoRepresentante))
			return false;
		return true;
	}
}

