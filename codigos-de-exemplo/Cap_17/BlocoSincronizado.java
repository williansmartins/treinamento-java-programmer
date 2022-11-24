
public class BlocoSincronizado {
	
	public void testar(){
		
		System.out.println("Não sincronizado");
		synchronized(this){
			System.out.println("Sincronizado");
		}
	}
}
