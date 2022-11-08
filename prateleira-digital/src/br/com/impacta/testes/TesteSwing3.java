package br.com.impacta.testes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TesteSwing3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Olá Janela!");
		frame.setVisible(true);
		frame.setSize(400,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
  
		JButton b1 = new JButton();
	    b1.setVisible(true);
	    b1.setText("Salvar");
	    b1.setBounds(50,100,100,20);  
//	    b1.setSize(200,20);
	    frame.add(b1);
	    
	    final JTextField textField =new JTextField();  
	    
	    
	    b1.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		textField.setText("Novo texto");  
	    	        }  
	    	    }); 
	}
}
