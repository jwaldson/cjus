package br.com.edza.cjus.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.stream.Collectors;

import javax.activation.DataHandler;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sun.xml.ws.util.ByteArrayDataSource;

import br.com.edza.cjus.model.cjus.DadoBasico;
import br.com.edza.cjus.model.cjus.Documento;
import br.com.edza.cjus.model.cjus.EntregarProcesso;
import br.com.edza.cjus.model.cjus.ManifestacaoProcessual;
import br.com.edza.cjus.repository.ManifestacaoProcessualRepository;
import br.jus.cnj.intercomunicacao_2_2.ModalidadeDocumentoIdentificador;
import br.jus.cnj.intercomunicacao_2_2.ModalidadePoloProcessual;
import br.jus.cnj.intercomunicacao_2_2.ModalidadeRepresentanteProcessual;
import br.jus.cnj.intercomunicacao_2_2.TipoAssinatura;
import br.jus.cnj.intercomunicacao_2_2.TipoCabecalhoProcesso;
import br.jus.cnj.intercomunicacao_2_2.TipoDocumento;
import br.jus.cnj.intercomunicacao_2_2.TipoDocumentoIdentificacao;
import br.jus.cnj.intercomunicacao_2_2.TipoEndereco;
import br.jus.cnj.intercomunicacao_2_2.TipoParte;
import br.jus.cnj.intercomunicacao_2_2.TipoPessoa;
import br.jus.cnj.intercomunicacao_2_2.TipoPoloProcessual;
import br.jus.cnj.intercomunicacao_2_2.TipoQualificacaoPessoa;
import br.jus.cnj.intercomunicacao_2_2.TipoRepresentanteProcessual;
import br.jus.cnj.servico_intercomunicacao_2_2_2.ServicoIntercomunicacao222;
import br.jus.cnj.tipos_servico_intercomunicacao_2_2.TipoEntregarManifestacaoProcessual;
import br.jus.cnj.tipos_servico_intercomunicacao_2_2.TipoEntregarManifestacaoProcessualResposta;

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
   	    	    try {
   	    	    	
   	    	    	List<DadoBasico> dadoBasico = processo.getDadoBasico();
   	    	    	List<Documento> documentos = processo.getDocumentos();
   	    		
//	   	    		TipoEntregarManifestacaoProcessual man = new TipoEntregarManifestacaoProcessual();
//		   	    	
//	   	    		TipoCabecalhoProcesso cab = new TipoCabecalhoProcesso();
//	   	    		cab.setClasseProcessual(processo.getClasseProcessual()!=null?processo.getClasseProcessual().intValue():null);
//	   	    		cab.setCodigoLocalidade(processo.getCodigoLocalidade()!=null?processo.getCodigoLocalidade().toString():null);
//	   	    		//cab.setNivelSigilo(processo.getNivelSigilo()!=null?processo.getNivelSigilo().intValue():null);
//	   	    		TipoPoloProcessual tpp = new TipoPoloProcessual();
//	   	    		
//	   	    		tpp.setPolo(processo.getPolo()!=null?ModalidadePoloProcessual.fromValue(processo.getPolo()):null);
//	   	    		
//	   	    		TipoParte tp = new TipoParte();
//	   	    		TipoPessoa tipoPessoa = new TipoPessoa();
//	   	    		tipoPessoa.setNome(processo.getParteNome());
//	   	    		tipoPessoa.setTipoPessoa(processo.getParteTipoPessoa()!=null?TipoQualificacaoPessoa.fromValue(processo.getParteTipoPessoa()):null);
//	   	    		
//	   	    		TipoDocumentoIdentificacao tipoDocIdentificacao = new TipoDocumentoIdentificacao();
//	   	    		tipoDocIdentificacao.setCodigoDocumento(processo.getParteCodigoDocumento());
//	   	    		tipoDocIdentificacao.setEmissorDocumento(processo.getParteEmissorDocumento());
//	   	    		tipoDocIdentificacao.setNome(processo.getParteNome());
//	   	    		tipoDocIdentificacao.setTipoDocumento(processo.getParteTipoDocumento()!=null?ModalidadeDocumentoIdentificador.fromValue(processo.getParteTipoDocumento()):null);
//	   	    		
//	   	    		if (tipoPessoa.getDocumento()!=null) tipoPessoa.getDocumento().add(tipoDocIdentificacao);
//	   	    		
//	   	    		TipoEndereco tipoEndereco = new TipoEndereco();
//	   	    		tipoEndereco.setLogradouro(processo.getEnderecoLogradouro()!=null?processo.getEnderecoLogradouro():null);
//	   	    		tipoEndereco.setBairro(processo.getEnderecoBairro()!=null?processo.getEnderecoBairro():null);
//	   	    		tipoEndereco.setCep(processo.getEnderecoCep()!=null?processo.getEnderecoCep().toString():null);
//	   	    		tipoEndereco.setCidade(processo.getEnderecoCidade()!=null?processo.getEnderecoCidade():null);
//	   	    		tipoEndereco.setComplemento(processo.getEnderecoComplemento()!=null?processo.getEnderecoComplemento():null);
//	   	    		tipoEndereco.setEstado(processo.getEnderecoEstado()!=null?processo.getEnderecoEstado():null);
//	   	    		tipoEndereco.setNumero(processo.getEnderecoNumero()!=null?processo.getEnderecoNumero():null);
//	   	    		tipoEndereco.setPais(processo.getEnderecoPais()!=null?processo.getEnderecoPais():null);
//	   	    		tipoPessoa.getEndereco().add(tipoEndereco);
//	   	    		
//	   	    		tp.setPessoa(tipoPessoa);
//	   	    		//tp.setRelacionamentoProcessual(ModalidadeRelacionamentoProcessual.valueOf(processo.getModalidadeVinculacaoProcesso()));
//	   	    		
//	   	    		TipoRepresentanteProcessual tipoRepresentanteProcessual = new TipoRepresentanteProcessual();
//	   	    		tipoRepresentanteProcessual.setNome(processo.getRepresProcessualNome()!=null?processo.getRepresProcessualNome():null);
//	   	    		tipoRepresentanteProcessual.setTipoRepresentante(processo.getRepresProcessualTipoRepresentante()!=null?ModalidadeRepresentanteProcessual.fromValue(processo.getRepresProcessualTipoRepresentante()):null);
//	   	    		tp.getAdvogado().add(tipoRepresentanteProcessual);
//	   	    		tpp.getParte().add(tp);
//	   	    		
//	   	    		cab.getPolo().add(tpp);
//	
//	   	    		TipoDocumento tipoDocumento = new TipoDocumento();
//	   	    		tipoDocumento.setTipoDocumento(processo.getTipoDocumentoConsultapje()!=null?processo.getTipoDocumentoConsultapje():null);
//	   	    		tipoDocumento.setNivelSigilo(processo.getNivelSigilo()!=null?processo.getNivelSigilo().intValue():null);
//	   	   	    		tipoDocumento.setConteudo(processo.getConteudoDocumento()!=null?new DataHandler(new ByteArrayDataSource(processo.getConteudoDocumento().getBytes(),"application/octet-stream")):null);
//	   	    		tipoDocumento.setMimetype(processo.getMimetypeDocumento()!=null?processo.getMimetypeDocumento():null);
//	   	    		tipoDocumento.setTipoDocumentoLocal(processo.getTipoDocumento()!=null?processo.getTipoDocumento():null);
//	   	    		
//	   	    		TipoAssinatura tipoAssinatura = new TipoAssinatura();
//	   	    		tipoAssinatura.setAlgoritmoHash(processo.getAlgoritmoHashAssinatura()!=null?processo.getAlgoritmoHashAssinatura():null);
//	   	    		tipoAssinatura.setAssinatura(processo.getAssinatura()!=null?processo.getAssinatura():null);
//	   	    		tipoAssinatura.setCodificacaoCertificado(processo.getCodificacaoCertificadoAssinatura()!=null?processo.getCodificacaoCertificadoAssinatura():null);
//	   	    		tipoDocumento.getAssinatura().add(tipoAssinatura);
//	   	    		man.getDocumento().add(tipoDocumento);
//	   	    		
//	   	    		man.setIdManifestante(processo.getIdManifestante().toString());
//	   	    		man.setSenhaManifestante(processo.getSenhaManifestante());
//	   	    		man.setDadosBasicos(cab);
//	   	    		
//	   	    		TipoEntregarManifestacaoProcessualResposta entregarManifestacaoProcessual = pjeService.entregarManifestacaoProcessual(man);
//	   	    		
//	   	    		String dataOperacao = entregarManifestacaoProcessual.getDataOperacao();
//	   	    		String mensagem = entregarManifestacaoProcessual.getMensagem();
//	   	    		String protocoloRecebimento = entregarManifestacaoProcessual.getProtocoloRecebimento();
//	   	    		boolean sucesso = entregarManifestacaoProcessual.isSucesso();
//	   	    		DataHandler recibo = entregarManifestacaoProcessual.getRecibo();
//	   	    		processo.setRetornoDataOperacao(dataOperacao);
//	   	    		processo.setRetornoMensagem(mensagem);
//	   	    		processo.setRetornoProtocoloRecebimento(new  BigInteger(protocoloRecebimento));
//	   	    		String sRecibo = new BufferedReader(new InputStreamReader(recibo.getInputStream(), StandardCharsets.UTF_8))
//	   	         						.lines()
//	   	         						.collect(Collectors.joining("\n"));
//	   	    
//	   	    		processo.setRetornoRecibo(sRecibo);
//	   	    		processo.setRetornoSucesso(sucesso);
//	   	    		processo.setEntraStatusProcessamento("01");
//	   	    		repository.save(processo);
   	 	        }  catch (Exception ex) {
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
		
