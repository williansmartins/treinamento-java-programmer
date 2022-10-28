
public class Executando6 {

    public static void main(String[] args) {

        ExemploFuncional4 funcao = val -> {
            double temp = val * 4;
            return temp;
        };
        
        System.out.println(funcao.quadruplo(8));
    }
}
