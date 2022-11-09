package br.com.impacta.apresentacao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import br.com.impacta.controladores.FilmeController;
import br.com.impacta.persistencia.Filme;

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
		labelTopo.setBounds(188, 5, 500, 50);
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
		
		//url
		JLabel labelUrl = new JLabel("URL:");
		labelUrl.setBounds(50, 250, 100, 30);
		JTextField caixaUrl = new JTextField();
		caixaUrl.setBounds(margem1, 250, 200, 30);
		frame.add(labelUrl);
		frame.add(caixaUrl);
		
		//Generos
		JLabel labelGeneros = new JLabel("Generos:");
		labelGeneros.setBounds(50-10, 300, 100, 30);
		JTextArea caixaGeneros = new JTextArea();
		caixaGeneros.setBounds(margem1, 300, 200, 100);
		
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		caixaGeneros.setBorder(BorderFactory.createCompoundBorder(border,
	            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
	    
		frame.add(labelGeneros);
		frame.add(caixaGeneros);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
		botaoSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String stringTitulo = caixaTitulo.getText();
				String stringGeneros = caixaGeneros.getText();
				String stringNota = caixaNota.getText();
				//...
				
				Filme filme = new Filme();
				filme.titulo = stringTitulo;
				filme.generos = stringGeneros;
				//...
				
				FilmeController controller = new FilmeController();
				controller.criar(filme);				
			}
		});
		
	}

}
