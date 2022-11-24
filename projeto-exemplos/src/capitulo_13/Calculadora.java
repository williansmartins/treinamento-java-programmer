public class Calculadora {
    
    public double somar(double ... valores){
        int resultado = 0;
		
		for (int valor : valores) {
			resultado += valor;			
		}
		
		return  resultado;
    }
}
