import java.util.ArrayList;
import java.util.List;

public class ExemploStream {

    public static void main(String[] args) {

        /* Cria uma lista vazia de funcionarios. */
        List<Funcionario> list = new ArrayList<>();

        /* Adiciona alguns funcionarios a lista. */
        list.add(new Funcionario(2005, "Manuel da Silva", "Desenvolvedor", 3580.0));
        list.add(new Funcionario(3018, "Joaquim Batista", "Desenvolvedor", 5500.0));
        list.add(new Funcionario(1045, "Maria das Dores", "Analista",      6250.0));
        list.add(new Funcionario(1780, "João Ricardo",    "Desenvolvedor", 7100.0));
        list.add(new Funcionario(5200, "Ana Maria",       "Vendedor",      4100.0));
        list.add(new Funcionario(3420, "André de Souza",  "Desenvolvedor", 5890.0));
        list.add(new Funcionario(3999, "Robson Gusmão",   "Analista",      6500.0));
        list.add(new Funcionario(1920, "Rubens Vieira",   "Coordenador",   12300.5));
        list.add(new Funcionario(2389, "Eduardo Alves",   "Desenvolvedor", 3200.0));
        list.add(new Funcionario(6300, "Joana Paiva",     "Atendente",     1350.0));

        /* Executa sucessivas operacoes com os dados da lista. */
        list.stream()
            .filter(f -> "Desenvolvedor".equals(f.getCargo()))
            .sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
            .skip(1)
            .limit(2)
            .forEach(System.out::println);
    }
}
