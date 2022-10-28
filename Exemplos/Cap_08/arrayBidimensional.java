
public class arrayBidimensional {
	public static void main(String args[]){
		
		double notas[][] = new double[100][3];
		// 100 é a quantidade de alunos
		// 3 é a quantidade de notas
		
		notas[0][0] = 6.5; // Primeira nota do primeiro aluno
		notas[0][1] = 7.5; // Segunda nota do primeiro aluno
		notas[0][2] = 7.0; // Terceira nota do primeiro aluno
		
		notas[1][0] = 5.4; // Primeira nota do segundo aluno
		notas[1][1] = 9.0; // Segunda nota do segundo aluno
		notas[1][2] = 4.1; // Terceira nota do segundo aluno

		notas[99][0] = 7.2; // Primeira nota do último aluno
		notas[99][1] = 8.6; // Segunda nota do último aluno
		notas[99][2] = 6.5; // Terceira nota do último aluno
	}
}
