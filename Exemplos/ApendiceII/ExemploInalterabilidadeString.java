
public class ExemploInalterabilidadeString {
	public static void main(String args[]){
		String a = "Aluno";
		a.concat(" Módulo Avançado");
		System.out.println("a = " + a); // o resultado é a = Aluno
		a.toUpperCase();
		System.out.println("a = " + a); // o resultado ainda é a = Aluno
		a.replace('A', 'e');
		System.out.println("a = " + a); // o resultado ainda é a = Aluno
	}
}
