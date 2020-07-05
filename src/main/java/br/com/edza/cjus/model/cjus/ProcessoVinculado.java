package  br.com.edza.cjus.model.cjus;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cnj_processo_vinculado")
public class ProcessoVinculado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public ProcessoVinculado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProcessoVinculado(Integer id, Integer fkDadosBasicos, String numeroProcesso, String vinculo) {
		super();
		this.id = id;
		this.fkDadosBasicos = fkDadosBasicos;
		this.numeroProcesso = numeroProcesso;
		this.vinculo = vinculo;
	}

	public ProcessoVinculado(Integer fkDadosBasicos) {
		super();
		this.fkDadosBasicos = fkDadosBasicos;
	}

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Integer id;

	@Column(name = "fk_id_dados_basicos")
	private Integer fkDadosBasicos;
	
	@Column(name = "numero_processo")
	private String numeroProcesso;

	@Column(name = "vinculo")
	private String vinculo;
//	
//	@ManyToOne
//	@JoinColumn(name="id", nullable=false)
//	private DadoBasico processoVinculado;
	
}

