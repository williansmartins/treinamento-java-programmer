
public class ExemploCriacaoObjetosString {
	public static void main(String args[]){
		String m1 = "passa para ";
		String m2 = m1 + "começo ";
		m1.concat("volta ");
		m2.concat(m1);
		m1 += "fim ";
		System.out.println("m1 = " + m1);
		System.out.println("m2 = " + m2);
	}
}
