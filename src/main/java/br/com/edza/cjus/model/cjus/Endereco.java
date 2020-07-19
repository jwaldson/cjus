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
@Table(name = "cnj_endereco")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;
	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Endereco(Integer id, Integer fkPessoa, Integer fkAdvogado, String cep, String logradouro, String numero,
			String complemento, String bairro, String cidade, String estado, String pais) {
		super();
		this.id = id;
		this.fkPessoa = fkPessoa;
		this.fkAdvogado = fkAdvogado;
		this.Cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public Endereco(Integer fkAdvogado) {
		super();
		this.fkAdvogado = fkAdvogado;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "cnj_endereco_id")
	private Integer id;

	@Column(name = "fk_id_pessoa")
	private Integer fkPessoa;

	@Column(name = "fk_id_advogado")
	private Integer fkAdvogado;

	
	@Column(name = "cep")
	private String Cep;

	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "numero")
	private String numero;

	@Column(name = "complemento")
	private String complemento;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "estado")
	private String estado;

	@Column(name = "pais")
	private String pais;

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

	public Integer getFkAdvogado() {
		return fkAdvogado;
	}

	public void setFkAdvogado(Integer fkAdvogado) {
		this.fkAdvogado = fkAdvogado;
	}

	public String getCep() {
		return Cep;
	}

	public void setCep(String cep) {
		Cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}

