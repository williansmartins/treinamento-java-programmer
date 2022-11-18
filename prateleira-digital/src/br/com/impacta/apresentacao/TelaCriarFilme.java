package br.com.impacta.apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import br.com.impacta.controladores.FilmeController;
import br.com.impacta.persistencia.Filme;

public class TelaCriarFilme {

	static FilmeController controller = new FilmeController();
	static DefaultTableModel modelo = new DefaultTableModel();
	static boolean ehNovo = true;

	public static void main(String[] args) {
		List galeria = controller.listar();
		int margem1 = 100;
		
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		JButton botaoSalvar = new JButton();
		botaoSalvar.setText("Salvar");
		botaoSalvar.setSize(150, 40);
		botaoSalvar.setLocation(margem1, 450);
		frame.add(botaoSalvar);
		
		JButton botaoExcluir = new JButton();
		botaoExcluir.setText("Excluir");
		botaoExcluir.setSize(150, 40);
		botaoExcluir.setLocation(270, 450);
		frame.add(botaoExcluir);
		
		JButton botaoLimpar = new JButton();
		botaoLimpar.setText("Limpar");
		botaoLimpar.setSize(150, 40);
		botaoLimpar.setLocation(440, 450);
		frame.add(botaoLimpar);
		
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
		frame.add(labelGeneros);
		frame.add(caixaGeneros);
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		caixaGeneros.setBorder(BorderFactory.createCompoundBorder(border,
	            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
	    
		
		//Tabela
		
		JTable tabela = new JTable(modelo);
		tabela.setBounds(570, 100, 100, 300);
		tabela.setDefaultEditor(Object.class, null);
		
		JPanel painel = new JPanel() ;
		painel.setBounds(560, 100, 220, 320);	
		painel.setLayout(new BorderLayout());
		painel.add(tabela.getTableHeader(), BorderLayout.NORTH);
		painel.add(new JScrollPane(tabela));
		frame.add(painel);
		
		modelo.addColumn("Titulo");
		modelo.addColumn("Ano");

		tabela.getColumnModel().getColumn(0)
		.setPreferredWidth(50);
		tabela.getColumnModel().getColumn(1)
		.setPreferredWidth(50);	
		
		frame.setVisible(true);
		
		//popular tabela com dados fake
		popularTabela();
		
		//acoes
		botaoSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String stringTitulo = caixaTitulo.getText();
				String stringGeneros = caixaGeneros.getText();
				String stringNota = caixaNota.getText();
				String stringDiretores = caixaDiretores.getText();
				String stringAno = caixaAno.getText();
				String stringDuracao = caixaDuracao.getText();
				String stringVoto = caixaVoto.getText();
				String stringUrl = caixaUrl.getText();
				
				Filme filme = new Filme();
				filme.titulo = stringTitulo;
				filme.ano = Integer.parseInt(stringAno);
				filme.generos = stringGeneros;
				filme.nota = Double.parseDouble(stringNota);
				filme.diretores = stringDiretores;
				filme.duracao = Integer.parseInt(stringDuracao);
				filme.votos = Integer.parseInt(stringVoto);
				filme.url = stringUrl;				
				
				if (ehNovo) {
					controller.criar(filme);	
					modelo.addRow(new Object[] { filme.titulo, filme.ano}); 
				} else {
					int linhaSelecionada = tabela.getSelectedRow();
					modelo.removeRow(linhaSelecionada);
					ehNovo = true;
					
					controller.criar(filme);	
					modelo.addRow(new Object[] { filme.titulo, filme.ano}); 
				}
				
				caixaTitulo.setText("");	
				caixaVoto.setText("");
				caixaDuracao.setText("");
				caixaAno.setText("");
				caixaNota.setText("");			
				caixaDiretores.setText("");			
				caixaUrl.setText("");			
				caixaGeneros.setText("");
			}
		});

		botaoExcluir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int linhaSelecionada = tabela.getSelectedRow();
				if(linhaSelecionada>=0) {
					System.out.println(linhaSelecionada);
					modelo.removeRow(linhaSelecionada);
				}else {
					JOptionPane.showMessageDialog(null, "selecione algum item");
				}
			}
		});
		
		botaoLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				caixaTitulo.setText("");			
				caixaVoto.setText("");
				caixaDuracao.setText("");
				caixaAno.setText("");
				caixaNota.setText("");			
				caixaDiretores.setText("");			
				caixaUrl.setText("");			
				caixaGeneros.setText("");
			}
		});
		
		labelTopo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent  e) {				
				caixaTitulo.setText("E o vento levou");			
				caixaVoto.setText("10");
				caixaDuracao.setText("120");
				caixaAno.setText("2022");
				caixaNota.setText("10");			
				caixaDiretores.setText("Diretor1 e Diretor2");			
				caixaUrl.setText("http://www.eoventolevou.com.br");			
				caixaGeneros.setText("Romance");
			}
		});
		
		tabela.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent event) {
		    	ehNovo = false;
	        	int linha = tabela.getSelectedRow();
	        	if(linha>=0 && !event.getValueIsAdjusting() ) {
					String titulo = tabela.getValueAt(linha, 0).toString();
					
					
					//objetivo = encontrar 1 filme no meio de vários
					Filme filmeEscolhido = null;
					
					for (Filme filme : controller.galeria) {
						System.out.println(filme.titulo);
						
						if( titulo.equals(filme.titulo) ) {
							filmeEscolhido = filme;
							break;
						}
					}
					
					caixaTitulo.setText(filmeEscolhido.titulo);			
					caixaVoto.setText(""+filmeEscolhido.votos);
					caixaDuracao.setText(""+filmeEscolhido.duracao);
					caixaAno.setText(""+filmeEscolhido.ano);
					caixaNota.setText(""+filmeEscolhido.nota);			
					caixaDiretores.setText(filmeEscolhido.diretores);			
					caixaUrl.setText(filmeEscolhido.url);			
					caixaGeneros.setText(filmeEscolhido.generos);
					
	        	}
		    }
		});

	}
	
	static void popularTabela(){
		for(int i = 0; i<10; i++) {
			//criar instancia de um FILME
			Filme filme = new Filme();
			filme.titulo = "Título"+i;
			filme.votos = 10+i;
			filme.duracao = 100*i;
			filme.ano = 2020+i;
			filme.nota = 10+i; System.out.println(filme.nota);
			filme.diretores = "Diretor"+i;
			filme.url = "http://www.filme"+i+".com.br";
			filme.generos = "Genero"+i;
			
			//jogar o filme na galeria
			controller.criar(filme);
			
			//adicionar o filme na tabela
			modelo.addRow(new Object[] { filme.titulo, filme.ano}); 
		}
	}

}
