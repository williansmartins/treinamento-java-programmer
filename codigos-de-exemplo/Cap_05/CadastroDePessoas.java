
public class CadastroDePessoas {

    static Pessoa pes;

    public static void main(String[] args) {

        if (pes == null) {
            System.out.println("A variável ainda não foi instanciada.");
            pes = new Pessoa();
            System.out.println("Variável inicializada. Prosseguindo...");
        }

        pes.nome = "Manuel";
        pes.idade = 25;
    }
}
