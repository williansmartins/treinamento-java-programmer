
public interface Eletrodomestico {

    void ligar();
    void desligar();

    static void ligarTudo(Eletrodomestico... eletroArray) {
        for (Eletrodomestico eletro : eletroArray) {
            eletro.ligar();
        }
    }
}
