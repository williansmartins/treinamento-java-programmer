package br.com.impacta.apresentacao;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCriarFilme {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton botaoSalvar = new JButton();
		botaoSalvar.setText("Salvar");
		botaoSalvar.setSize(150, 40);
		botaoSalvar.setLocation(550, 450);
		
		JLabel labelTopo = new JLabel("Gerenciamento de filmes");
		labelTopo.setFont(new Font("Arial", Font.BOLD, 34));
		labelTopo.setBounds(50, 5, 500, 50);
		
		//titulo
		JLabel labelTitulo = new JLabel("Título:");
		labelTitulo.setBounds(50, 100, 100, 30);
		JTextField caixa1 = new JTextField(20);
		caixa1.setBounds(100, 100, 200, 30);	
		
		//diretores
		
		frame.add(botaoSalvar);
		frame.add(caixa1);
		frame.add(labelTitulo);
		frame.add(labelTopo);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
