
public class Exemplo2ImutabilidadeString {
	public static void main(String args[]){
		String a = "Aluno";
		a = a.concat(" Módulo Avançado"); // a está sendo atribuído à nova String
		System.out.println("a = " + a); // o resultado é a = Aluno Módulo Avançado
	}
}
