
public class StringUtils {

    public static String inverterString(String valor) {

        char[] letras = valor.toCharArray();
        char[] letrasInversas = new char[letras.length];

        for (int i = 0; i < letras.length; i++) {
            letrasInversas[letras.length - i - 1] = letras[i];
        }

        return new String(letrasInversas);
    }

    public static void main(String[] args) {
        
        String inverso = StringUtils.inverterString("roma");
        
        System.out.println(inverterString(inverso));
        
        
    }
}