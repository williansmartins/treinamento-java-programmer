
public class ExemploCriacaoArray {
	public static void main(String args[]){
		
		int codigos[];
		codigos = new int[9];
		int numero = 5;
		codigos[0] = 0;
		codigos[1] = 1;
		codigos[2] = 1;
		codigos[3] = 2;
		codigos[4] = 3;
		codigos[5] = numero;
		codigos[6] = 8;
		codigos[7] = 13;
		codigos[8] = 21;
		
		for(int i = 0; i < codigos.length; i++){
			System.out.print(codigos[i] + " ");
		}
	}
}
