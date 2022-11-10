package br.com.impacta.controladores;

import java.util.List;

import br.com.impacta.persistencia.Filme;
import br.com.impacta.testes.WILLList;

public class FilmeController {
	
	Filme galeria[] = new Filme[10];
	
	
	

	//criar
	public void criar(Filme filme){
		galeria[Filme.contador-1] = filme;		
		System.out.println(Filme.contador);
		
		for (int i = 0; i < galeria.length; i++) {
			System.out.println(galeria[i]);
		}
		
		List listaEspecial = new WILLList();
		System.out.println(listaEspecial.size());
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
