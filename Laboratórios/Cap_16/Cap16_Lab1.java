import java.io.*;

public class Cap16_Lab1 {

    public static void main(String[] args) {
        escrever("Capítulo 16\nLaboratório 1");
        ler();
    }

    private static void escrever(String texto) {

        try {

            FileOutputStream arquivo = new FileOutputStream("Cap16_Lab1.txt");
            DataOutputStream dados = new DataOutputStream(arquivo);
            
            dados.writeChars(texto);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    private static void ler() {
        
        try {

            FileInputStream arquivo = new FileInputStream("Cap16_Lab1.txt");
            DataInputStream dados = new DataInputStream(arquivo);
            
            while (dados.available() > 0) {
                char c = dados.readChar();
                System.out.print(c);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
