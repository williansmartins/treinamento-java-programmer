package exemplos.apendice2;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class UrnaEletronica extends JFrame {
	public UrnaEletronica() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(252, 50, 53, 49);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(315, 50, 53, 49);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("1");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(379, 50, 53, 49);
		getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("1");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(252, 110, 53, 49);
		getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("1");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_3.setBounds(315, 110, 53, 49);
		getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("1");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_4.setBounds(379, 110, 53, 49);
		getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("1");
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_5.setBounds(252, 169, 53, 49);
		getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("1");
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_6.setBounds(315, 169, 53, 49);
		getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("1");
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_7.setBounds(379, 170, 53, 49);
		getContentPane().add(btnNewButton_1_7);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(31, 29, 183, 217);
		lblNewLabel.setIcon(new ImageIcon(UrnaEletronica.class.getResource("/exemplos/apendice2/candidato1.JPG")));
		getContentPane().add(lblNewLabel);
	}
}
