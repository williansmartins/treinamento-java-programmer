import java.time.LocalDateTime;

public class ExemploLocalDateTimeGet {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        int ano = agora.getYear();
        int hora = agora.getHour();
        int minuto = agora.getMinute();

        System.out.printf(
            "Estamos no ano de %d. São %d horas e %d minutos",
            ano, hora, minuto);
    }
}

