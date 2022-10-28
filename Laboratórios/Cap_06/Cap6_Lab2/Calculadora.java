
public class Calculadora {

	// Métodos criados durante o Cap 07 e Lab 1:
	public int somar(int valor1, int valor2) {
		int resultado;
		resultado = valor1 + valor2;
		return resultado;
	}
	
	public int subtrair (int valor1, int valor2) {
		int resultado = valor1 - valor2;
		return resultado;
	}
	
	public int multiplicar (int valor1, int valor2) {
		int resultado = valor1 * valor2;
		return resultado;
	}
	
	public int dividir (int valor1, int valor2) {
		int resultado = valor1 / valor2;
		return resultado;
	}
	
	// Métodos sobrecarregados criados no Lab 2
	public double subtrair(double valor1, double valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}
	
	public double subtrair(int valor1, double valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}
	
	public double subtrair(double valor1, int valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}

}
