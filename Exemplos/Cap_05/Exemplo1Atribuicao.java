
public class Exemplo1Atribuicao {
	public static void main(String args[]){
		
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		
		joao.sexo = 'M';
		joao.idade = 45;
		
		maria.sexo = 'F';
		maria.idade = 17;
		
		joao = maria; // atribuição realizada
		// as variáveis joao e maria fazem referência ao mesmo objeto
		System.out.println("João sexo = " + joao.sexo);
		System.out.println("João idade = " + joao.idade);
	}
}
