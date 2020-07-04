package  br.com.edza.cjus.model.cjus;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cnj_documento")
public class Documento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "fk_id_mnifestacao_processual")
	private Integer fkManifestacaoProcessual;

	@Column(name = "id_documento")
	private String idDocumento;

	@Column(name = "id_documento_vinculado")
	private String idDocumentoVinculado;

	@Column(name = "tipo_documento_consultapje ")
	private String tipoDocumentoConsultapje ;

	@Column(name = "data_hora_documento")
	private String dataHoraDocumento;

	@Column(name = "descricao_documento")
	private String descricaoDocumento;

	@Column(name = "hash_documento")
	private String hashDocumento;

	@Column(name = "nivel_sigilo_documento")
	private BigInteger nivelSigiloDocumento;

	@Column(name = "tipo_documento")
	private String tipoDocumento;

	@Column(name = "conteudo_documento")
	private String conteudoDocumento;

	@Column(name = "mimetype_documento")
	private String mimetypeDocumento;

	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="fkDocumento")
	private List<Assinatura> assinatura;
}

