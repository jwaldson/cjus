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
	
	public Endereco(Integer id, Integer fkPessoa, Integer fkAdvogado, BigInteger cep, String logradouro, String numero,
			String complemento, String bairro, String cidade, String estado, String pais) {
		super();
		this.id = id;
		this.fkPessoa = fkPessoa;
		this.fkAdvogado = fkAdvogado;
		Cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "fk_id_pessoa")
	private Integer fkPessoa;

	@Column(name = "fk_id_advogado")
	private Integer fkAdvogado;

	
	@Column(name = "cep")
	private BigInteger Cep;

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

}

