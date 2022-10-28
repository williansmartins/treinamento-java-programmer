package br.com.impacta.prateleiradigital.apresentacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.impacta.prateleiradigital.controle.FilmeController;

public class CriarFilmeConsole {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** CADASTRO DE FILME ***");
		System.out.println("Titulo do filme:");
		String titulo = scan.nextLine();
		System.out.println("Diretores:");
		String diretores = scan.nextLine();
		System.out.println("Nota:");
		double nota = Double.parseDouble(scan.nextLine());
		System.out.println("Duração (min):");
		int duracao = Integer.parseInt(scan.nextLine());
		System.out.println("Ano:");
		int ano = Integer.parseInt(scan.nextLine());
		System.out.println("Gêneros:");
		String generos = scan.nextLine();
		System.out.println("Número de votos:");
		int votos = Integer.parseInt(scan.nextLine());
		System.out.println("URL:");
		String url = scan.nextLine();
		
		FilmeController controller = new FilmeController();
		try {
			controller.criarFilme(titulo, diretores, nota, duracao, ano, generos, votos, url);
			System.out.println("...");
			System.out.println("Filme criado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,e.getMessage(),"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
		}
	}
}
