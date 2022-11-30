package exemplos.apendice2;

import java.time.LocalDateTime;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Date data = new Date();
		System.out.println(data);
		
		LocalDateTime data2 = LocalDateTime.now();
		System.out.println(data2.getMonth());
		System.out.println(data2.getMonthValue());
		
		
		
		
	}

}
