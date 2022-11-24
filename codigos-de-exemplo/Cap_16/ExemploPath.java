import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploPath {

    public static void main(String[] args) {
        
        Path poema = Paths.get("resources\\poema.txt");

        /* Exibe o caminho especificado pelo path. */
        System.out.println(poema);

        /* Exibe o caminho completo do path a partir da raiz. */
        System.out.println(poema.toAbsolutePath());

        /* Exibe apenas o nome do arquivo. */
        System.out.println(poema.getFileName());               

        /* Exibe o caminho completo do diretório pai. */
        System.out.println(poema.getParent().toAbsolutePath());
    }
}
