public class AtribuicaoMultipla {

    public static void main(String[] args) {

        String endereco;
        String novoEndereco;
        int a, b, c, d, e, f;

        endereco = "Rua X";

        novoEndereco = (endereco = "Rua X");

        a = b = c = d = e = f = 8;
    }
}
