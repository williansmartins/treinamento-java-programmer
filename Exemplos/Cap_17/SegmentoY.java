
public class SegmentoY extends Thread {
	
	int montante;
	
	public void run(){
		synchronized(this){
			for(int a = 0; a <= 10; a++){
				montante += a;
			}
			notify();
		}
	}
}
