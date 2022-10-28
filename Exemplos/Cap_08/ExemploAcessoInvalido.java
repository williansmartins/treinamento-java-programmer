
public class ExemploAcessoInvalido {
	public static void main(String args[]){
		
		int numeros[] = new int[6];
		numeros[6] = 3; // exceção em tempo de execução.
						// o último elemento está na posição de índice 5
		
		int valores[] = new int[6];
		int indice = -5;
		valores[indice] = 3; // exceção em tempo de execução.
							 // indice é um número negativo
	}
}
