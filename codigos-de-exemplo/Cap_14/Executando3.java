
public class Executando3 {

    public static void main(String[] args) {

        ExemploFuncional3 funcao = d -> Math.sqrt(d);
        
        double result = funcao.execute(144);
        System.out.println("Resultado: " + result);
    }
}
