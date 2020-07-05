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

	public Parte(Integer id, Integer fkPolo, String assistencia_judiciaria, String intimacaoPendente) {
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
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "fk_id_polo")
	private Integer fkPolo;

	@Column(name = "assistencia_judiciaria")
	private String assistencia_judiciaria;

	@Column(name = "intimacaoPendente")
	private String intimacaoPendente;

	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkParte")
	private List<Pessoa> pessoas;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkParte")
	private List<Advogado> advogados;

}