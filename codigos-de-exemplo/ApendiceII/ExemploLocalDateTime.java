import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {

    public static void main(String[] args) {

        DateTimeFormatter mascara1 = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime casa = LocalDateTime.of(2004, 7, 24, 21, 18, 30, 500);
        LocalDateTime nasc = LocalDateTime.parse("24/06/1974 03:15:30", mascara1);

        DateTimeFormatter mascara2 =
                DateTimeFormatter.ofPattern("eeee, d 'de' MMMM 'de' yyyy");

        System.out.println(agora.format(mascara2));
        System.out.println(casa.format(mascara2));
        System.out.println(nasc.format(mascara2));
    }
}

