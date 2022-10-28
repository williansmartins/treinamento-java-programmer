
public class ExemploForeach {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		numeros[5] = 60;
		
		//percorreno e exibindo os elementos
		for(int num : numeros) {
			System.out.println(num);
		}
	}
}


