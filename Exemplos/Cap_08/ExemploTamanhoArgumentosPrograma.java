public class ExemploTamanhoArgumentosPrograma {

	public static void main(String[] args) {

		if (args.length == 3) {
			System.out.println("Nome: " + args[0]);
			System.out.println("Cargo: " + args[1]);
			System.out.println("Código: " + args[2]);
		}else {
			System.out.println("Digite: [nome] [cargo] [codigo]");
		}

	}

}
