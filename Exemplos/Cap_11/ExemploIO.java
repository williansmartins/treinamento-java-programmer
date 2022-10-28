import java.io.FileReader;
import java.io.IOException;

public class ExemploIO {
	
	public static void main(String[] args) {
		
		try {
			FileReader  doc;
			doc = new FileReader("C:\\carta.txt");
			
		}catch(IOException e) {
			System.out.println("Não foi possível abrir o arquivo!");
			e.printStackTrace();
		}
	}
	

}
