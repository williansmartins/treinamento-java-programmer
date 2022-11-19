package br.com.impacta.controladores;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.persistencia.Filme;
import br.com.impacta.persistencia.FilmeDAO;

public class FilmeController {
	
	public List<Filme> galeria = new ArrayList<Filme>();	

	//criar
	public void criar(Filme filme){
				
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
}
