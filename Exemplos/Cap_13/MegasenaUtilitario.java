package megasena;

import java.util.Random;

public class MegasenaUtilitario {
	
	public static int sortearNumero() {
		
		Random sorteador = new Random();
		int numero = sorteador.nextInt();
		
		while(numero <= 0 || numero > 60) {
			numero = sorteador.nextInt();
		}
		
		return numero;
	}

}
