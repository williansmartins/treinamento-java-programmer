package exemplos.capitulo_15;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExemploMap {

    public static void main(String[] args) {

        List<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario(3018, "Joaquim Batista", "Desenvolvedor", 5550.0));
        lista.add(new Funcionario(1045, "Maria das Dores", "Desenvolvedor", 6250.0));
        lista.add(new Funcionario(1780, "Jo�o Ricardo",    "Desenvolvedor", 7100.0));
        lista.add(new Funcionario(5200, "Ana Maria",       "Desenvolvedor", 4100.0));
        lista.add(new Funcionario(3999, "Robson Gusm�o",   "Desenvolvedor", 6500.0));
        lista.add(new Funcionario(2389, "Eduardo Alves",   "Desenvolvedor", 3200.0));

        Stream<Funcionario> streamFunc = lista.stream();
        Stream<JogadorFutebol> streamJogador = 
                streamFunc.map(f -> new JogadorFutebol(
                    f.getNome(),
                    f.getSalario() > 6000 ? "Atacante" : "Zagueiro"
                ));
        
        streamJogador.forEach(System.out::println);
    }
}
