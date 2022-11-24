
public class ExemploUsoValue {
	public static void main(String args[]){
		
		Integer i = Integer.valueOf(64); // cria um novo objeto Wrapper
		System.out.println(i);
		byte b = i.byteValue(); // converte o valor de i para um primitivo byte
		System.out.println(b);
		short s = i.shortValue(); // converte o valor de i para short
		System.out.println(s);
		double d = i.doubleValue(); // converte o valor de i para double
		System.out.println(d);
		
		Float f = Float.valueOf(6.75f); // cria um novo objeto Wrapper
		short s1 = f.shortValue(); // converte o valor de f para short
		System.out.println(s1); // o resultado é 6 (truncado)
	}
}
