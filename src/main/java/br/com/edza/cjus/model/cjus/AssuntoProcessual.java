package  br.com.edza.cjus.model.cjus;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cnj_assunto_processual")
public class AssuntoProcessual implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public AssuntoProcessual() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssuntoProcessual(Integer id, Integer fkDadosBasicos, Boolean principal, BigInteger codigoNacional,
			BigInteger codigoAssunto, BigInteger codigoPaiNacional, String descricao) {
		super();
		this.id = id;
		this.fkDadosBasicos = fkDadosBasicos;
		this.principal = principal;
		this.codigoNacional = codigoNacional;
		this.codigoAssunto = codigoAssunto;
		this.codigoPaiNacional = codigoPaiNacional;
		this.descricao = descricao;
	}

	public AssuntoProcessual(Integer fkDadosBasicos) {
		super();
		this.fkDadosBasicos = fkDadosBasicos;
	}
	
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Integer id;

	@Column(name = "fk_id_dados_basicos")
	private Integer fkDadosBasicos;

	@Column(name = "principal")
	private Boolean principal;

	@Column(name = "codigo_nacional")
	private BigInteger codigoNacional;

	@Column(name = "codigo_assunto")
	private BigInteger codigoAssunto;

	@Column(name = "codigo_pai_acional")
	private BigInteger codigoPaiNacional;

	@Column(name = "descricao")
	private String descricao;

	
}

