
public class Carro {
	private ConjuntoDePneus meuConjuntoDePneus;
	
	public void rodar(){
		// delega o comportamento de rodar para o objeto ConjuntoDePneus
		meuConjuntoDePneus.rodar();
	}
}
