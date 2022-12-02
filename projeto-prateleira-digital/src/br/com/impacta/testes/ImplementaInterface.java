package br.com.impacta.testes;

public class ImplementaInterface implements MinhaInterface {

	@Override
	public void somar() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	@Override
	public int subtrair(int a, int b) {
		return a-b; 
	}

}
