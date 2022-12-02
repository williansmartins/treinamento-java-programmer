package br.com.impacta.testes;

import java.util.ArrayList;
import java.util.List;


import br.com.impacta.controladores.FilmeController;
import br.com.impacta.persistencia.Filme;
import br.com.impacta.persistencia.FilmeDAO;

public class TestaFiltroQA {

	public static void main(String[] args) {
		
		TestaFiltro filtro = new TestaFiltro();
		FilmeDAO dao = new FilmeDAO();
		List<Filme> galeria = dao.listar();
		
		List<Filme> novaLista = filtro.filtrar(galeria);
		
		if(novaLista.size() == 3) {
			System.out.println("passou no teste!!!");
		}else {
			System.out.println("Não passou no teste!!!");
		}
		
	}

	
}
