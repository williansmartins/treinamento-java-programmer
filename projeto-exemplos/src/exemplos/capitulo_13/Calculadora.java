package exemplos.capitulo_13;

public class Calculadora {
    
    public double somar(double ... valores){
        int resultado = 0;
		
		for (double valor : valores) {
			resultado += valor;			
		}
		
		return  resultado;
    }
}
