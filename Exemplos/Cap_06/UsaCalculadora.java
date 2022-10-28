
public class UsaCalculadora {
	public static void main(String args[]){
		int s; // definição simples de variável
		// criação de uma instância de Calculadora
		Calculadora calc = new Calculadora();
		// atribuindo a 's' a chamada do método somar com dois valores
		s = calc.somar(15, 20);
		// mostra o valor de s na tela
		System.out.println("s = " + s);
	}
}
