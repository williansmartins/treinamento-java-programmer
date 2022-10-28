
public class ExemploMetodosEncadeados2 {
	public static void main(String args[]){
		String a = "Pessoa Física";
		String b = a.concat(" Jurídica").toUpperCase().substring(7);
		System.out.println(b);
	}
}
