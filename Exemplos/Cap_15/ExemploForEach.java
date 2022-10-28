import java.util.TreeSet;

public class ExemploForEach {

    public static void main(String[] args) {
        
        TreeSet<String> cursos = new TreeSet<>();
        
        cursos.add("PHP");
        cursos.add("Linux");
        cursos.add("Asp");
        cursos.add("Java");
        cursos.add("Delphi");
        
        System.out.println("Cursos em ordem alfabética: \n");
        
        cursos.forEach(c -> System.out.println("Curso: " + c));
    }
}
