package exemplos.capitulo_04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Media {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Calcular M�dia");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(320, 400);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);

		JTextField caixa1 = new JTextField();
		caixa1.setBounds(15, 10, 100, 30);
		frame.add(caixa1);

		JTextField caixa2 = new JTextField();
		caixa2.setBounds(15, 50, 100, 30);
		frame.add(caixa2);

		JTextField caixa3 = new JTextField();
		caixa3.setBounds(15, 90, 200, 30);
		frame.add(caixa3);

		JButton botaoMedia = new JButton("M�dia");
		botaoMedia.setBounds(15, 130, 100, 30);
		frame.add(botaoMedia);

		botaoMedia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nota1String = caixa1.getText();
				String nota2String = caixa2.getText();
				System.out.println(nota1String);

				double nota1Double = Double.parseDouble(nota1String);
				double nota2Double = Double.parseDouble(nota2String);
				double media = (nota1Double + nota2Double) / 2;

				if (media < 6) {

					caixa3.setText("Aluno Reprovado - " + media );
				} else {

					caixa3.setText("Aluno Aprovado - " + media);
				}

			}
		});

		frame.setVisible(true);

	}

}
