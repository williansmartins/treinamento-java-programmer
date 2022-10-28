public class DescontoSalarial {

    public static void main(String[] args) {

        double[] salariosBrutos = { 1350.0, 4320.15, 8235.25, 2500.55, 1830.0, 850.26, 3614.29, 12500.0 };
        double[] salariosLiquidos = DoubleArrayUtils.transformaValores(salariosBrutos, d -> .9 * d);

        DoubleArrayUtils.processaValores(salariosLiquidos, d -> System.out.println(d));
    }
}
