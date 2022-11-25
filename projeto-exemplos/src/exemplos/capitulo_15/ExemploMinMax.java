package exemplos.capitulo_15;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploMinMax {

    public static void main(String[] args) {

        List<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario(3018, "Joaquim Batista", "Desenvolvedor", 5550.0));
        lista.add(new Funcionario(1045, "Maria das Dores", "Desenvolvedor", 6250.0));
        lista.add(new Funcionario(1780, "Jo�o Ricardo",    "Desenvolvedor", 7100.0));
        lista.add(new Funcionario(5200, "Ana Maria",       "Desenvolvedor", 4100.0));
        lista.add(new Funcionario(3999, "Robson Gusm�o",   "Desenvolvedor", 6500.0));
        lista.add(new Funcionario(2389, "Eduardo Alves",   "Desenvolvedor", 3200.0));

        Funcionario minFunc =
                lista.stream()
                     .min(Comparator.comparing(Funcionario::getMatricula))
                     .get();

        Funcionario maxFunc =
                lista.stream()
                     .max(Comparator.comparing(Funcionario::getMatricula))
                     .get();

        System.out.println("Funcionario de MENOR matricula: \n" + minFunc);
        System.out.println("Funcionario de MAIOR matricula: \n" + maxFunc);
    }
}
