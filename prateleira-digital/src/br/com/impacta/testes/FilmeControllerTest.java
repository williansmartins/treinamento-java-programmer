package br.com.impacta.testes;

import br.com.impacta.controladores.FilmeController;
import br.com.impacta.persistencia.Filme;

public class FilmeControllerTest {

	public static void main(String[] args) {
		testaCriarFilme();
	}

	private static void testaCriarFilme() {
		Filme f2 = new Filme("Star Wars", "diretor1, diretor2",9.9,120,1980, "suspense", 10, "https://www.site.com.br");
		FilmeController controller = new FilmeController();
		controller.criar(f2, null);
	}
	

	
}
