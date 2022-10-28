
public class arrayMultidimensional {
	public static void main(String args[]){
		
		double notas[][][] = new double[100][4][3];
		// 100 é a quantidade de alunos
		// 4 é a quantidade de matérias
		// 3 é a quantidade de notas
		
		notas[0][0][0] = 6.5; // Primeira nota do primeiro aluno para a primeira matéria
		notas[0][0][1] = 7.5; // Segunda nota do primeiro aluno para a primeira matéria
		notas[0][0][2] = 7.0; // Terceira nota do primeiro aluno para a primeira matéria

		notas[0][1][0] = 6.5; // Primeira nota do primeiro aluno para a segunda matéria
		notas[0][1][1] = 7.5; // Segunda nota do primeiro aluno para a segunda matéria
		notas[0][1][2] = 7.0; // Terceira nota do primeiro aluno para a segunda matéria

		notas[99][3][0] = 7.2; // Primeira nota do último aluno para a última matéria
		notas[99][3][1] = 8.6; // Segunda nota do último aluno para a última matéria
		notas[99][3][2] = 6.5; // Terceira nota do último aluno para a última matéria
	}
}
