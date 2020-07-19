package br.com.edza.cjus.service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.activation.DataHandler;
import javax.mail.util.ByteArrayDataSource;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.edza.cjus.model.cjus.Advogado;
import br.com.edza.cjus.model.cjus.Assinatura;
import br.com.edza.cjus.model.cjus.AssuntoProcessual;
import br.com.edza.cjus.model.cjus.DadoBasico;
import br.com.edza.cjus.model.cjus.Documento;
import br.com.edza.cjus.model.cjus.DocumentoIdentificacao;
import br.com.edza.cjus.model.cjus.Endereco;
import br.com.edza.cjus.model.cjus.ManifestacaoProcessual;
import br.com.edza.cjus.model.cjus.OutroNome;
import br.com.edza.cjus.model.cjus.Parte;
import br.com.edza.cjus.model.cjus.Pessoa;
import br.com.edza.cjus.model.cjus.Polo;
import br.com.edza.cjus.model.cjus.Prioridade;
import br.com.edza.cjus.model.cjus.ProcessoVinculado;
import br.com.edza.cjus.repository.ManifestacaoProcessualRepository;
import br.jus.cnj.intercomunicacao_2_2.ModalidadeDocumentoIdentificador;
import br.jus.cnj.intercomunicacao_2_2.ModalidadeGeneroPessoa;
import br.jus.cnj.intercomunicacao_2_2.ModalidadeRepresentanteProcessual;
import br.jus.cnj.intercomunicacao_2_2.ModalidadeVinculacaoProcesso;
import br.jus.cnj.intercomunicacao_2_2.TipoAssinatura;
import br.jus.cnj.intercomunicacao_2_2.TipoAssuntoProcessual;
import br.jus.cnj.intercomunicacao_2_2.TipoCabecalhoProcesso;
import br.jus.cnj.intercomunicacao_2_2.TipoDocumento;
import br.jus.cnj.intercomunicacao_2_2.TipoDocumentoIdentificacao;
import br.jus.cnj.intercomunicacao_2_2.TipoEndereco;
import br.jus.cnj.intercomunicacao_2_2.TipoParte;
import br.jus.cnj.intercomunicacao_2_2.TipoPessoa;
import br.jus.cnj.intercomunicacao_2_2.TipoPoloProcessual;
import br.jus.cnj.intercomunicacao_2_2.TipoQualificacaoPessoa;
import br.jus.cnj.intercomunicacao_2_2.TipoRepresentanteProcessual;
import br.jus.cnj.intercomunicacao_2_2.TipoVinculacaoProcessual;
import br.jus.cnj.servico_intercomunicacao_2_2_2.ServicoIntercomunicacao222;
import br.jus.cnj.tipos_servico_intercomunicacao_2_2.TipoEntregarManifestacaoProcessual;

@Component
public class ClientPjeService {	
	
    @Autowired
    ServicoIntercomunicacao222 pjeService;
  
    @Autowired
    private ManifestacaoProcessualRepository repository;

    private final static String TIMESTAMP_PATTERN = "yyyy-MM-dd";
    private final static DateFormat TIMESTAMP_FORMATTER = new SimpleDateFormat(TIMESTAMP_PATTERN);
    private final static TimeZone IST_TIMEZONE = TimeZone.getTimeZone("IST");

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter dateTimeFormatter_yyyyMMddHHmmss = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    
    
