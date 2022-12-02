package br.com.impacta.testes;

public class TesteArray {

	public static void main(String[] args) {
		String nome1 = "Willians";
		String nome2 = "Luis";
		String nome3 = "Rosália";
		
		String []nomes = new String[10];

		nomes[9] = nome1;
		nomes[0] = nome2;
		nomes[1] = nome3;
		
		for(int i = 0; i<=9; i++){
			System.out.println(i + "..." + nomes[i]);
		}
		
		nomes[9] = null;
		
		int i = 0;
		for(String nome : nomes){
			System.out.println(i + "..." + nome);
			i++;
		}
	}

}
