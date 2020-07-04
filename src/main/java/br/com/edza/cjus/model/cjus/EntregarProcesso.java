package  br.com.edza.cjus.model.cjus;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transitorio_cnj_interop")
public class EntregarProcesso implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public EntregarProcesso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntregarProcesso(Integer id, String entraStatusProcessamento, BigInteger idManifestante,
			String senhaManifestante, BigInteger classeProcessual, BigInteger codigoLocalidade, BigInteger competencia,
			String modalidadeVinculacaoProcesso, String prioridade, BigInteger valorCausa,
			Boolean assistenciaJudiciaria, BigInteger nivelSigilo, String dataAjuizamento, String outroParametro,
			String polo, String parteNome, String parteSexo, String parteNomeGenitor, String parteNomeGenitora,
			String parteDataNascimento, String parteDataObito, BigInteger parteNumeroDocumentoPrincipal,
			String parteTipoPessoa, String parteCidadeNatural, String parteEstadoNatural, String parteNacionalidade,
			String parteCodigoDocumento, String parteEmissorDocumento, String parteTipoDocumento,
			String parteNomeDetentora, String parteOutroNome, BigInteger enderecoCep, String enderecoLogradouro,
			String enderecoNumero, String enderecoComplemento, String enderecoBairro, String enderecoCidade,
			String enderecoEstado, String enderecoPais, Boolean represProcessualIntimacao, String represProcessualNome,
			String represProcessualInscricao, String represProcessualNumeroDocumentoPrincipal,
			String represProcessualTipoRepresentante, Boolean assuntoProcessualPrincipal,
			BigInteger assuntoProcessualCodigoNacional, BigInteger assuntoProcessualCodigoAssunto,
			BigInteger assuntoProcessualPodigoPaiNacional, BigInteger assuntoProcessualDescricao, String idDocumento,
			String tipoDocumentoConsultapje, String dataHoraDocumento, String descricaoDocumento, String hashDocumento,
			BigInteger nivelSigiloDocumento, String tipoDocumento, String conteudoDocumento, String mimetypeDocumento,
			String assinatura, String algoritmoHashAssinatura, String cadeiaCertificadoAssinatura,
			String codificacaoCertificadoAssinatura, Boolean retornoSucesso, String retornoMensagem,
			BigInteger retornoProtocoloRecebimento, String retornoDataOperacao, String retornoRecibo,
			String saiConteudoRetornado, String saiDataAtualizacaoRegistro, String saiErroSistema) {
		super();
		this.id = id;
		this.entraStatusProcessamento = entraStatusProcessamento;
		this.idManifestante = idManifestante;
		this.senhaManifestante = senhaManifestante;
		this.classeProcessual = classeProcessual;
		this.codigoLocalidade = codigoLocalidade;
		this.competencia = competencia;
		this.modalidadeVinculacaoProcesso = modalidadeVinculacaoProcesso;
		this.prioridade = prioridade;
		this.valorCausa = valorCausa;
		this.assistenciaJudiciaria = assistenciaJudiciaria;
		this.nivelSigilo = nivelSigilo;
		this.dataAjuizamento = dataAjuizamento;
		this.outroParametro = outroParametro;
		this.polo = polo;
		this.parteNome = parteNome;
		this.parteSexo = parteSexo;
		this.parteNomeGenitor = parteNomeGenitor;
		this.parteNomeGenitora = parteNomeGenitora;
		this.parteDataNascimento = parteDataNascimento;
		this.parteDataObito = parteDataObito;
		this.parteNumeroDocumentoPrincipal = parteNumeroDocumentoPrincipal;
		this.parteTipoPessoa = parteTipoPessoa;
		this.parteCidadeNatural = parteCidadeNatural;
		this.parteEstadoNatural = parteEstadoNatural;
		this.parteNacionalidade = parteNacionalidade;
		this.parteCodigoDocumento = parteCodigoDocumento;
		this.parteEmissorDocumento = parteEmissorDocumento;
		this.parteTipoDocumento = parteTipoDocumento;
		this.parteNomeDetentora = parteNomeDetentora;
		this.parteOutroNome = parteOutroNome;
		this.enderecoCep = enderecoCep;
		this.enderecoLogradouro = enderecoLogradouro;
		this.enderecoNumero = enderecoNumero;
		this.enderecoComplemento = enderecoComplemento;
		this.enderecoBairro = enderecoBairro;
		this.enderecoCidade = enderecoCidade;
		this.enderecoEstado = enderecoEstado;
		this.enderecoPais = enderecoPais;
		this.represProcessualIntimacao = represProcessualIntimacao;
		this.represProcessualNome = represProcessualNome;
		this.represProcessualInscricao = represProcessualInscricao;
		this.represProcessualNumeroDocumentoPrincipal = represProcessualNumeroDocumentoPrincipal;
		this.represProcessualTipoRepresentante = represProcessualTipoRepresentante;
		this.assuntoProcessualPrincipal = assuntoProcessualPrincipal;
		this.assuntoProcessualCodigoNacional = assuntoProcessualCodigoNacional;
		this.assuntoProcessualCodigoAssunto = assuntoProcessualCodigoAssunto;
		this.assuntoProcessualPodigoPaiNacional = assuntoProcessualPodigoPaiNacional;
		this.assuntoProcessualDescricao = assuntoProcessualDescricao;
		this.idDocumento = idDocumento;
		this.tipoDocumentoConsultapje = tipoDocumentoConsultapje;
		this.dataHoraDocumento = dataHoraDocumento;
		this.descricaoDocumento = descricaoDocumento;
		this.hashDocumento = hashDocumento;
		this.nivelSigiloDocumento = nivelSigiloDocumento;
		this.tipoDocumento = tipoDocumento;
		this.conteudoDocumento = conteudoDocumento;
		this.mimetypeDocumento = mimetypeDocumento;
		this.assinatura = assinatura;
		this.algoritmoHashAssinatura = algoritmoHashAssinatura;
		this.cadeiaCertificadoAssinatura = cadeiaCertificadoAssinatura;
		this.codificacaoCertificadoAssinatura = codificacaoCertificadoAssinatura;
		this.retornoSucesso = retornoSucesso;
		this.retornoMensagem = retornoMensagem;
		this.retornoProtocoloRecebimento = retornoProtocoloRecebimento;
		this.retornoDataOperacao = retornoDataOperacao;
		this.retornoRecibo = retornoRecibo;
		this.saiConteudoRetornado = saiConteudoRetornado;
		this.saiDataAtualizacaoRegistro = saiDataAtualizacaoRegistro;
		this.saiErroSistema = saiErroSistema;
	}

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "entra_status_processamento")
	private String entraStatusProcessamento;

	@Column(name = "id_manifestante")
	private BigInteger idManifestante;

	@Column(name = "senha_manifestante")
	private String senhaManifestante;

	@Column(name = "classe_processual")
	private BigInteger classeProcessual;
	
	@Column(name = "codigo_localidade")
	private BigInteger codigoLocalidade;
	
	@Column(name = "competencia")
	private BigInteger competencia;

	@Column(name = "modalidade_vinculacao_processo")
	private String modalidadeVinculacaoProcesso;

	@Column(name = "prioridade")
	private String prioridade;

	@Column(name = "valor_causa")
	private BigInteger valorCausa;

	@Column(name = "assistencia_judiciaria")
	private Boolean assistenciaJudiciaria;

	@Column(name = "nivel_sigilo")
	private BigInteger nivelSigilo;

	@Column(name = "data_ajuizamento")
	private String dataAjuizamento;

	@Column(name = "outro_parametro")
	private String outroParametro;

	@Column(name = "polo")
	private String polo;

	@Column(name = "parte_nome")
	private String parteNome;

	@Column(name = "parte_sexo")
	private String parteSexo;

	@Column(name = "parte_nome_genitor")
	private String parteNomeGenitor;

	@Column(name = "parte_nome_genitora")
	private String parteNomeGenitora;

	@Column(name = "parte_data_nascimento")
	private String parteDataNascimento;

	@Column(name = "parte_data_obito")
	private String parteDataObito;

	@Column(name = "parte_numero_documento_principal")
	private BigInteger parteNumeroDocumentoPrincipal;

	@Column(name = "parte_tipo_pessoa")
	private String parteTipoPessoa;

	@Column(name = "parte_cidade_natural")
	private String parteCidadeNatural;

	@Column(name = "parte_estado_natural")
	private String parteEstadoNatural;

	@Column(name = "parte_nacionalidade")
	private String parteNacionalidade;

	@Column(name = "parte_codigo_documento")
	private String parteCodigoDocumento;

	@Column(name = "parte_emissor_documento")
	private String parteEmissorDocumento;

	@Column(name = "parte_tipo_documento")
	private String parteTipoDocumento;

	@Column(name = "parte_nome_detentora")
	private String parteNomeDetentora;

	@Column(name = "parte_outro_nome")
	private String parteOutroNome;

	@Column(name = "endereco_cep")
	private BigInteger enderecoCep;

	@Column(name = "endereco_logradouro")
	private String enderecoLogradouro;

	@Column(name = "endereco_numero")
	private String enderecoNumero;

	@Column(name = "endereco_complemento")
	private String enderecoComplemento;

	@Column(name = "endereco_bairro")
	private String enderecoBairro;

	@Column(name = "endereco_cidade")
	private String enderecoCidade;

	@Column(name = "endereco_estado")
	private String enderecoEstado;

	@Column(name = "endereco_pais")
	private String enderecoPais;

	@Column(name = "repres_processual_intimacao")
	private Boolean represProcessualIntimacao;

	@Column(name = "repres_processual_nome")
	private String represProcessualNome;

	@Column(name = "repres_processual_inscricao")
	private String represProcessualInscricao;

	@Column(name = "repres_processual_numero_documento_principal")
	private String represProcessualNumeroDocumentoPrincipal;

	@Column(name = "repres_processual_tipo_representante")
	private String represProcessualTipoRepresentante;

	@Column(name = "assunto_processual_principal")
	private Boolean assuntoProcessualPrincipal;

	@Column(name = "assunto_processual_codigo_nacional")
	private BigInteger assuntoProcessualCodigoNacional;

	@Column(name = "assunto_processual_codigo_assunto")
	private BigInteger assuntoProcessualCodigoAssunto;

	@Column(name = "assunto_processual_codigo_pai_acional")
	private BigInteger assuntoProcessualPodigoPaiNacional;

	@Column(name = "assunto_processual_descricao")
	private BigInteger assuntoProcessualDescricao;

	@Column(name = "id_documento")
	private String idDocumento;

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

	@Column(name = "assinatura")
	private String assinatura;

	@Column(name = "algoritmo_hash_assinatura")
	private String algoritmoHashAssinatura;

	@Column(name = "cadeia_certificado_assinatura")
	private String cadeiaCertificadoAssinatura;

	@Column(name = "codificacao_certificado_assinatura")
	private String codificacaoCertificadoAssinatura;

	@Column(name = "retorno_sucesso")
	private Boolean retornoSucesso;

	@Column(name = "retorno_mensagem")
	private String retornoMensagem;

	@Column(name = "retorno_protocolo_recebimento")
	private BigInteger retornoProtocoloRecebimento;

	@Column(name = "retorno_data_operacao")
	private String retornoDataOperacao;

	@Column(name = "retorno_recibo")
	private String retornoRecibo;

	@Column(name = "sai_conteudo_retornado")
	private String saiConteudoRetornado;

	@Column(name = "sai_data_atualizacao_registro")
	private String saiDataAtualizacaoRegistro;

	@Column(name = "sai_erro_sistema")
	private String saiErroSistema;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEntraStatusProcessamento() {
		return entraStatusProcessamento;
	}

	public void setEntraStatusProcessamento(String entraStatusProcessamento) {
		this.entraStatusProcessamento = entraStatusProcessamento;
	}

	public BigInteger getIdManifestante() {
		return idManifestante;
	}

	public void setIdManifestante(BigInteger idManifestante) {
		this.idManifestante = idManifestante;
	}

	public String getSenhaManifestante() {
		return senhaManifestante;
	}

	public void setSenhaManifestante(String senhaManifestante) {
		this.senhaManifestante = senhaManifestante;
	}

	public BigInteger getClasseProcessual() {
		return classeProcessual;
	}

	public void setClasseProcessual(BigInteger classeProcessual) {
		this.classeProcessual = classeProcessual;
	}

	public BigInteger getCodigoLocalidade() {
		return codigoLocalidade;
	}

	public void setCodigoLocalidade(BigInteger codigoLocalidade) {
		this.codigoLocalidade = codigoLocalidade;
	}

	public BigInteger getCompetencia() {
		return competencia;
	}

	public void setCompetencia(BigInteger competencia) {
		this.competencia = competencia;
	}

	public String getModalidadeVinculacaoProcesso() {
		return modalidadeVinculacaoProcesso;
	}

	public void setModalidadeVinculacaoProcesso(String modalidadeVinculacaoProcesso) {
		this.modalidadeVinculacaoProcesso = modalidadeVinculacaoProcesso;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public BigInteger getValorCausa() {
		return valorCausa;
	}

	public void setValorCausa(BigInteger valorCausa) {
		this.valorCausa = valorCausa;
	}

	public Boolean getAssistenciaJudiciaria() {
		return assistenciaJudiciaria;
	}

	public void setAssistenciaJudiciaria(Boolean assistenciaJudiciaria) {
		this.assistenciaJudiciaria = assistenciaJudiciaria;
	}

	public BigInteger getNivelSigilo() {
		return nivelSigilo;
	}

	public void setNivelSigilo(BigInteger nivelSigilo) {
		this.nivelSigilo = nivelSigilo;
	}

	public String getDataAjuizamento() {
		return dataAjuizamento;
	}

	public void setDataAjuizamento(String dataAjuizamento) {
		this.dataAjuizamento = dataAjuizamento;
	}

	public String getOutroParametro() {
		return outroParametro;
	}

	public void setOutroParametro(String outroParametro) {
		this.outroParametro = outroParametro;
	}

	public String getPolo() {
		return polo;
	}

	public void setPolo(String polo) {
		this.polo = polo;
	}

	public String getParteNome() {
		return parteNome;
	}

	public void setParteNome(String parteNome) {
		this.parteNome = parteNome;
	}

	public String getParteSexo() {
		return parteSexo;
	}

	public void setParteSexo(String parteSexo) {
		this.parteSexo = parteSexo;
	}

	public String getParteNomeGenitor() {
		return parteNomeGenitor;
	}

	public void setParteNomeGenitor(String parteNomeGenitor) {
		this.parteNomeGenitor = parteNomeGenitor;
	}

	public String getParteNomeGenitora() {
		return parteNomeGenitora;
	}

	public void setParteNomeGenitora(String parteNomeGenitora) {
		this.parteNomeGenitora = parteNomeGenitora;
	}

	public String getParteDataNascimento() {
		return parteDataNascimento;
	}

	public void setParteDataNascimento(String parteDataNascimento) {
		this.parteDataNascimento = parteDataNascimento;
	}

	public String getParteDataObito() {
		return parteDataObito;
	}

	public void setParteDataObito(String parteDataObito) {
		this.parteDataObito = parteDataObito;
	}

	public BigInteger getParteNumeroDocumentoPrincipal() {
		return parteNumeroDocumentoPrincipal;
	}

	public void setParteNumeroDocumentoPrincipal(BigInteger parteNumeroDocumentoPrincipal) {
		this.parteNumeroDocumentoPrincipal = parteNumeroDocumentoPrincipal;
	}

	public String getParteTipoPessoa() {
		return parteTipoPessoa;
	}

	public void setParteTipoPessoa(String parteTipoPessoa) {
		this.parteTipoPessoa = parteTipoPessoa;
	}

	public String getParteCidadeNatural() {
		return parteCidadeNatural;
	}

	public void setParteCidadeNatural(String parteCidadeNatural) {
		this.parteCidadeNatural = parteCidadeNatural;
	}

	public String getParteEstadoNatural() {
		return parteEstadoNatural;
	}

	public void setParteEstadoNatural(String parteEstadoNatural) {
		this.parteEstadoNatural = parteEstadoNatural;
	}

	public String getParteNacionalidade() {
		return parteNacionalidade;
	}

	public void setParteNacionalidade(String parteNacionalidade) {
		this.parteNacionalidade = parteNacionalidade;
	}

	public String getParteCodigoDocumento() {
		return parteCodigoDocumento;
	}

	public void setParteCodigoDocumento(String parteCodigoDocumento) {
		this.parteCodigoDocumento = parteCodigoDocumento;
	}

	public String getParteEmissorDocumento() {
		return parteEmissorDocumento;
	}

	public void setParteEmissorDocumento(String parteEmissorDocumento) {
		this.parteEmissorDocumento = parteEmissorDocumento;
	}

	public String getParteTipoDocumento() {
		return parteTipoDocumento;
	}

	public void setParteTipoDocumento(String parteTipoDocumento) {
		this.parteTipoDocumento = parteTipoDocumento;
	}

	public String getParteNomeDetentora() {
		return parteNomeDetentora;
	}

	public void setParteNomeDetentora(String parteNomeDetentora) {
		this.parteNomeDetentora = parteNomeDetentora;
	}

	public String getParteOutroNome() {
		return parteOutroNome;
	}

	public void setParteOutroNome(String parteOutroNome) {
		this.parteOutroNome = parteOutroNome;
	}

	public BigInteger getEnderecoCep() {
		return enderecoCep;
	}

	public void setEnderecoCep(BigInteger enderecoCep) {
		this.enderecoCep = enderecoCep;
	}

	public String getEnderecoLogradouro() {
		return enderecoLogradouro;
	}

	public void setEnderecoLogradouro(String enderecoLogradouro) {
		this.enderecoLogradouro = enderecoLogradouro;
	}

	public String getEnderecoNumero() {
		return enderecoNumero;
	}

	public void setEnderecoNumero(String enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}

	public String getEnderecoComplemento() {
		return enderecoComplemento;
	}

	public void setEnderecoComplemento(String enderecoComplemento) {
		this.enderecoComplemento = enderecoComplemento;
	}

	public String getEnderecoBairro() {
		return enderecoBairro;
	}

	public void setEnderecoBairro(String enderecoBairro) {
		this.enderecoBairro = enderecoBairro;
	}

	public String getEnderecoCidade() {
		return enderecoCidade;
	}

	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}

	public String getEnderecoEstado() {
		return enderecoEstado;
	}

	public void setEnderecoEstado(String enderecoEstado) {
		this.enderecoEstado = enderecoEstado;
	}

	public String getEnderecoPais() {
		return enderecoPais;
	}

	public void setEnderecoPais(String enderecoPais) {
		this.enderecoPais = enderecoPais;
	}

	public Boolean getRepresProcessualIntimacao() {
		return represProcessualIntimacao;
	}

	public void setRepresProcessualIntimacao(Boolean represProcessualIntimacao) {
		this.represProcessualIntimacao = represProcessualIntimacao;
	}

	public String getRepresProcessualNome() {
		return represProcessualNome;
	}

	public void setRepresProcessualNome(String represProcessualNome) {
		this.represProcessualNome = represProcessualNome;
	}

	public String getRepresProcessualInscricao() {
		return represProcessualInscricao;
	}

	public void setRepresProcessualInscricao(String represProcessualInscricao) {
		this.represProcessualInscricao = represProcessualInscricao;
	}

	public String getRepresProcessualNumeroDocumentoPrincipal() {
		return represProcessualNumeroDocumentoPrincipal;
	}

	public void setRepresProcessualNumeroDocumentoPrincipal(String represProcessualNumeroDocumentoPrincipal) {
		this.represProcessualNumeroDocumentoPrincipal = represProcessualNumeroDocumentoPrincipal;
	}

	public String getRepresProcessualTipoRepresentante() {
		return represProcessualTipoRepresentante;
	}

	public void setRepresProcessualTipoRepresentante(String represProcessualTipoRepresentante) {
		this.represProcessualTipoRepresentante = represProcessualTipoRepresentante;
	}

	public Boolean getAssuntoProcessualPrincipal() {
		return assuntoProcessualPrincipal;
	}

	public void setAssuntoProcessualPrincipal(Boolean assuntoProcessualPrincipal) {
		this.assuntoProcessualPrincipal = assuntoProcessualPrincipal;
	}

	public BigInteger getAssuntoProcessualCodigoNacional() {
		return assuntoProcessualCodigoNacional;
	}

	public void setAssuntoProcessualCodigoNacional(BigInteger assuntoProcessualCodigoNacional) {
		this.assuntoProcessualCodigoNacional = assuntoProcessualCodigoNacional;
	}

	public BigInteger getAssuntoProcessualCodigoAssunto() {
		return assuntoProcessualCodigoAssunto;
	}

	public void setAssuntoProcessualCodigoAssunto(BigInteger assuntoProcessualCodigoAssunto) {
		this.assuntoProcessualCodigoAssunto = assuntoProcessualCodigoAssunto;
	}

	public BigInteger getAssuntoProcessualPodigoPaiNacional() {
		return assuntoProcessualPodigoPaiNacional;
	}

	public void setAssuntoProcessualPodigoPaiNacional(BigInteger assuntoProcessualPodigoPaiNacional) {
		this.assuntoProcessualPodigoPaiNacional = assuntoProcessualPodigoPaiNacional;
	}

	public BigInteger getAssuntoProcessualDescricao() {
		return assuntoProcessualDescricao;
	}

	public void setAssuntoProcessualDescricao(BigInteger assuntoProcessualDescricao) {
		this.assuntoProcessualDescricao = assuntoProcessualDescricao;
	}

	public String getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getTipoDocumentoConsultapje() {
		return tipoDocumentoConsultapje;
	}

	public void setTipoDocumentoConsultapje(String tipoDocumentoConsultapje) {
		this.tipoDocumentoConsultapje = tipoDocumentoConsultapje;
	}

	public String getDataHoraDocumento() {
		return dataHoraDocumento;
	}

	public void setDataHoraDocumento(String dataHoraDocumento) {
		this.dataHoraDocumento = dataHoraDocumento;
	}

	public String getDescricaoDocumento() {
		return descricaoDocumento;
	}

	public void setDescricaoDocumento(String descricaoDocumento) {
		this.descricaoDocumento = descricaoDocumento;
	}

	public String getHashDocumento() {
		return hashDocumento;
	}

	public void setHashDocumento(String hashDocumento) {
		this.hashDocumento = hashDocumento;
	}

	public BigInteger getNivelSigiloDocumento() {
		return nivelSigiloDocumento;
	}

	public void setNivelSigiloDocumento(BigInteger nivelSigiloDocumento) {
		this.nivelSigiloDocumento = nivelSigiloDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getConteudoDocumento() {
		return conteudoDocumento;
	}

	public void setConteudoDocumento(String conteudoDocumento) {
		this.conteudoDocumento = conteudoDocumento;
	}

	public String getMimetypeDocumento() {
		return mimetypeDocumento;
	}

	public void setMimetypeDocumento(String mimetypeDocumento) {
		this.mimetypeDocumento = mimetypeDocumento;
	}

	public String getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(String assinatura) {
		this.assinatura = assinatura;
	}

	public String getAlgoritmoHashAssinatura() {
		return algoritmoHashAssinatura;
	}

	public void setAlgoritmoHashAssinatura(String algoritmoHashAssinatura) {
		this.algoritmoHashAssinatura = algoritmoHashAssinatura;
	}

	public String getCadeiaCertificadoAssinatura() {
		return cadeiaCertificadoAssinatura;
	}

	public void setCadeiaCertificadoAssinatura(String cadeiaCertificadoAssinatura) {
		this.cadeiaCertificadoAssinatura = cadeiaCertificadoAssinatura;
	}

	public String getCodificacaoCertificadoAssinatura() {
		return codificacaoCertificadoAssinatura;
	}

	public void setCodificacaoCertificadoAssinatura(String codificacaoCertificadoAssinatura) {
		this.codificacaoCertificadoAssinatura = codificacaoCertificadoAssinatura;
	}

	public Boolean getRetornoSucesso() {
		return retornoSucesso;
	}

	public void setRetornoSucesso(Boolean retornoSucesso) {
		this.retornoSucesso = retornoSucesso;
	}

	public String getRetornoMensagem() {
		return retornoMensagem;
	}

	public void setRetornoMensagem(String retornoMensagem) {
		this.retornoMensagem = retornoMensagem;
	}

	public BigInteger getRetornoProtocoloRecebimento() {
		return retornoProtocoloRecebimento;
	}

	public void setRetornoProtocoloRecebimento(BigInteger retornoProtocoloRecebimento) {
		this.retornoProtocoloRecebimento = retornoProtocoloRecebimento;
	}

	public String getRetornoDataOperacao() {
		return retornoDataOperacao;
	}

	public void setRetornoDataOperacao(String retornoDataOperacao) {
		this.retornoDataOperacao = retornoDataOperacao;
	}

	public String getRetornoRecibo() {
		return retornoRecibo;
	}

	public void setRetornoRecibo(String retornoRecibo) {
		this.retornoRecibo = retornoRecibo;
	}

	public String getSaiConteudoRetornado() {
		return saiConteudoRetornado;
	}

	public void setSaiConteudoRetornado(String saiConteudoRetornado) {
		this.saiConteudoRetornado = saiConteudoRetornado;
	}

	public String getSaiDataAtualizacaoRegistro() {
		return saiDataAtualizacaoRegistro;
	}

	public void setSaiDataAtualizacaoRegistro(String saiDataAtualizacaoRegistro) {
		this.saiDataAtualizacaoRegistro = saiDataAtualizacaoRegistro;
	}

	public String getSaiErroSistema() {
		return saiErroSistema;
	}

	public void setSaiErroSistema(String saiErroSistema) {
		this.saiErroSistema = saiErroSistema;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

