
public class TestandoGenerics {

    public static void main(String[] args) {
        
        /* Declarando e instanciando classes generics */
        CacheGenerico<String> cacheNome = new CacheGenerico<>();
        CacheGenerico<Integer> cachePortfolio = new CacheGenerico<>();

        /* Atribuindo valores aos caches parametrizados com tipos diferentes */
        cacheNome.setValue("Impacta");
        cachePortfolio.setValue(80);

        /* Imprimindo os valores dos caches */
        System.out.println("Nome: " + cacheNome.getValue());
        System.out.println("Portifolio: " + cachePortfolio.getValue());
    }
}
