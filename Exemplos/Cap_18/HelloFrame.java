import javax.swing.JFrame;

public class HelloFrame extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello JAR !");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
