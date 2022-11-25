package exemplos.capitulo_13;

/**
Comentário Javadoc de uma classe
Aqui se encontra como a classe funciona
@author williansmartins
*/
public class Calculadora {
    
	/**
	 Método que soma os argumentos recebidos
	 @param varargs de double
	 @return Soma dos argumentos
	 
	*/
    public double somar(double ... valores){
        int resultado = 0;
		
		for (double valor : valores) {
			resultado += valor;			
		}
		
		return  resultado;
    }
    
    public double subtrair(double a, double b){        
		return a-b;
    }

	public double multiplicar(int i, int j) {
		return i*j;
	}
}
