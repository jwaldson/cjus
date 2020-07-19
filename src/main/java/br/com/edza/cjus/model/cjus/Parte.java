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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cnj_parte")
public class Parte implements Serializable {

	private static final long serialVersionUID = 1L;

	public Parte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parte(Integer id, Integer fkPolo, Boolean assistencia_judiciaria, Integer intimacaoPendente) {
		super();
		this.id = id;
		this.fkPolo = fkPolo;
		this.assistencia_judiciaria = assistencia_judiciaria;
		this.intimacaoPendente = intimacaoPendente;
	}

	public Parte(Integer fkPolo) {
		super();
		this.fkPolo = fkPolo;
	}
	
	
	@Id
	@Column(name = "cnj_parte_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "fk_id_polo")
	private Integer fkPolo;

	@Column(name = "assistencia_judiciaria")
	private Boolean assistencia_judiciaria;

	@Column(name = "intimacaoPendente")
	private Integer intimacaoPendente;

	@OneToOne(cascade=CascadeType.ALL)
	private Pessoa pessoa;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkParte")
	private List<Advogado> advogados;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFkPolo() {
		return fkPolo;
	}

	public void setFkPolo(Integer fkPolo) {
		this.fkPolo = fkPolo;
	}

	public Boolean getAssistencia_judiciaria() {
		return assistencia_judiciaria;
	}

	public void setAssistencia_judiciaria(Boolean assistencia_judiciaria) {
		this.assistencia_judiciaria = assistencia_judiciaria;
	}

	public Integer getIntimacaoPendente() {
		return intimacaoPendente;
	}

	public void setIntimacaoPendente(Integer intimacaoPendente) {
		this.intimacaoPendente = intimacaoPendente;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Advogado> getAdvogados() {
		return advogados;
	}

	public void setAdvogados(List<Advogado> advogados) {
		this.advogados = advogados;
	}

}