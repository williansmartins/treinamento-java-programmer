import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {

        List<String> paises = new ArrayList<>();

        paises.add("Brasil");
        paises.add("Portugal");
        paises.add("Estados Unidos");
        paises.add("França");
        paises.add("Inglaterra");
        paises.add(2, "Itália");

        System.out.println("Países na ordem original:");
        paises.forEach(curso -> System.out.println(" - " + curso));

        System.out.println("==============================");
        
        /* Verifica se esta lista possui o String "Estados Unidos" */
        System.out.println(paises.contains("Estados Unidos"));

        /* Imprime o item na posição 2 */
        System.out.println(paises.get(2));

        /* Imprime o tamanho desta lista */
        System.out.println(paises.size());

        /* Imprime em que posição da lista está a "França" */
        System.out.println(paises.indexOf("França"));

        /* Substitui todos os elementos pelo seu conteúdo em maiúsculo */
        paises.replaceAll(s -> s.toUpperCase());

        /* Reordena todo a lista utilizando a ordem natural de Strings */
        paises.sort((x, y) -> x.compareTo(y));

        System.out.println("==============================");
        
        System.out.println("Países ordenados e em maiúsculo:");
        paises.forEach(curso -> System.out.println(" - " + curso));
    }
}
