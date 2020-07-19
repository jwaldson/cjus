CREATE TABLE "public"."tjba_advogado"
(
   tjba_advogado_id bigint PRIMARY KEY NOT NULL,
   repres_processual_intimacao bool,
   repres_processual_nome varchar(200),
   repres_processual_inscricao varchar(200),
   repres_processual_numero_documento_principal varchar(200),
   repres_processual_tipo_representante varchar(200),
   fk_id_parte bigint
)
;
CREATE TABLE "public"."tjba_assinatura"
(
   tjba_assinatura_id bigint PRIMARY KEY NOT NULL,
   assinatura text,
   algoritmo_hash_assinatura varchar(200),
   cadeia_certificado_assinatura text,
   codificacao_certificado_assinatura varchar(200),
   data_assinatura varchar(200),
   signatatio_login_identficador varchar(200),
   fk_id_documento bigint
)
;
CREATE TABLE "public"."tjba_assunto_processual"
(
   tjba_assunto_processual_id bigint PRIMARY KEY NOT NULL,
   principal bool,
   codigo_nacional int,
   codigo_assunto_local int,
   codigo_pai_acional int,
   descricao varchar(200),
   fk_id_dados_basicos bigint
)
;
CREATE TABLE "public"."tjba_dados_basicos"
(
   tjba_dados_basicos_id bigint PRIMARY KEY NOT NULL,
   classe_processual int,
   codigo_localidade varchar(200),
   competencia int,
   modalidade_vinculacao_processo varchar(200),
   valor_causa int,
   nivel_sigilo int,
   data_ajuizamento varchar(200),
   outro_parametro varchar(200),
   fk_id_mnifestacao_processual bigint
)
;
CREATE TABLE "public"."tjba_documento"
(
   tjba_documento_id bigint PRIMARY KEY NOT NULL,
   id_documento varchar(200),
   id_documento_vinculado varchar(200),
   tipo_documento_consultapje varchar(200),
   data_hora_documento varchar(200),
   descricao_documento varchar(200),
   hash_documento varchar(200),
   nivel_sigilo_documento bigint,
   tipo_documento varchar(200),
   conteudo_documento text,
   mimetype_documento varchar(200),
   fk_id_manifestacao_processual bigint
)
;
CREATE TABLE "public"."tjba_documento_identificacao"
(
   tjba_documento_identificacao_id bigint PRIMARY KEY NOT NULL,
   nome varchar(200),
   codigo_documento varchar(200),
   emissor_documento varchar(200),
   tipo_documento varchar(200),
   nome_detentora varchar(200),
   fk_id_pessoa bigint
)
;
CREATE TABLE "public"."tjba_endereco"
(
   tjba_endereco_id bigint PRIMARY KEY NOT NULL,
   cep varchar(10),
   logradouro varchar(200),
   numero varchar(200),
   complemento varchar(200),
   bairro varchar(200),
   cidade varchar(200),
   estado varchar(200),
   pais varchar(200),
   fk_id_pessoa bigint,
   fk_id_advogado bigint
)
;
CREATE TABLE "public"."tjba_manifestacao_processual"
(
   tjba_manifestacao_processual_id bigint PRIMARY KEY NOT NULL,
   entra_status_processamento varchar(2),
   id_manifestante varchar(20),
   senha_manifestante varchar(200),
   retorno_sucesso bool,
   retorno_mensagem varchar(200),
   retorno_protocolo_recebimento int,
   retorno_data_operacao varchar(200),
   retorno_recibo text,
   sai_conteudo_retornado text,
   sai_data_atualizacao_registro varchar(50),
   sai_erro_sistema text
)
;
CREATE TABLE "public"."tjba_outro_nome"
(
   tjba_outro_nome_id bigint PRIMARY KEY NOT NULL,
   outro_nome varchar(200),
   fk_id_pessoa bigint
)
;
CREATE TABLE "public"."tjba_parte"
(
   tjba_parte_id bigint PRIMARY KEY NOT NULL,
   assistencia_judiciaria bool,
   intimacaopendente bigint,
   relacionamentoprocessual varchar(200),
   fk_id_polo bigint
)
;
CREATE TABLE "public"."tjba_pessoa"
(
   tjba_pessoa_id bigint PRIMARY KEY NOT NULL,
   nome varchar(200),
   sexo varchar(200),
   nome_genitor varchar(200),
   nome_genitora varchar(200),
   data_nascimento varchar(200),
   data_obito varchar(200),
   numero_documento_principal int,
   tipo_pessoa varchar(200),
   cidade_natural varchar(200),
   estado_natural varchar(200),
   nacionalidade varchar(200),
   fk_id_parte bigint,
   fk_id_advogado bigint,
   fk_id_pessoa bigint
)
;
CREATE TABLE "public"."tjba_polo"
(
   tjba_polo_id bigint PRIMARY KEY NOT NULL,
   polo varchar(200),
   fk_id_dados_basicos bigint
)
;
CREATE TABLE "public"."tjba_prioridade"
(
   tjba_prioridade_id bigint PRIMARY KEY NOT NULL,
   prioridade varchar(200),
   fk_id_dados_basicos bigint
)
;
CREATE TABLE "public"."tjba_processo_vinculado"
(
   tjba_processo_vinculado_id bigint PRIMARY KEY NOT NULL,
   numeroprocesso varchar(200),
   vinculo varchar(200),
   fk_id_dados_basicos bigint
)
;
ALTER TABLE "public"."tjba_advogado"
ADD CONSTRAINT fk_advogado_parte
FOREIGN KEY (fk_id_parte)
REFERENCES "public"."tjba_parte"(tjba_parte_id)
;
CREATE UNIQUE INDEX pk_tjba_advogado ON "public"."tjba_advogado"(tjba_advogado_id)
;
CREATE INDEX fki_fk_advogado_parte ON "public"."tjba_advogado"(fk_id_parte)
;
ALTER TABLE "public"."tjba_assinatura"
ADD CONSTRAINT fk_assinatura_documento
FOREIGN KEY (fk_id_documento)
REFERENCES "public"."tjba_documento"(tjba_documento_id)
;
CREATE UNIQUE INDEX pk_tjba_assinatura ON "public"."tjba_assinatura"(tjba_assinatura_id)
;
CREATE INDEX fki_fk_assinatura_documento ON "public"."tjba_assinatura"(fk_id_documento)
;
ALTER TABLE "public"."tjba_assunto_processual"
ADD CONSTRAINT fk_Assunto_dados_basicos
FOREIGN KEY (fk_id_dados_basicos)
REFERENCES "public"."tjba_dados_basicos"(tjba_dados_basicos_id)
;
CREATE INDEX fki_fk_Assunto_dados_basicos ON "public"."tjba_assunto_processual"(fk_id_dados_basicos)
;
CREATE UNIQUE INDEX pk_tjba_assunto_processual ON "public"."tjba_assunto_processual"(tjba_assunto_processual_id)
;
ALTER TABLE "public"."tjba_dados_basicos"
ADD CONSTRAINT fk_dados_basicos_manifestacao_processual
FOREIGN KEY (fk_id_mnifestacao_processual)
REFERENCES "public"."tjba_manifestacao_processual"(tjba_manifestacao_processual_id)
;
CREATE UNIQUE INDEX pk_tjba_dados_basicos ON "public"."tjba_dados_basicos"(tjba_dados_basicos_id)
;
CREATE INDEX fki_fk_dados_basicos_manifestacao_processual ON "public"."tjba_dados_basicos"(fk_id_mnifestacao_processual)
;
ALTER TABLE "public"."tjba_documento"
ADD CONSTRAINT fk_Documento_manifestacao_processual
FOREIGN KEY (fk_id_manifestacao_processual)
REFERENCES "public"."tjba_manifestacao_processual"(tjba_manifestacao_processual_id)
;
CREATE INDEX fki_fk_Documento_manifestacao_processual ON "public"."tjba_documento"(fk_id_manifestacao_processual)
;
CREATE UNIQUE INDEX pk_tjba_documento ON "public"."tjba_documento"(tjba_documento_id)
;
ALTER TABLE "public"."tjba_documento_identificacao"
ADD CONSTRAINT fk_outro_nome_pessoa
FOREIGN KEY (fk_id_pessoa)
REFERENCES "public"."tjba_pessoa"(tjba_pessoa_id)
;
ALTER TABLE "public"."tjba_documento_identificacao"
ADD CONSTRAINT fk_documento_identificacao_pessoa
FOREIGN KEY (fk_id_pessoa)
REFERENCES "public"."tjba_pessoa"(tjba_pessoa_id)
;
CREATE UNIQUE INDEX pk_tjba_documento_identificacao ON "public"."tjba_documento_identificacao"(tjba_documento_identificacao_id)
;
CREATE INDEX fki_fk_documento_identificacao_pessoa ON "public"."tjba_documento_identificacao"(fk_id_pessoa)
;
ALTER TABLE "public"."tjba_endereco"
ADD CONSTRAINT fk_endereco_pessoa
FOREIGN KEY (fk_id_pessoa)
REFERENCES "public"."tjba_pessoa"(tjba_pessoa_id)
;
ALTER TABLE "public"."tjba_endereco"
ADD CONSTRAINT fk_endereco_advogado
FOREIGN KEY (fk_id_advogado)
REFERENCES "public"."tjba_advogado"(tjba_advogado_id)
;
CREATE INDEX fki_fk_endereco_pessoa ON "public"."tjba_endereco"(fk_id_pessoa)
;
CREATE UNIQUE INDEX pk_tjba_endereco ON "public"."tjba_endereco"(tjba_endereco_id)
;
CREATE INDEX fki_fk_endereco_advogado ON "public"."tjba_endereco"(fk_id_advogado)
;
CREATE UNIQUE INDEX pk_tjba_manifestacao_processual ON "public"."tjba_manifestacao_processual"(tjba_manifestacao_processual_id)
;
ALTER TABLE "public"."tjba_outro_nome"
ADD CONSTRAINT fk_outro_nome_pessoa
FOREIGN KEY (fk_id_pessoa)
REFERENCES "public"."tjba_pessoa"(tjba_pessoa_id)
;
CREATE INDEX fki_fk_outro_nome_pessoa ON "public"."tjba_outro_nome"(fk_id_pessoa)
;
CREATE UNIQUE INDEX pk_tjba_outro_nome ON "public"."tjba_outro_nome"(tjba_outro_nome_id)
;
ALTER TABLE "public"."tjba_parte"
ADD CONSTRAINT fk_parte_polo
FOREIGN KEY (fk_id_polo)
REFERENCES "public"."tjba_polo"(tjba_polo_id)
;
CREATE UNIQUE INDEX pk_tjba_parte ON "public"."tjba_parte"(tjba_parte_id)
;
CREATE INDEX fki_fk_polo_dados_basicos ON "public"."tjba_parte"(fk_id_polo)
;

