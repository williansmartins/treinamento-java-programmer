
public class ExemploFluxoExecucaoComandos {
	/*** definição do método executarTareda ***/
	static void executarTarefa(){
		System.out.println("Executando uma tarefa");
	}
	/*** término da definição ***/
	
	public static void main(String args[]){
		System.out.println("Executando o primeiro comando");
		System.out.println("Executando o segundo comando");
		System.out.println(" . ");
		System.out.println(" . ");
		System.out.println(" . ");
		
		executarTarefa();
		
		System.out.println("Sou o próximo comando que segue a chamada do método");
		System.out.println(" . ");
		System.out.println(" . ");
		System.out.println(" . ");
		System.out.println("Executando o último comando");
	}
}
