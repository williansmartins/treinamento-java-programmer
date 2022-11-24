package exemplos.capitulo_13;

public class Varargs {

	public static void main(String[] args) {
		int inteiros[] = {11, 22};
		calcular2(inteiros);
		calcular(1);
		calcular(1, 2);
		calcular(1, 2, 3);
		calcular(1, 2, 3, 4);
		
		multiplicar(3,5,9);
		
//		System.out.println(resultado);
	}
	
//	public int calcular(int a, int b) {
//		return a + b;
//	}
//	
//	public int calcular(int a, long b) {
//		return 1;
//	}
//
//	public int calcular(int a, int b, int c) {
//		return a + b + c;
//	}
//
//	public int calcular(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}
//
//	public int calcular(int a, int b, int c, int d, int e) {
//		return a + b + c + d + e;
//	}
	
	static public int calcular2(int[] inteiros) {
		int resultado = 0;
		
		for (int i = 0; i < inteiros.length; i++) {
			//resultado += inteiros[i];
			resultado = resultado + inteiros[i];			
		}
		
		return  resultado;
	}
	
	static public int calcular(int ... inteiros) {
		int resultado = 0;
		
		for (int valor : inteiros) {
			resultado += valor;			
		}
		
		return  resultado;
	}
	
	static public int multiplicar(int ... inteiros) {
		int resultado = 0;
		
		for (int valor : inteiros) {
			resultado *= valor;			
		}
		
		return  resultado;
	}

}
