
public class ExemploThread2 extends Thread {

	private String mensagem;
	
	public ExemploThread2(String mensagem){
		this.mensagem = mensagem;
	}
	
	public void run(){
		while(true){
			System.out.println(mensagem);
		}
	}
	
	public static void main(String args[]){
		ExemploThread2 segmento = new ExemploThread2("Executando a nova thread");
		segmento.start();
		while(true){
			System.out.println("Executando a thread principal");
		}
	}
	
}
