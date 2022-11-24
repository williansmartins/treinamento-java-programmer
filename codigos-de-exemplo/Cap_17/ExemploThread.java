
public class ExemploThread extends Thread {

	public void run(){
		System.out.println("Algo sendo executado em Exemplo Thread");
	}
	
	public void run(String segmento){
		System.out.println("A String em execução é " + segmento);
	}
	
}
