package br.com.impacta.apresentacao;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCriarFilme {

	public static void main(String[] args) {
		int margem1 = 100;
		
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton botaoSalvar = new JButton();
		botaoSalvar.setText("Salvar");
		botaoSalvar.setSize(150, 40);
		botaoSalvar.setLocation(550, 450);
		frame.add(botaoSalvar);
		
		JLabel labelTopo = new JLabel("Gerenciamento de filmes");
		labelTopo.setFont(new Font("Arial", Font.BOLD, 34));
		labelTopo.setBounds(50, 5, 500, 50);
		frame.add(labelTopo);
		
		//titulo
		JLabel labelTitulo = new JLabel("Título:");
		labelTitulo.setBounds(50, 100, 100, 30);
		JTextField caixaTitulo = new JTextField(20);
		caixaTitulo.setBounds(margem1, 100, 200, 30);	
		frame.add(labelTitulo);
		frame.add(caixaTitulo);
		
		//diretores
		JLabel labelDiretores = new JLabel("Diretores:");
		labelDiretores.setBounds(50-10, 150, 100, 30);
		JTextField caixaDiretores = new JTextField(20);
		caixaDiretores.setBounds(margem1, 150, 200, 30);	
		frame.add(labelDiretores);
		frame.add(caixaDiretores);
		
		//ano (1)
		JLabel labelAno = new JLabel("Ano:");
		labelAno.setBounds(50, 200, 100, 30);
		JTextField caixaAno = new JTextField(2);
		caixaAno.setBounds(100, 200, 50, 30);	
		frame.add(labelAno);
		frame.add(caixaAno);
		
		//duracao (2)
		JLabel labelDuracao = new JLabel("Duração:");
		labelDuracao.setBounds(170, 200, 100, 30);
		JTextField caixaDuracao = new JTextField(2);
		caixaDuracao.setBounds(250, 200, 50, 30);	
		frame.add(labelDuracao);
		frame.add(caixaDuracao);
		
		//voto (3)
		JLabel labelVoto = new JLabel("Voto:");
		labelVoto.setBounds(320, 200, 100, 30);
		JTextField caixaVoto = new JTextField(2);
		caixaVoto.setBounds(370, 200, 50, 30);	
		frame.add(labelVoto);
		frame.add(caixaVoto);
		
		//nota (4)
		JLabel labelNota = new JLabel("Nota:");
		labelNota.setBounds(440, 200, 100, 30);
		JTextField caixaNota = new JTextField(2);
		caixaNota.setBounds(490, 200, 50, 30);	
		frame.add(labelNota);
		frame.add(caixaNota);
		
		
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
