
public class Cap6_Lab3 {

	public static void main(String[] args) {
		Aluno joao = new Aluno();
		joao.setNome("João");
		joao.contadorDeAlunos++;
		joao.imprimeAluno();
		System.out.println("Contagem no objeto joao: " + joao.contadorDeAlunos + "\n");
		
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		maria.contadorDeAlunos++;
		maria.imprimeAluno();
		System.out.println("Contagem no objeto maria: " + maria.contadorDeAlunos + "\n");
		
		Aluno marcos = new Aluno();
		marcos.setNome("Marcos");
		marcos.contadorDeAlunos++;
		marcos.imprimeAluno();
		System.out.println("Contagem no objeto marcos: " + marcos.contadorDeAlunos + "\n");
	
		// impressão usando a referência estática correta:
		System.out.println("Contador acessado diretamente da classe: " + Aluno.contadorDeAlunos);
		
	}

}
