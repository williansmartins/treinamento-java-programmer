
public class ExemploUsoParse {
	public static void main(String args[]){
		
		double pi = Double.parseDouble("3.14");
		System.out.println("PI = " + pi);
		Double pi2 = Double.valueOf("3.14");
		System.out.println(pi2 instanceof Double);
		long l1 = Long.parseLong("010111", 2);
		System.out.println("L1 = " + l1);
		Long l2 = Long.valueOf("010111", 2);
		System.out.println("L2 = " + l2);
	}
}
