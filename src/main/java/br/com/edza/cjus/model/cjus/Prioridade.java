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
@Table(name = "cnj_prioridade")
public class Prioridade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Prioridade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prioridade(Integer id, Integer fkDadosBasicos, String prioridade, String vinculo) {
		super();
		this.id = id;
		this.fkDadosBasicos = fkDadosBasicos;
		this.prioridade = prioridade;
		this.vinculo = vinculo;
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "fk_id_dados_basicos")
	private Integer fkDadosBasicos;

	@Column(name = "prioridade")
	private String prioridade;

	@Column(name = "vinculo")
	private String vinculo;

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

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getVinculo() {
		return vinculo;
	}

	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

	
}

