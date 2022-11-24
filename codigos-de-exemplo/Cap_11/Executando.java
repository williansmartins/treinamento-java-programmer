
public class Executando {

    public static void main(String[] args) {

        try {

            Conta c = new ContaPoupanca();
            ContaCorrente cc = (ContaCorrente) c;
            cc.debitarTarifa(35.5);

        } catch (ClassCastException e) {
            System.out.println("Conta de tipo incompatível.");
            e.printStackTrace();
        }
    }
}
