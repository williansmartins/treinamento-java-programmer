import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExemploMap2 {

    public static void main(String[] args) {

        List<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario(3018, "Joaquim Batista", "Desenvolvedor", 5550.0));
        lista.add(new Funcionario(1045, "Maria das Dores", "Desenvolvedor", 6250.0));
        lista.add(new Funcionario(1780, "João Ricardo",    "Desenvolvedor", 7100.0));
        lista.add(new Funcionario(5200, "Ana Maria",       "Desenvolvedor", 4100.0));
        lista.add(new Funcionario(3999, "Robson Gusmão",   "Desenvolvedor", 6500.0));
        lista.add(new Funcionario(2389, "Eduardo Alves",   "Desenvolvedor", 3200.0));

        Stream<Funcionario> streamFunc = lista.stream();
        Stream<String> streamCargo = streamFunc.map(Funcionario::getCargo);
        
        streamCargo.forEach(System.out::println);
    }
}
