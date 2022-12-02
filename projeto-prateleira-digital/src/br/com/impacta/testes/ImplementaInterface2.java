package br.com.impacta.testes;

public class ImplementaInterface2 implements MinhaInterface {

	@Override
	public void somar() {
		int a = 10;
		int b = 20;
		System.out.println(b + a);
	}

	@Override
	public int subtrair(int a, int b) {
		return b-a; 
	}

}
