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
	
	
		
	public Polo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Polo(Integer id, Integer fkDadosBasicos, String polo) {
		super();
		this.id = id;
		this.fkDadosBasicos = fkDadosBasicos;
		this.polo = polo;
		this.partes = partes;
	}

	public Polo(Integer fkDadosBasicos) {
		super();
		this.fkDadosBasicos = fkDadosBasicos;
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

	public String getPolo() {
		return polo;
	}

	public void setPolo(String polo) {
		this.polo = polo;
	}

	public List<Parte> getPartes() {
		return partes;
	}

	public void setPartes(List<Parte> partes) {
		this.partes = partes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fkDadosBasicos == null) ? 0 : fkDadosBasicos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((partes == null) ? 0 : partes.hashCode());
		result = prime * result + ((polo == null) ? 0 : polo.hashCode());
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
		Polo other = (Polo) obj;
		if (fkDadosBasicos == null) {
			if (other.fkDadosBasicos != null)
				return false;
		} else if (!fkDadosBasicos.equals(other.fkDadosBasicos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (partes == null) {
			if (other.partes != null)
				return false;
		} else if (!partes.equals(other.partes))
			return false;
		if (polo == null) {
			if (other.polo != null)
				return false;
		} else if (!polo.equals(other.polo))
			return false;
		return true;
	}


}

