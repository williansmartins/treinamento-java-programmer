
public class Executando4 {

    public static void main(String[] args) {

        ExemploFuncional1 funcao = (n, i, s) -> {
            String nomeMaiusculo = n.toUpperCase();
            if (i < 18) {
                System.out.println("Funcionario não pode ser menor de idade!");
            } else {
                System.out.println("Funcionario " + nomeMaiusculo
                    + " recebe salário " + s);
            }
        };
        
        funcao.exibeDados("Manuel", 45, 5500.15);
    }
}
