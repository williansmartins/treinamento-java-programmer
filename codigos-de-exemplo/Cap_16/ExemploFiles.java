import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploFiles {

    public static void main(String[] args) {

        try {

            Path arquivo = Paths.get("resources\\poema.txt");
            Path novaPasta = Paths.get("resources\\textos\\rascunhos\\vazio");
            Path pasta = Paths.get("C:\\Meus Documentos\\Mp3");
            
            if (!Files.exists(arquivo)) {
                System.out.println("O item não existe.");
            } else if (Files.isDirectory(arquivo)) {
                System.out.println("O item é um diretório.");
            } else if (Files.isRegularFile(arquivo)) {
                System.out.println("O item é um arquivo.");
            }

            /* Exibe  */
            System.out.println(Files.size(arquivo));

            /* Cria o diretório rascunhos. */
            Files.createDirectories(novaPasta);

            /* Exibe o conteúdo do diretório Mp3 */
            Files.list(pasta).forEach(f -> System.out.println(f.getFileName()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

