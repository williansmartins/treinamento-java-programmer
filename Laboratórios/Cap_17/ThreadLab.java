
public class ThreadLab extends Thread {
	public ThreadLab(String a){
		super(a);
	}
	
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
