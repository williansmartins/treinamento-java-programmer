
public class Executando {

    public static void main(String[] args) {

        /* Instancia a operacao a ser realizada */
        OperacaoAritmetica operacao = new Soma();

        /* Executa a operacao sobre dois valores double e obtem o resultado */
        double result = operacao.execute(15.8, 8.3);

        /* Exibe o resultado */
        System.out.println(result);
    }
}
