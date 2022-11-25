package exemplos.capitulo_15;
import java.util.HashSet;
import java.util.Set;

public class ExemploRemoveIf {

    public static void main(String[] args) {
        
        Set<Produto> cursos = new HashSet<>();
        
        cursos.add(new Produto("Leite em p�", "Latic�nios", 5.80));
        cursos.add(new Produto("Cerveja em lata", "Bebidas", 1.89));
        cursos.add(new Produto("Detergente", "Limpeza", 2.49));
        cursos.add(new Produto("Manteiga", "Latic�nios", 2.90));
        cursos.add(new Produto("Pasta de dente", "Limpeza", 1.75));

        cursos.removeIf(p -> p.getPreco() > 2.5);

        System.out.println("Lista de produtos: \n");
        cursos.forEach(p -> System.out.println("Produto: " + p));
    }
}
