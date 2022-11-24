
public class ExemploSimplesCriacaoArray {
	public static void main(String args[]){
		
		int numero = 5;
		int codigos[] = {0, 1, 1, 2, 3, numero, 8, 13, 21};
		
		for(int i = 0; i < codigos.length; i++){
			System.out.print(codigos[i] + " ");
		}
	}
}
