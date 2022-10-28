
public class Executando1 {

    public static void main(String[] args) {

        ExemploFuncional1 funcao = (n, i, s) -> System.out.println(
            "Parabéns " + n.toUpperCase() +
            " pelos seus " + i +
            " anos de vida. Seu novo salário é: " + s);
        
        funcao.exibeDados("Manuel", 45, 5500.15);
    }
}
