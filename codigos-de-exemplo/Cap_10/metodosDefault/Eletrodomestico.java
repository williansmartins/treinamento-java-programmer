
public interface Eletrodomestico {

    void ligar();

    void desligar();

    default void acionarTimer(int minutos) {

        /* Aguarda a quantidade de minutos informada. */
        try { Thread.sleep(minutos * 60000); } catch (Exception e) {}

        /* Executa o método desligar conforme implementado na classe. */
        desligar();
    }
}
