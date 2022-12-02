package br.com.impacta.testes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteSwing2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Olá Janela!");
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JButton botao1 = new JButton("Abrir");
		botao1.setSize(200, 30);
		botao1.setLocation(50, 50);
		frame.add(botao1);
		
		JButton botao2 = new JButton("Salvar");
		botao2.setSize(200, 30);
		botao2.setLocation(50, 100);
		frame.add(botao2);

		JButton botao3 = new JButton("Fechar");
		botao3.setSize(200, 30);
		botao3.setLocation(50, 150);
		frame.add(botao3);
		
		botao3.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		System.out.println("Fechando...");
	    	}  
		});
		
		
		
	}
}
