package exemplos.apendice2;

public class UsandoString {

	public static void main(String[] args) {
		String nome = " Willians  ";
		System.out.println(nome);
		System.out.println(nome.length());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.substring(4));
		System.out.println(nome.substring(4, 6));
		System.out.println(nome.substring(0, 4));		
//		System.out.println( nome.split("i")[1]);
		System.out.println(nome.charAt(3));
		System.out.println(nome.concat(" Martins"));
		System.out.println(nome.equals("WILLIANS"));
		System.out.println(nome.equalsIgnoreCase("WILLIANS"));
		System.out.println(nome.replaceAll("ll", "zz")); 
		System.out.println(nome.contains("W")); 
		System.out.println(nome.contains("s")); 
		System.out.println(nome.trim()); 
	}

}
