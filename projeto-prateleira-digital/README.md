# Etapas para clonar o projeto
1. Entrar no gitbash
1. Navegar até a pasta projetos
    - cd c:
    - cd dev
    - cd projetos
1. Clonar o projeto

`git clone https://github.com/williansmartins/treinamento-java-programmer.git` 

# Pegar projeto atualizado
1. Entrar no gitbash
1. Navegar até a pasta do projeto
    - cd c:
    - cd dev
    - cd projetos
    - cd treinamento-java-programmer
    - cd prateleira-digital
3) Fazer reset 
    - git checkout . && git pull
    



# Links para os códigos das camadas 
### Apresentacao
https://raw.githubusercontent.com/williansmartins/treinamento-java-programmer/main/prateleira-digital/src/br/com/impacta/apresentacao/TelaCriarFilme.java

### Controladores
https://raw.githubusercontent.com/williansmartins/treinamento-java-programmer/main/prateleira-digital/src/br/com/impacta/controladores/FilmeController.java

### Persistencia
https://raw.githubusercontent.com/williansmartins/treinamento-java-programmer/main/prateleira-digital/src/br/com/impacta/persistencia/FilmeDAO.java


# Comandos do MYSQL
## Criar
`
 insert into tb_filme
	(titulo, ano)
	values('E o vento levou', 2020);
`

## Buscar
`select * from tb_filme`

## Atualizar
`
update tb_filme
	set generos = 'comedia',
		   nota = 5
	where codigo = 61;
`

## Remover
`delete from tb_filme  where codigo = <{codigo: }>`
