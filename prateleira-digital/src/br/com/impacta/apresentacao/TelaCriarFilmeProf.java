package br.com.impacta.apresentacao;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaCriarFilmeProf {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JButton botaoSalvar = new JButton();
		botaoSalvar.setText("Salvar");
		botaoSalvar.setSize(150, 40);
		botaoSalvar.setLocation(550, 450);
		
		JLabel titulo = new JLabel();
		titulo.setText("This is a basic label");
		titulo.setLocation(100, 100);
		
		
		frame.add(botaoSalvar);
		frame.add(titulo, BorderLayout.CENTER);
		
		
	}

}
