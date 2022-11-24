
public class ExemploArrayIndex {

    public static void main(String[] args) {

        try {

            double[] salario = { 1200.5, 630.0, 950.15 };
            double s = salario[3];

            System.out.println("Salário atual: " + s);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Número inválido.");
            e.printStackTrace();
        }
    }
}
