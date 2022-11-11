package br.com.impacta.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import br.com.impacta.persistencia.Filme;

public class FilmeController {
	
	public List<Filme> galeria = new ArrayList<Filme>();	

	//criar
	public void criar(Filme filme){
		galeria.add(filme);			
	}
	
	//consultar
	Filme[] consultar(String titulo){
		//TODO: implementar
		return null;
	}
	
	//importar
	int importar(String url){
		//TODO: implementar
		return 0;
	}
	
	//remover
	boolean remover(String titulo){
		//TODO: implementar
		return false;
	}
	
	//sortear
	Filme sortear(String genero){
		//TODO: implementar
//		Filme []filmes = {}; //500
//		int posicao = (int) (Math.random() * 500);
//		return filmes[0];
		return null;
	}
}
