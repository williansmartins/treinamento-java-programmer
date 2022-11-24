
public class ExemploNumberFormat {

    public static void main(String[] args) {

        try {

            String texto = "10xpt23";
            int idade = Integer.parseInt(texto);

            System.out.println("Parabéns pelos seus " + idade + " anos de idade.");

        } catch (NumberFormatException e) {
            System.out.println("Número inválido.");
            e.printStackTrace();
        }
    }
}
