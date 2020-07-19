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

	public AssuntoProcessual(Integer id, Integer fkDadosBasicos, Boolean principal, Integer codigoNacional,
			BigInteger codigoAssunto, Integer codigoPaiNacional, String descricao) {
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
	@Column(name = "cnj_assunto_processual_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Integer id;

	@Column(name = "fk_id_dados_basicos")
	private Integer fkDadosBasicos;

	@Column(name = "principal")
	private Boolean principal;

	@Column(name = "codigo_nacional")
	private Integer codigoNacional;

	@Column(name = "codigo_assunto")
	private BigInteger codigoAssunto;

	@Column(name = "codigo_pai_acional")
	private Integer codigoPaiNacional;

	@Column(name = "descricao")
	private String descricao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFkDadosBasicos() {
		return fkDadosBasicos;
	}

	public void setFkDadosBasicos(Integer fkDadosBasicos) {
		this.fkDadosBasicos = fkDadosBasicos;
	}

	public Boolean getPrincipal() {
		return principal;
	}

	public void setPrincipal(Boolean principal) {
		this.principal = principal;
	}

	public Integer getCodigoNacional() {
		return codigoNacional;
	}

	public void setCodigoNacional(Integer codigoNacional) {
		this.codigoNacional = codigoNacional;
	}

	public BigInteger getCodigoAssunto() {
		return codigoAssunto;
	}

	public void setCodigoAssunto(BigInteger codigoAssunto) {
		this.codigoAssunto = codigoAssunto;
	}

	public Integer getCodigoPaiNacional() {
		return codigoPaiNacional;
	}

	public void setCodigoPaiNacional(Integer codigoPaiNacional) {
		this.codigoPaiNacional = codigoPaiNacional;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}

