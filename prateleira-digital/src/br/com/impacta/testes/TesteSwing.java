package br.com.impacta.testes;

import javax.swing.JOptionPane;

public class TesteSwing {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Valor A");
		String b = JOptionPane.showInputDialog("Valor B");
		
		try {
			
			int aInteiro = Integer.parseInt(a);
			int bInteiro = Integer.parseInt(b);			
			int soma = aInteiro / bInteiro;
			JOptionPane.showMessageDialog(null, soma);
			
		}catch(NumberFormatException e) {
			System.out.println("conversao");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("posicao");
		}catch(ArithmeticException e) {
			System.out.println("calculo");
		}catch(Exception e) {
			System.out.println("nao sei");
		}	
		
		
		
		
	}
}
