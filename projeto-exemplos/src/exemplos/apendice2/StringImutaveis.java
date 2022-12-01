package exemplos.apendice2;

public class StringImutaveis {

	public static void main(String[] args) {
		String animal1 = "gato";
		String animal2 = "gato";
		
		System.out.println(animal1 == animal2);
		
		animal2 = "cachorro";

		System.out.println(animal1 == animal2);

		animal2 = "ga".concat("to");
		System.out.println(animal1);
		System.out.println(animal2);
		
		System.out.println(animal1 == animal2);
		
		animal2 = animal2.concat(" preto");
		
		System.out.println(animal2);
		

		
		
	}

}
