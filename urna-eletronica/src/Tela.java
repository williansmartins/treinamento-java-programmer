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

public class Tela extends JFrame{
	private JTextField textField;
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
		lblJustiaEleitoral.setBounds(306, 11, 220, 27);
		getContentPane().add(lblJustiaEleitoral);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(235, 77, 286, 246);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(1);
			}
		});
		button.setBackground(new Color(0, 0, 0));
		button.setForeground(new Color(255, 255, 255));
		button.setBounds(67, 11, 41, 36);
		panel.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(2);
			}
		});
		button_1.setBackground(new Color(0, 0, 0));
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBounds(118, 11, 41, 36);
		panel.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_2.setBackground(new Color(0, 0, 0));
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBounds(169, 11, 41, 36);
		panel.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBackground(new Color(0, 0, 0));
		button_3.setForeground(new Color(255, 255, 255));
		button_3.setBounds(67, 58, 41, 36);
		panel.add(button_3);
		
		JButton button_1_1 = new JButton("5");
		button_1_1.setBackground(new Color(0, 0, 0));
		button_1_1.setForeground(new Color(255, 255, 255));
		button_1_1.setBounds(118, 58, 41, 36);
		panel.add(button_1_1);
		
		JButton button_2_1 = new JButton("6");
		button_2_1.setBackground(new Color(0, 0, 0));
		button_2_1.setForeground(new Color(255, 255, 255));
		button_2_1.setBounds(169, 58, 41, 36);
		panel.add(button_2_1);
		
		JButton button_4 = new JButton("7");
		button_4.setBackground(new Color(0, 0, 0));
		button_4.setForeground(new Color(255, 255, 255));
		button_4.setBounds(67, 105, 41, 36);
		panel.add(button_4);
		
		JButton button_1_2 = new JButton("8");
		button_1_2.setBackground(new Color(0, 0, 0));
		button_1_2.setForeground(new Color(255, 255, 255));
		button_1_2.setBounds(118, 105, 41, 36);
		panel.add(button_1_2);
		
		JButton button_2_2 = new JButton("9");
		button_2_2.setBackground(new Color(0, 0, 0));
		button_2_2.setForeground(new Color(255, 255, 255));
		button_2_2.setBounds(169, 105, 41, 36);
		panel.add(button_2_2);
		
		JButton button_2_2_1 = new JButton("0");
		button_2_2_1.setBackground(new Color(0, 0, 0));
		button_2_2_1.setForeground(new Color(255, 255, 255));
		button_2_2_1.setBounds(118, 152, 41, 36);
		panel.add(button_2_2_1);
		
		JButton button_2_2_1_1 = new JButton("branco");
		button_2_2_1_1.setBounds(10, 199, 91, 36);
		panel.add(button_2_2_1_1);
		button_2_2_1_1.setForeground(new Color(0, 0, 0));
		button_2_2_1_1.setBackground(new Color(255, 255, 255));
		
		JButton button_2_2_1_1_1 = new JButton("corrige");
		button_2_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2_2_1_1_1.setBounds(107, 199, 73, 36);
		panel.add(button_2_2_1_1_1);
		button_2_2_1_1_1.setBackground(new Color(255, 165, 0));
		
		JButton button_2_2_1_1_1_1 = new JButton("confirma");
		button_2_2_1_1_1_1.setBounds(186, 199, 91, 36);
		panel.add(button_2_2_1_1_1_1);
		button_2_2_1_1_1_1.setBackground(Color.GREEN);
		
		JLabel lblEleitoral = new JLabel("Eleitoral");
		lblEleitoral.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEleitoral.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEleitoral.setBounds(298, 39, 220, 27);
		getContentPane().add(lblEleitoral);
		
		textField = new JTextField();
		textField.setBounds(23, 126, 132, 27);
		getContentPane().add(textField);
		textField.setColumns(10);
	}
}
