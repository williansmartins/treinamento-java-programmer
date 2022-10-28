import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma frase:");
            String texto = scanner.nextLine();

            PrintWriter writer = new PrintWriter("C:\\doc1.txt");
            writer.println(texto);
            writer.close();
            
            System.out.println("Frase gravada com sucesso.");

        } catch (IOException ioe) {
            System.out.println("Falha ao gravar as informações digitadas.");
        }
    }
}
