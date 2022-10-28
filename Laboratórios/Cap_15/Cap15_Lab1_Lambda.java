import java.util.HashMap;

public class Cap15_Lab1_Lambda {

    public static void main(String[] args) {
        
        HashMap<String, Integer> pessoaMap = new HashMap<>();
        pessoaMap.put("Roberto", 35);
        pessoaMap.put("Carla", 26);
        pessoaMap.put("Gabriel", 18);
        pessoaMap.put("Bruno", 17);

        System.out.println(" -- Pessoas --");
        
        pessoaMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
