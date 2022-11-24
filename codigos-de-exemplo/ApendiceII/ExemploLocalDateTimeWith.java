import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTimeWith {

    public static void main(String[] args) {

        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("EEEE");
        LocalDateTime hoje = LocalDateTime.now();
        LocalDateTime natal = hoje.withMonth(12).withDayOfMonth(25);

        System.out.println("Este ano o natal será na " + natal.format(mascara));
    }
}

