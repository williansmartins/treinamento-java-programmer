
public class ExemploMath {
	public static void main(String args[]){
		int numeros[] = new int[10];
		int maior = 0;
		for(int i = 0; i < numeros.length; i++){
			Double n = Math.random() * 100 + 1;
			numeros[i] = n.intValue();
			maior = Math.max(maior, numeros[i]);
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nMaior número do array é "+maior);
	}
}
