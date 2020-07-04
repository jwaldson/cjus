DROP TABLE cnj_manifestacao_processual;
CREATE TABLE "public"."cnj_manifestacao_processual"
(
	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	entra_status_processamento varchar(2),
	id_manifestante integer,
	senha_manifestante varchar(200),
	retorno_sucesso boolean,
	retorno_mensagem varchar(200),
	retorno_protocolo_recebimento integer,
	retorno_data_operacao varchar(200),
	retorno_recibo text,
	sai_conteudo_retornado text,
	sai_data_atualizacao_registro varchar(50),
	sai_erro_sistema text,
    CONSTRAINT pk_cnj_manifestacao_processual PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_manifestacao_processual"
    OWNER to postgres;

DROP TABLE cnj_dados_basicos;
CREATE TABLE "public"."cnj_dados_basicos"
(
	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	classe_processual integer,
	codigo_localidade varchar(200),
	competencia integer,
	modalidade_vinculacao_processo varchar(200),
	valor_causa integer,
	nivel_sigilo integer,
	data_ajuizamento varchar(200),
	outro_parametro varchar(200),
	fk_id_mnifestacao_processual bigint,
    CONSTRAINT pk_cnj_dados_basicos PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_dados_basicos"
    OWNER to postgres;

DROP TABLE cnj_polo;
CREATE TABLE "public"."cnj_polo"
(
	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	polo varchar(200),
	fk_id_dados_basicos bigint,
    CONSTRAINT pk_cnj_polo PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_polo"
    OWNER to postgres;


DROP TABLE cnj_parte;

CREATE TABLE "public"."cnj_parte"
(
	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	assistencia_judiciaria boolean,
	intimacaoPendente varchar(200),
	relacionamentoProcessual varchar(200),
	fk_id_polo  bigint,
    CONSTRAINT pk_cnj_parte PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_parte"
    OWNER to postgres;


	
DROP TABLE cnj_pessoa;

CREATE TABLE "public"."cnj_pessoa"
(	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	nome varchar(200),
	sexo varchar(200),
	nome_genitor varchar(200),
	nome_genitora varchar(200),
	data_nascimento varchar(200),
	data_obito varchar(200),
	numero_documento_principal integer,
	tipo_pessoa varchar(200),
	cidade_natural varchar(200),
	estado_natural varchar(200),
	nacionalidade varchar(200),
	fk_id_parte bigint,
	fk_id_advogado bigint,
	fk_id_pessoa bigint,
    CONSTRAINT pk_cnj_pessoa PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_pessoa"
    OWNER to postgres;

DROP TABLE cnj_documento_identificacao;
CREATE TABLE "public"."cnj_documento_identificacao"
(	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	nome varchar(200),
	codigo_documento varchar(200),
	emissor_documento varchar(200),
	tipo_documento varchar(200),
	nome_detentora varchar(200),
	fk_id_pessoa bigint,	
    CONSTRAINT pk_cnj_documento_identificacao PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_documento_identificacao"
    OWNER to postgres;



DROP TABLE cnj_outro_nome;
CREATE TABLE "public"."cnj_outro_nome"
(	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	outro_nome varchar(200),
	fk_id_pessoa bigint,	
    CONSTRAINT pk_cnj_outro_nome PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_outro_nome"
    OWNER to postgres;


DROP TABLE cnj_endereco;

CREATE TABLE "public"."cnj_endereco"
 (  id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
   cep integer,
   logradouro varchar(200),
   numero varchar(200),
   complemento varchar(200),
   bairro varchar(200),
   cidade varchar(200),
   estado varchar(200),
   pais varchar(200),
   fk_id_pessoa bigint,
   fk_id_advogado bigint,
    CONSTRAINT pk_cnj_endereco PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_endereco"
    OWNER to postgres;

DROP TABLE cnj_advogado;

CREATE TABLE "public"."cnj_advogado"  
 (  id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
   repres_processual_intimacao boolean,
   repres_processual_nome varchar(200),
   repres_processual_inscricao varchar(200),
   repres_processual_numero_documento_principal varchar(200),
   repres_processual_tipo_representante varchar(200),
   fk_id_parte bigint,
    CONSTRAINT pk_cnj_advogado PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_advogado"
    OWNER to postgres;

DROP TABLE cnj_assunto_processual;

CREATE TABLE "public"."cnj_assunto_processual"  
 (  id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
   principal boolean,
   codigo_nacional integer,
   codigo_assunto_local integer,
   codigo_pai_acional integer,
   descricao varchar(200),
   	fk_id_dados_basicos bigint,
    CONSTRAINT pk_cnj_assunto_processual PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_assunto_processual"
    OWNER to postgres;

	DROP TABLE cnj_documento;
CREATE TABLE "public"."cnj_documento"  
 (  id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
   id_documento varchar(200),
   id_documento_vinculado  varchar(200),
   tipo_documento_consultapje varchar(200),
   data_hora_documento varchar(200),
   descricao_documento varchar(200),
   hash_documento varchar(200),
   nivel_sigilo_documento bigint,
   tipo_documento varchar(200),
   conteudo_documento text,
   mimetype_documento varchar(200),
   fk_id_manifestacao_processual bigint,
    CONSTRAINT pk_cnj_documento PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_documento"
    OWNER to postgres;

DROP TABLE cnj_assinatura;
CREATE TABLE "public"."cnj_assinatura"  
(	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	assinatura text,
	algoritmo_hash_assinatura varchar(200),
	cadeia_certificado_assinatura text,
	codificacao_certificado_assinatura varchar(200),
	data_assinatura varchar(200),
	signatatio_login_identficador  varchar(200),
   	fk_id_dados_basicos bigint,
    CONSTRAINT pk_cnj_assinatura PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_assinatura"
    OWNER to postgres;

DROP TABLE cnj_processo_vinculado;
CREATE TABLE "public"."cnj_processo_vinculado"  
(	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	numeroProcesso  varchar(200),
	vinculo  varchar(200),
   	fk_id_dados_basicos bigint,	
    CONSTRAINT pk_cnj_processo_vinculado PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_processo_vinculado"
    OWNER to postgres;

DROP TABLE cnj_prioridade;
CREATE TABLE "public"."cnj_prioridade"  
(	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
	prioridade   varchar(200),
   	fk_id_dados_basicos bigint,	
    CONSTRAINT pk_cnj_prioridade PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE "public"."cnj_prioridade"
    OWNER to postgres;