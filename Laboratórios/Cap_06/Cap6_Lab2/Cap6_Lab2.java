
public class Cap6_Lab2 {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
//		Chamadas referentes ao Lab 1:
//		System.out.println("calc.somar(6,3) = " + calc.somar(6, 3));
//		System.out.println("calc.subtrair(6,3) = " + calc.subtrair(6, 3) );
//		System.out.println("calc.multiplicar(6,3) = " + calc.multiplicar(6, 3));
//		System.out.println("calc.dividir(6,3) = " + calc.dividir(6, 3));
//		
		System.out.println("MÉtodos subtrair sobrecarregados:");
		System.out.println("Chamando a versão de subtrair com 2 double: " + calc.subtrair(6.2, 3.1));
		System.out.println("Chamando a versão de subtrair com 1 double e um int: " + calc.subtrair(6.2, 2));
		System.out.println("Chamando a versão de subtrair com 1 int e um double: " + calc.subtrair(6, 3.2));
		
	}

}
