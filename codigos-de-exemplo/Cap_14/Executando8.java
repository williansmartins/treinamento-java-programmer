
public class Executando8 {

    public static void main(String[] args) {

        OperacaoAritmetica funcao = FinancialUtils::calculaJuros;
        
        System.out.println("Valor final: " + funcao.execute(1200.0,  8.3));
    }
}
