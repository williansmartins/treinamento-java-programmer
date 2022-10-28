import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cap16_Lab2 {

    private static final String PASTA_ORIGEM = "C:\\Java\\Exercicios\\Capitulo16\\documentos";
    private static final String PASTA_BACKUP = "C:\\Java\\Exercicios\\Capitulo16\\documentos_bkp";

    public static void main(String[] args) {

        /* Cria referencias das pastas */
        Path origem = Paths.get(PASTA_ORIGEM);
        Path backup = Paths.get(PASTA_BACKUP);

        try {

            /* Verifica se diretorio destino ja existe. */
            if (Files.exists(backup)) {
                System.out.println("Diretório " + backup.getFileName() + " já existe.");
            } else {
                Files.createDirectories(backup);
                System.out.println("Diretório " + backup.getFileName() + " criado com sucesso.");
            }

            Stream<Path> streamOrigem = Files.list(origem);

            streamOrigem.forEach(p -> {
                try {
                    System.out.println("Copiando arquivo " + p.getFileName());
                    Files.copy(p, backup.resolve(p.getFileName()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
