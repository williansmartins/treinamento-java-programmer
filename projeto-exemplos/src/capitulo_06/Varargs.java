package capitulo_06;

public class Varargs {

	public static void main(String[] args) {
		
	}
	
	public int calcular(int a, int b) {
		System.out.println("1");
		return a + b;
	}
	
	public int calcular(int a, long b) {
		System.out.println("1");
		return 1;
	}

	public int calcular(int a, int b, int c) {
		System.out.println("2");
		return a + b + c;
	}

	public int calcular(int a, int b, int c, int d) {
		System.out.println("3");
		return a + b + c + d;
	}

	public int calcular(int a, int b, int c, int d, int e) {
		System.out.println("4");
		return a + b + c + d + e;
	}
	
	double x(int a, long b) {
		return a + b;
	}
	
	double metodo() {
		int resultado = 3/8;
		return resultado;
	}
	
	double metodo(int a, int b) {
		int resultado = a/b;
		return resultado;
	}
	

}
