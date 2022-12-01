import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Tela extends JFrame{
	private static JTextField visor;
	static JLabel foto = new JLabel("");
	
	public Tela() {
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(179, 77, -166, 240);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
				
		JLabel lblJustiaEleitoral = new JLabel("Justi\u00E7a ");
		lblJustiaEleitoral.setHorizontalAlignment(SwingConstants.RIGHT);
		lblJustiaEleitoral.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblJustiaEleitoral.setBounds(320, 11, 220, 27);
		getContentPane().add(lblJustiaEleitoral);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(197, 77, 343, 246);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodo("1");
			}
		});
		button.setBackground(new Color(0, 0, 0));
		button.setForeground(new Color(255, 255, 255));
		button.setBounds(103, 11, 41, 36);
		panel.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodo("2");
			}
		});
		button_1.setBackground(new Color(0, 0, 0));
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBounds(154, 11, 41, 36);
		panel.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodo("3");
			}
		});
		button_2.setBackground(new Color(0, 0, 0));
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBounds(205, 11, 41, 36);
		panel.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodo("4");
			}
		});
		button_3.setBackground(new Color(0, 0, 0));
		button_3.setForeground(new Color(255, 255, 255));
		button_3.setBounds(103, 58, 41, 36);
		panel.add(button_3);
		
		JButton button_1_1 = new JButton("5");
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodo("5");
			}
		});
		button_1_1.setBackground(new Color(0, 0, 0));
		button_1_1.setForeground(new Color(255, 255, 255));
		button_1_1.setBounds(154, 58, 41, 36);
		panel.add(button_1_1);
		
		JButton button_2_1 = new JButton("6");
		button_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodo("6");
			}
		});
		button_2_1.setBackground(new Color(0, 0, 0));
		button_2_1.setForeground(new Color(255, 255, 255));
		button_2_1.setBounds(205, 58, 41, 36);
		panel.add(button_2_1);
		
		JButton button_4 = new JButton("7");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodo("7");
			}
		});
		button_4.setBackground(new Color(0, 0, 0));
		button_4.setForeground(new Color(255, 255, 255));
		button_4.setBounds(103, 105, 41, 36);
		panel.add(button_4);
		
		JButton button_1_2 = new JButton("8");
		button_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodo("8");
			}
		});
		button_1_2.setBackground(new Color(0, 0, 0));
		button_1_2.setForeground(new Color(255, 255, 255));
		button_1_2.setBounds(154, 105, 41, 36);
		panel.add(button_1_2);
		
		JButton button_2_2 = new JButton("9");
		button_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodo("9");
			}
		});
		button_2_2.setBackground(new Color(0, 0, 0));
		button_2_2.setForeground(new Color(255, 255, 255));
		button_2_2.setBounds(205, 105, 41, 36);
		panel.add(button_2_2);
		
		JButton button_2_2_1 = new JButton("0");
		button_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metodo("0");
			}
		});
		button_2_2_1.setBackground(new Color(0, 0, 0));
		button_2_2_1.setForeground(new Color(255, 255, 255));
		button_2_2_1.setBounds(154, 152, 41, 36);
		panel.add(button_2_2_1);
		
		JButton button_2_2_1_1 = new JButton("BRANCO");
		button_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foto.setIcon(new ImageIcon("C:\\dev\\projetos\\treinamento-java-programmer\\urna-eletronica\\src\\candidato0.JPG"));
			}
		});
		button_2_2_1_1.setBounds(10, 199, 89, 36);
		panel.add(button_2_2_1_1);
		button_2_2_1_1.setForeground(new Color(0, 0, 0));
		button_2_2_1_1.setBackground(new Color(255, 255, 255));
		
		JButton button_2_2_1_1_1 = new JButton("CORRIGE");
		button_2_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText("");
				foto.setIcon(new ImageIcon("C:\\dev\\projetos\\treinamento-java-programmer\\urna-eletronica\\src\\brasao.JPG"));
			}
		});
		button_2_2_1_1_1.setBounds(109, 199, 107, 36);
		panel.add(button_2_2_1_1_1);
		button_2_2_1_1_1.setBackground(new Color(255, 165, 0));
		
		JButton button_2_2_1_1_1_1 = new JButton("CONFIRMA");
		button_2_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foto.setIcon(new ImageIcon("C:\\dev\\projetos\\treinamento-java-programmer\\urna-eletronica\\src\\fim.jpg"));
			}
		});
		button_2_2_1_1_1_1.setBounds(226, 199, 107, 36);
		panel.add(button_2_2_1_1_1_1);
		button_2_2_1_1_1_1.setBackground(Color.GREEN);
		
		JLabel lblEleitoral = new JLabel("Eleitoral");
		lblEleitoral.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEleitoral.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEleitoral.setBounds(316, 37, 220, 27);
		getContentPane().add(lblEleitoral);
		
		visor = new JTextField();
		visor.setBounds(26, 43, 132, 27);
		getContentPane().add(visor);
		visor.setColumns(10);
		
		
		foto.setHorizontalAlignment(SwingConstants.CENTER);
		foto.setIcon(new ImageIcon("C:\\dev\\projetos\\treinamento-java-programmer\\urna-eletronica\\src\\brasao.JPG"));
		foto.setBackground(Color.DARK_GRAY);
		foto.setBounds(10, 77, 177, 240);
		getContentPane().add(foto);
	}
	
	static void metodo(String numero){
		String auxiliar = visor.getText() + numero;
		visor.setText(auxiliar);
		
		if(auxiliar.equals("22")) {
			foto.setIcon(new ImageIcon("C:\\dev\\projetos\\treinamento-java-programmer\\urna-eletronica\\src\\candidato1.JPG"));			
		}
		
		if(auxiliar.equals("13")) {
			foto.setIcon(new ImageIcon("C:\\dev\\projetos\\treinamento-java-programmer\\urna-eletronica\\src\\candidato2.JPG"));			
		}
		
		if(auxiliar.equals("12")) {
			foto.setIcon(new ImageIcon("C:\\dev\\projetos\\treinamento-java-programmer\\urna-eletronica\\src\\candidato3.JPG"));			
		}
		
		if(auxiliar.equals("15")) {
			foto.setIcon(new ImageIcon("C:\\dev\\projetos\\treinamento-java-programmer\\urna-eletronica\\src\\candidato4.JPG"));			
		}
	}
}
