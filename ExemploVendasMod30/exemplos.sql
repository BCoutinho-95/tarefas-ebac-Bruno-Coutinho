
-- TABELAS

create table tb_cliente (
	id bigint,
	nome varchar(50) not null,
	cpf bigint not null,
	tel bigint not null,
	email varchar(100) not null, -- NOVO CAMPO
	endereco varchar(50) not null,
	numero bigint not null,
	cidade varchar(50) not null,
	estado varchar(50) not null,
	data_nascimento DATE NOT NULL,
	constraint pk_id_cliente primary key(id)
);

create table tb_produto(
	id bigint,
	codigo varchar(10) not null,
	nome varchar(50) not null,
	descricao varchar(100) not null,
	valor numeric(10,2) not null,
	categoria varchar(50) not null, -- NOVO CAMPO
	constraint pk_id_produto primary key(id)
);

create table tb_venda(
	id bigint,
	codigo varchar(10) not null,
	id_cliente_fk bigint not null,
	valor_total numeric(10,2) not null,
	data_venda TIMESTAMPTZ not null,
	status_venda varchar(50) not null,
	constraint pk_id_venda primary key(id),
	constraint fk_id_cliente_venda foreign key(id_cliente_fk) references tb_cliente(id)
);

create table tb_produto_quantidade(
	id bigint,
	id_produto_fk bigint not null,
	id_venda_fk bigint not null,
	quantidade int not null,
	valor_total numeric(10,2) not null,
	constraint pk_id_prod_venda primary key(id),
	constraint fk_id_prod_venda foreign key(id_produto_fk) references tb_produto(id),
	constraint fk_id_prod_venda_venda foreign key(id_venda_fk) references tb_venda(id)
);

-- SEQUÊNCIAS

create sequence sq_cliente
start 1
increment 1
owned by tb_cliente.id;

create sequence sq_produto
start 1
increment 1
owned by tb_produto.id;

create sequence sq_venda
start 1
increment 1
owned by tb_venda.id;

create sequence sq_produto_quantidade
start 1
increment 1
owned by tb_produto_quantidade.id;

-- CONSTRAINTS ÚNICAS

ALTER TABLE tb_cliente
ADD CONSTRAINT uk_cpf_cliente UNIQUE (cpf);

ALTER TABLE tb_produto
ADD CONSTRAINT uk_codigo_produto UNIQUE (codigo);

ALTER TABLE tb_venda
ADD CONSTRAINT uk_codigo_venda UNIQUE (codigo);

-- CONSULTA 1: Detalhes da venda (agora com email do cliente e categoria do produto)

SELECT 
  v.id AS id_venda,
  v.codigo,
  v.id_cliente_fk,
  v.valor_total,
  v.data_venda,
  v.status_venda,

  c.id AS id_cliente,
  c.nome,
  c.cpf,
  c.tel,
  c.email,
  c.endereco,
  c.numero,
  c.cidade,
  c.estado,

  pq.id AS id_prod_qtd,
  pq.quantidade,
  pq.valor_total AS prod_qtd_valor_total,

  p.id AS id_produto,
  p.nome AS nome_produto,
  p.categoria

FROM tb_venda v 
INNER JOIN tb_cliente c ON v.id_cliente_fk = c.id
INNER JOIN tb_produto_quantidade pq ON pq.id_venda_fk = v.id
INNER JOIN tb_produto p ON p.id = pq.id_produto_fk
WHERE v.codigo = 'A1';

-- CONSULTA 2: Produtos em vendas (agora com categoria)

SELECT 
  pq.id,
  pq.quantidade,
  pq.valor_total,

  p.id AS id_produto,
  p.codigo,
  p.nome,
  p.descricao,
  p.valor,
  p.categoria

FROM tb_produto_quantidade pq
INNER JOIN tb_produto p ON p.id = pq.id_produto_fk;
