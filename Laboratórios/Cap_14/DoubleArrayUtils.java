import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;

public class DoubleArrayUtils {

    public static double[] transformaValores(double[] valores, DoubleUnaryOperator funcao) {
        double[] result = new double[valores.length];
        for (int i = 0; i < valores.length; i++) {
            result[i] = funcao.applyAsDouble(valores[i]);
        }
        return result;
    }

    public static double[] filtraValores(double[] valores, DoublePredicate criterio) {

        double[] temp = new double[valores.length];
        int counter = 0;

        for (double val : valores) {
            if (criterio.test(val)) {
                temp[counter++] = val;
            }
        }

        double[] result = new double[counter];
        System.arraycopy(temp, 0, result, 0, counter);

        return result;
    }

    public static void processaValores(double[] valores, DoubleConsumer processo) {
        for (double val : valores) {
            processo.accept(val);
        }
    }
}
