package br.com.impacta.prateleiradigital.apresentacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class RemoverFilmeConsole {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** REMOÇÃO DE FILME ***");
		System.out.println("Titulo :");
		String titulo = scan.nextLine();
		System.out.println("Ano:");
		int ano = Integer.parseInt(scan.nextLine());
		System.out.println("Duração:");
		int duracao = Integer.parseInt(scan.nextLine());
		
		
		Filme filme = new Filme();
		filme.setTitulo(titulo);
		filme.setAno(ano);
		filme.setDuracao(duracao);

		FilmeController controller = new FilmeController();
		try {
			controller.remover(filme);
			System.out.println("...");
			System.out.printf("Filme %s removido com sucesso!",filme);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage(),"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
		}
	}
}
