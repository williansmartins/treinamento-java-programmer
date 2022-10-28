
public class ExemploUsoString {
	public static void main(String args[]){
		String a = "Aluno";
		System.out.println("a = " + a);
		
		a = a.concat(" Módulo Avançado");
		System.out.println("a = " + a);
		
		a = a.toUpperCase();
		System.out.println("a = " + a);
		
		a = a.replace('A', 'e');
		System.out.println("a = " + a);
	}
}