    public void entregarManifestacaoProcessual() {
    	
   	   	List<ManifestacaoProcessual> processos = repository.consultaRegistrosProcessar();
   	   	for (ManifestacaoProcessual processo : processos) {
   	   		TipoEntregarManifestacaoProcessual tienmap = new TipoEntregarManifestacaoProcessual();

//   	   		tienmap.setDataEnvio(value);
   	   		tienmap.setIdManifestante(processo.getIdManifestante());
//   	   		tienmap.setNumeroProcesso(processo.getn);
   	   		tienmap.setSenhaManifestante(processo.getSenhaManifestante());
   	    		
   	   	    try {
   	   	    	List<Documento> documentosProcesso = processo.getDocumentos();
   	   	    	for (Documento documentoProcesso:documentosProcesso) {
   	   	    		TipoDocumento td = new TipoDocumento();
   	   	    		String conteudoDocumento = documentoProcesso.getConteudoDocumento();
					ByteArrayDataSource ds = new ByteArrayDataSource(conteudoDocumento.getBytes(),"text/plain");
					td.setConteudo(new DataHandler(ds));
   	   	    		td.setDataHora(documentoProcesso.getDataHoraDocumento());
   	   	    		td.setDescricao(documentoProcesso.getDescricaoDocumento());
   	   	    		td.setHash(documentoProcesso.getHashDocumento());
   	   	    		td.setIdDocumento(documentoProcesso.getIdDocumento());
   	   	    		td.setIdDocumentoVinculado(documentoProcesso.getIdDocumentoVinculado());
   	   	    		td.setMimetype(documentoProcesso.getMimetypeDocumento());
   	   	    		td.setNivelSigilo(documentoProcesso.getNivelSigiloDocumento());
   	   	    		td.setTipoDocumentoLocal(documentoProcesso.getTipoDocumento());
   	   	    		td.setTipoDocumento(documentoProcesso.getTipoDocumentoConsultapje());
   	   	    		List<Assinatura> assinaturasDocumentos = documentoProcesso.getAssinatura();
   	   	    		for (Assinatura assinaturaDocumento:assinaturasDocumentos) {
   	   	    			TipoAssinatura ta = new TipoAssinatura();
   	   	    			ta.setAlgoritmoHash(assinaturaDocumento.getAlgoritmo_hash_assinatura());
   	   	    			ta.setAssinatura(assinaturaDocumento.getAssinatura());
   	   	    			ta.setCadeiaCertificado(assinaturaDocumento.getCadeia_certificado_assinatura());
   	   	    			ta.setCodificacaoCertificado(assinaturaDocumento.getCodificacao_certificado_assinatura());
   	   	    			ta.setDataAssinatura(assinaturaDocumento.getData_assinatura());
   	   	    			td.getAssinatura().add(ta);
   	   	    		}
   	   	    		tienmap.getDocumento().add(td);
   	   	    	}
   	    	    	
   	   	    	List<DadoBasico> dadosBasicos = processo.getDadoBasico();
   	   	    	for (DadoBasico dadoBasico:dadosBasicos) {
   	   	    		TipoCabecalhoProcesso tdb = new TipoCabecalhoProcesso();
   	   	    		tdb.setClasseProcessual(dadoBasico.getClasseProcessual());
   	   	    		tdb.setCodigoLocalidade(dadoBasico.getCodigoLocalidade());
   	   	    		tdb.setCompetencia(dadoBasico.getCompetencia());
   	   	    		tdb.setDataAjuizamento(dadoBasico.getDataAjuizamento());
   	   	    		tdb.setNivelSigilo(dadoBasico.getNivelSigilo());
//  	    	    		tdb.setNumero();
//  	    	    		tdb.setOrgaoJulgador(dadoBasico.get);
//  	    	    		tdb.setTamanhoProcesso(dadoBasico.get);
   	   	    		tdb.setValorCausa(dadoBasico.getValorCausa());

   	   	    		List<AssuntoProcessual> assuntos = dadoBasico.getAssuntos();
   	    	    	for (AssuntoProcessual assunto:assuntos) {
   	    	    		TipoAssuntoProcessual tap = new TipoAssuntoProcessual();

//   	    	    		TipoAssuntoLocal tal = new TipoAssuntoLocal();
//   	    	    		tal.setAssuntoLocalPai(value);
//   	    	    		tal.setCodigoAssunto(value);
//   	    	    		tal.setCodigoPaiNacional(value);
//   	    	    		tal.setDescricao(value);
//   	    	    		tap.setAssuntoLocal(tal);
   	    	    		
   	    	    		tap.setCodigoNacional(assunto.getCodigoNacional());
   	    	    		tap.setPrincipal(assunto.getPrincipal());
   	    	    		tdb.getAssunto().add(tap);
   	    	    	}
   	    	    		
   	    	    	List<ProcessoVinculado> processosVinculados = dadoBasico.getPrcessosVinculados();
   	    	    	for (ProcessoVinculado processoVinculado:processosVinculados) {
   	    	    		TipoVinculacaoProcessual tpv = new TipoVinculacaoProcessual();
   	    	    		tpv.setNumeroProcesso(processoVinculado.getNumeroProcesso());
   	    	    		ModalidadeVinculacaoProcesso fromValue = ModalidadeVinculacaoProcesso.fromValue(processoVinculado.getVinculo());
   	    	    		tpv.setVinculo(fromValue);
   	    	    		tdb.getProcessoVinculado().add(tpv);
   	    	    	}
   	    	    		
   	    	    	List<Prioridade> prioridades = dadoBasico.getPrioridades();
   	    	    	for (Prioridade prioridade:prioridades) {
   	    	    		String tp = prioridade.getPrioridade();
   	    	    		tdb.getPrioridade().add(tp);
   	    	    	}
   	    	    		
   	    	    	List<Polo> polos = dadoBasico.getPolo();
   	    	    	for (Polo polo:polos) {
   	    	    		TipoPoloProcessual tp = new TipoPoloProcessual();
//   	    	    		ModalidadePoloProcessual.valueOf(polo.get Modalidade Processual);

   	    	    		List<Parte> partes = polo.getPartes();
   	    	    		for (Parte parte:partes) {
   	    	    			TipoParte tpp = new TipoParte();
   	    	    			tpp.setAssistenciaJudiciaria(parte.getAssistencia_judiciaria());
//   	    	    			tpp.setInteressePublico(parte.get);
   	    	    			tpp.setIntimacaoPendente(parte.getIntimacaoPendente());
//   	    	    				tpp.setRelacionamentoProcessual();
   	    	    				
   	    	    			List<Advogado> advogados = parte.getAdvogados();
   	    	    			for (Advogado advogado:advogados) {

   	    	    				TipoRepresentanteProcessual adv = new TipoRepresentanteProcessual();
   	    	    				adv.setInscricao(advogado.getInscricao());
   	    	    				adv.setIntimacao(advogado.getIntimacao());
   	    	    				adv.setNome(advogado.getNome());
   	    	    				adv.setNumeroDocumentoPrincipal(advogado.getNumeroDocumentoPrincipal());
   	    	    				ModalidadeRepresentanteProcessual fromValue = ModalidadeRepresentanteProcessual.fromValue(advogado.getTipoRepresentante());
   	    	    				adv.setTipoRepresentante(fromValue);
   	    	    				List<Endereco> enderecosAdv = advogado.getEnderecos();
   	    	    				for (Endereco enderecoAdv:enderecosAdv) {
   	    	    					TipoEndereco enderecoAdvogado = new TipoEndereco(); 
   	   	    	    				enderecoAdvogado.setBairro(enderecoAdv.getBairro());
   	   	    	    				enderecoAdvogado.setCep(enderecoAdv.getCep());
   	   	    	    				enderecoAdvogado.setCidade(enderecoAdv.getCidade());
   	   	    	    				enderecoAdvogado.setComplemento(enderecoAdv.getComplemento());
   	   	    	    				enderecoAdvogado.setEstado(enderecoAdv.getEstado());
   	   	    	    				enderecoAdvogado.setLogradouro(enderecoAdv.getLogradouro());
   	   	    	    				enderecoAdvogado.setNumero(enderecoAdv.getNumero());
   	   	    	    				enderecoAdvogado.setPais(enderecoAdv.getPais());
   	   	    	    				adv.getEndereco().add(enderecoAdvogado);	
   	    	    				}
   	    	    				tpp.getAdvogado().add(adv);
   	    	    			}
   	    	    				
   	    	    			Pessoa pessoaParte = parte.getPessoa();
    	    				TipoPessoa tpa = new TipoPessoa();
    	    				tpa.setCidadeNatural(pessoaParte.getCidadeNatural());
    	    				tpa.setDataNascimento(pessoaParte.getDataNascimento());
    	    				tpa.setDataObito(pessoaParte.getDataObito());
    	    				tpa.setEstadoNatural(pessoaParte.getEstadoNatural());
    	    				tpa.setNacionalidade(pessoaParte.getNacionalidade());
    	    				tpa.setNome(pessoaParte.getNome());
    	    				tpa.setNomeGenitor(pessoaParte.getNomeGenitor());
    	    				tpa.setNomeGenitora(pessoaParte.getNomeGenitora());
    	    				tpa.setNumeroDocumentoPrincipal(pessoaParte.getNumeroDocumentoPrincipal());
//   	    	    				tpa.setPessoaVinculada(pessoaParte.get);
    	    				ModalidadeGeneroPessoa fromValue = ModalidadeGeneroPessoa.fromValue(pessoaParte.getSexo());
    	    				tpa.setSexo(fromValue);
    	    				TipoQualificacaoPessoa fromValue2 = TipoQualificacaoPessoa.fromValue(pessoaParte.getTipoPessoa());
    	    				tpa.setTipoPessoa(fromValue2);
   	    	    					
    	   					List<Endereco> enderecosPessoaParte = pessoaParte.getEnderecos();
    	   					for (Endereco enderecoPessoaParte:enderecosPessoaParte) {
    	   						TipoEndereco endPessoaParte = new TipoEndereco(); 
    	   						endPessoaParte.setBairro(enderecoPessoaParte.getBairro());
    	   						endPessoaParte.setCep(enderecoPessoaParte.getCep());
    	   						endPessoaParte.setCidade(enderecoPessoaParte.getCidade());
    	   						endPessoaParte.setComplemento(enderecoPessoaParte.getComplemento());
    	   						endPessoaParte.setEstado(enderecoPessoaParte.getEstado());
    	   						endPessoaParte.setLogradouro(enderecoPessoaParte.getLogradouro());
    	   						endPessoaParte.setNumero(enderecoPessoaParte.getNumero());
    	   						endPessoaParte.setPais(enderecoPessoaParte.getPais());
    	   						tpa.getEndereco().add(endPessoaParte);	
    	   					}
   	    	    					
    	   					List<DocumentoIdentificacao> documentosIdentificacao = pessoaParte.getDocumentosIdentificacao();
    	   					for (DocumentoIdentificacao documentoIdentificacao:documentosIdentificacao) {
    	   						TipoDocumentoIdentificacao tdoci = new TipoDocumentoIdentificacao();
    	   						tdoci.setCodigoDocumento(documentoIdentificacao.getCodigoDocumento());
    	   						tdoci.setEmissorDocumento(documentoIdentificacao.getEmissorDocumento());
    	   						tdoci.setNome(documentoIdentificacao.getNomeDetentora());
    	   						tdoci.setTipoDocumento(ModalidadeDocumentoIdentificador.fromValue(documentoIdentificacao.getTipoDocumento()));
    	   						tpa.getDocumento().add(tdoci);
    	   					}
   	    	   					
    	   					List<OutroNome> outrosNomes = pessoaParte.getOutrosNomes();
    	   					for (OutroNome outroNome:outrosNomes) {
    	   						tpa.getOutroNome().add(outroNome.getOutroNome());
    	   					}
    	    				tpp.setPessoa(tpa);
   	    	   			}
   	    	   		}
   	    	   		tienmap.setDadosBasicos(tdb);
   	    	   	}
   	   	    	pjeService.entregarManifestacaoProcessual(tienmap);
   	   	    	repository.save(processo);
	         }  
   	   	   	catch (Exception ex) {
   	 	       	StringWriter errors = new StringWriter();
   	 	       	ex.printStackTrace(new PrintWriter(errors));
   	 	       	processo.setSaiErroSistema(errors.toString());
   	    	       processo.setEntraStatusProcessamento("99");
   	    	       processo.setSaiDataAtualizacaoRegistro(dateTimeFormatter.format(LocalDateTime.now()));
    		    repository.save(processo);
    		    repository.flush();
   	 	    }
   	   	}
    }    
    
    private static String formatTimeStamp(XMLGregorianCalendar cal)
    {
        if (cal == null)
          return "";
       else
       {
          return TIMESTAMP_FORMATTER.format(cal.toGregorianCalendar(IST_TIMEZONE, Locale.US, null).getTime());
       }
    }
    
    
}
		
