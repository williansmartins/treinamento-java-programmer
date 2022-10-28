package cap5lab1;

public class Cap5_Lab1 {
	public static void main(String args[]){
		Funcionario joao = new Funcionario();
		joao.nome = "João";
		joao.sobrenome = "Pedro";
		joao.cargo = "Programador";
		joao.salario = 4000;
		
		System.out.println("Nome: " + joao.nome);
		System.out.println("Sobrenome: " + joao.sobrenome);
		System.out.println("Cargo: " + joao.cargo);
		System.out.println("Salário: " + joao.salario);
	}
}
