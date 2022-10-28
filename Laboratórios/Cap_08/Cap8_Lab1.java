
public class Cap8_Lab1 {
	public static int maiorNumero(int array[]){
		int maior = 0;
		if(array.length > 0) {
			maior = array[0];
		}
		
		for(int i = 1; i < array.length; i++){
			if(array[i] > maior)
				maior = array[i];
		}
		return maior;
	}
	
	public static void main(String args[]){
		int numeros[] = {3,2,11,4,6,9};
		int maior = maiorNumero(numeros);
		System.out.println("O maior número do array é " + maior);
	}
}
