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
@Table(name = "cnj_outro_nome")
public class OutroNome implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public OutroNome(Integer id, Integer fkPessoa, String outroNome) {
		super();
		this.id = id;
		this.fkPessoa = fkPessoa;
		this.outroNome = outroNome;
	}
	public OutroNome(Integer fkPessoa) {
		super();
		this.fkPessoa = fkPessoa;
	}

	
	public OutroNome() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "fk_id_pessoa")
	private Integer fkPessoa;

	@Column(name = "outro_nome")
	private String outroNome;
	
}

