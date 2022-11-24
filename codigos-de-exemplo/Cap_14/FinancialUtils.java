
public class FinancialUtils {

    public static double calculaJurosCompostos(double valorInicial, double taxaJuros, int prazo) {
        double fator = 1 + taxaJuros / 100;
        double fatorComposto = Math.pow(fator, prazo);
        return valorInicial * fatorComposto;
    }

    public static double calculaJuros(double valorInicial, double taxaJuros) {
        double razao = taxaJuros / 100;
        double juros = valorInicial * razao;
        return valorInicial + juros;
    }

    public static double calculaAmortizacao(double valorTotal, double valorPrestacao, int prazo) {
        return 0; // TODO IMPLEMENT ME
    }
    
    public static int calculaPrazo(double valorTotal, double valorPrestacao, double taxaJuros) {
        return 0; // TODO IMPLEMENT ME
    }
}
