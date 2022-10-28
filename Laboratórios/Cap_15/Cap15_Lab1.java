import java.util.HashMap;

public class Cap15_Lab1 {

    public static void main(String[] args) {

        HashMap<String, Integer> pessoaMap = new HashMap<>();
        pessoaMap.put("Roberto", 35);
        pessoaMap.put("Carla", 26);
        pessoaMap.put("Gabriel", 18);
        pessoaMap.put("Bruno", 17);

        System.out.println(" -- Pessoas --");
        
        System.out.println("Roberto" + ": " + pessoaMap.get("Roberto"));
        System.out.println("Carla" + ": " + pessoaMap.get("Carla"));
        System.out.println("Gabriel" + ": " + pessoaMap.get("Gabriel"));
        System.out.println("Bruno" + ": " + pessoaMap.get("Bruno"));
    }
}
