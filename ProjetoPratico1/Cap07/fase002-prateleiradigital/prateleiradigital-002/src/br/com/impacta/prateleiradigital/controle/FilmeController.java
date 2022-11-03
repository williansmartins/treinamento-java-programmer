package br.com.impacta.prateleiradigital.controle;

import br.com.impacta.prateleiradigital.negocio.Filme;
//import br.com.impacta.prateleiradigital.negocio.FiltroFilme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

/**
 * Representa o papel do controlador/coordenador para todos os fluxos de negócio relacionados ao filme.  
 */
public class FilmeController {
	
	FilmeDAO filmeDAO = new FilmeDAO();
	
	/**
	 * Adiciona um novo filme no catálogo de filmes
	 * 
	 * @param titulo Título do filme
	 * @param diretores Um ou mais diretores informados no formato de texto (virgula separando quando houver mais de um)
	 * @param nota Nota média do filme. Deve estar entre 0 e 10 
	 * @param duracao Tempo de duração em minutos
	 * @param ano Ano de lançamento do filme
	 * @param generos Um ou mais gêneros informados no formato de texto (virgula separando quando houver mais de um)
	 * @param numVotos Número de votos que o filme recebeu até o momento do registro
	 * @param url URL de site que pode conter mais detalhes do filme, trailler, comentários, sinopse etc
	 * 
	 */
	public void criarFilme(String titulo, String diretores, double nota, int duracao, int ano, String generos, int numVotos, String url){
		Filme filme  = new Filme(titulo, diretores, nota, duracao, ano, generos, numVotos, url);
		filmeDAO.adicionar(filme);
	}
	
	/**
	 * Baseado nos dados informados como filtro, realiza a consulta na base de dados
	 * 
	 * @param tituloParcial Parte do titulo do filme. Sendo o padrão informado fazendo parte de qualquer parte do texto do titulo original 
	 * @param genero Um dos generos em que o filme se enquadra
	 * @param anoInicial Ano representando o limite inferior (inclusive) do ano de lançamento do filme. Valor maior que zero 
	 * @param anoFinal Ano representando o limite superior (inclusive) do ano de lançamento do filme. Valor maior que o anoInicial
	 * 
	 * @return Filme que atende ao critério
	 */
	public Filme[] consultarFilme(String tituloParcial, String genero, int anoInicial, int anoFinal){
	
		Filme[] filmes = filmeDAO.consultar(tituloParcial,genero,anoInicial,anoFinal);
		
		return filmes;
	}
	
	/**
	 * Remove um filme do repositório de dados
	 * 
	 * @param filme Filme que deve ser removido do repositório de dados
	 */
	public void remover(Filme filme){
		if(filme != null){
			filmeDAO.remover(filme);
		}
	}
	
	/**
	 * Importa dados de filmes contidos num arquivo no formato .CSV informado como parâmetro
	 * Cada linha do arquivo contém a informação que representa um novo filme 
	 * 
	 * @param Caminho completo do arquivo CSV
	 * 
	 */
	public void importarFilmes(String nomeArquivo) {
		//TODO Para cada filme contido no arquivo, realiza a inserção na base de dados.
	}
	
	
	/**
	 * A partir dos parâmetros de sorteio informados seleciona de forma aleatória um filme dentro dos 
	 * critérios informados.
	 * 
	 * @param genero Genero do filme e
	 * @param diretor Diretor ou um dos diretores do filme
	 * @param notaMinima A menor nota que deve ser considerada no filtro. Se menor ou igual a zero considerar todas notas
	 * @param numeroVotosMinimo Quantidade de votos mínimo para considerar no filtro. Representa o grau de confiabilidade. Se informado um valor menor ou igual a zero, considerar qualquer quantidade de votos

	 * @return Filme que atende aos critérios informados
	 */
	public Filme sortear(String genero, String diretor, double notaMinima, int numeroVotosMinimo) {
		//TODO consulta filmes que se encaixem no critério ou parametros informados
		//TODO sortear um dos filmes retornados de forma aleatória
		
		Filme[] filme = filmeDAO.consultar(genero,diretor,notaMinima,numeroVotosMinimo);
		
		return null;//TODO trocar para sorteio
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
