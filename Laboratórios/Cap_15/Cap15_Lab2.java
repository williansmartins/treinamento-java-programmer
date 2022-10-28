import java.util.ArrayList;

public class Cap15_Lab2 {

    public static void main(String[] args) {

        ArrayList<Estudante> estudanteList = new ArrayList<>();
        estudanteList.add(new Estudante("Joana", 8.5, 8.5));
        estudanteList.add(new Estudante("Antônio", 6.0, 9.0));
        estudanteList.add(new Estudante("Mariana", 7.5, 9.0));
        estudanteList.add(new Estudante("Ricargo", 7.0, 6.0));
        estudanteList.add(new Estudante("Gustavo", 9.5, 10.0));

        estudanteList.forEach(e -> e.setMedia((e.getNotaMatematica() + e.getNotaPortugues()) / 2));

        System.out.println("Média dos alunos:");
        System.out.println("-----------------");
        estudanteList.forEach(System.out::println);
    }
}
