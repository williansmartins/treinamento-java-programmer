package br.com.impacta.testes;

import javax.swing.JOptionPane;

public class TesteSwing {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Valor A");
		String b = JOptionPane.showInputDialog("Valor B");
		
		int aInteiro = 0;
		int bInteiro = 0;
		int soma = 0;
		
		try {
			
			aInteiro = Integer.parseInt(a);
			bInteiro = Integer.parseInt(b);			
			soma = aInteiro / bInteiro;
			JOptionPane.showMessageDialog(null, null);
			
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
