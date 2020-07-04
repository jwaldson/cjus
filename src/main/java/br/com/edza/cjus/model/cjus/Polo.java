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
@Table(name = "cnj_polo")
public class Polo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Polo(Integer id, Integer fkDadosBasicos, String polo, List<Parte> partes) {
		super();
		this.id = id;
		this.fkDadosBasicos = fkDadosBasicos;
		this.polo = polo;
		this.partes = partes;
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "fk_id_dados_basicos")
	private Integer fkDadosBasicos;

	@Column(name = "polo")
	private String polo;

	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkPolo")
	private List<Parte> partes;


}

