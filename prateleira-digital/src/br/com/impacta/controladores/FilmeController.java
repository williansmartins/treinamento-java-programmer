package br.com.impacta.controladores;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.persistencia.Filme;
import br.com.impacta.persistencia.FilmeDAO;

/**
 * Classe que controla o gerenciamento dos filmes
 * 
 * @author Willians Martins de Morais
 * @since 1.0.0
 *
 */
public class FilmeController {
	
	public List<Filme> galeria = new ArrayList<Filme>();	

	//criar
	/**
	 * Chama a classe DAO para salvar o filme no banco de dados
	 * 
	 * 
	 * */
	public void criar(Filme filme){
		FilmeDAO dao = new FilmeDAO();
		dao.criar(filme);
	}
	
	//consultar
	public Filme[] consultar(String titulo){
		//TODO: implementar
		return null;
	}
	
	//importar
	public int importar(String url){
		//TODO: implementar
		return 0;
	}
	
	//remover
	/**
	 * Remove o filme do banco de dados
	 * @param codigo Chave primaria no banco de dados
	 * @return devolve true se a remoção foi bem sucedida
	 */
	public boolean remover(int codigo){
		FilmeDAO dao = new FilmeDAO();
		dao.remover(codigo);
		return true;
	}
	
	//sortear
	public Filme sortear(String genero){
		//TODO: implementar
//		Filme []filmes = {}; //500
//		int posicao = (int) (Math.random() * 500);
//		return filmes[0];
		return null;
	}
	
	public List<Filme> listar() {
		FilmeDAO dao = new FilmeDAO();
		List<Filme> retorno = dao.listar();
		return retorno;
		
	}
	
		//criar
		public void atualizar(Filme filme){
			FilmeDAO dao = new FilmeDAO();
			dao.atualizar(filme);
		}
}
