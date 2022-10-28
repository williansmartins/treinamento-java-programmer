
public class ExemploThread3 {
	
	public static void main(String args[]){
		
		TesteRunnable r = new TesteRunnable();
		Thread testar = new Thread(r);
		Thread avaliar = new Thread(r);
		Thread examinar = new Thread(r);
		testar.start();
		avaliar.start();
		examinar.start();
		
	}
	
}
