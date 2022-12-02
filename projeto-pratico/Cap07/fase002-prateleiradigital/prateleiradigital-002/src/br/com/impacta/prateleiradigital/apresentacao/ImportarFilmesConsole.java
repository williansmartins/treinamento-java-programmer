package br.com.impacta.prateleiradigital.apresentacao;

import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class ImportarFilmesConsole {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** IMPORTAR FILMES ***");
		System.out.println("Digite o nome do arquivo :");
		String pathFile = scan.nextLine();
		
		FilmeController controller = new FilmeController();
		controller.importarFilmes(pathFile);
		
		System.out.println("...");
		System.out.println("Filmes importados com sucesso!");
		
	}

}