ALTER TABLE "public"."tjba_pessoa"
ADD CONSTRAINT fk_pessoa_advogado
FOREIGN KEY (fk_id_advogado)
REFERENCES "public"."tjba_advogado"(tjba_advogado_id)
;
CREATE INDEX fki_fk_pessoa_advogado ON "public"."tjba_pessoa"(fk_id_advogado)
;

CREATE UNIQUE INDEX pk_tjba_pessoa ON "public"."tjba_pessoa"(tjba_pessoa_id)
;
ALTER TABLE "public"."tjba_polo"
ADD CONSTRAINT fk_polo_dado_basico
FOREIGN KEY (fk_id_dados_basicos)
REFERENCES "public"."tjba_dados_basicos"(tjba_dados_basicos_id)
;
CREATE UNIQUE INDEX pk_tjba_polo ON "public"."tjba_polo"(tjba_polo_id)
;
CREATE INDEX fki_fk_polo_dado_basico ON "public"."tjba_polo"(fk_id_dados_basicos)
;
ALTER TABLE "public"."tjba_prioridade"
ADD CONSTRAINT fk_prioridade_dados_basicos
FOREIGN KEY (fk_id_dados_basicos)
REFERENCES "public"."tjba_dados_basicos"(tjba_dados_basicos_id)
;
CREATE INDEX fki_fk_prioridade_dados_basicos ON "public"."tjba_prioridade"(fk_id_dados_basicos)
;
CREATE UNIQUE INDEX pk_tjba_prioridade ON "public"."tjba_prioridade"(tjba_prioridade_id)
;
ALTER TABLE "public"."tjba_processo_vinculado"
ADD CONSTRAINT fk_processo_vinculado_dados_basicos
FOREIGN KEY (fk_id_dados_basicos)
REFERENCES "public"."tjba_dados_basicos"(tjba_dados_basicos_id)
;
CREATE INDEX fki_fk_processo_vinculado_dados_basicos ON "public"."tjba_processo_vinculado"(fk_id_dados_basicos)
;
CREATE UNIQUE INDEX pk_tjba_processo_vinculado ON "public"."tjba_processo_vinculado"(tjba_processo_vinculado_id)
;
