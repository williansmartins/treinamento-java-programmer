package exemplos.capitulo_12;

public class CalcularProgramacaoFuncional {

	public static void main(String[] args) {
		double resultado;
		
		InterfaceCalcular multiplicar = (a , b) -> a * b;
		resultado = multiplicar.executar(3, 33);
		System.out.println(resultado);
		
		InterfaceCalcular somar = (a , b) -> a + b;
		resultado = somar.executar(3, 33);
		System.out.println(resultado);
		
		InterfaceCalcular complexa = (a , b) -> {
			if(a > b) {
				return 1;
			}else {
				return 2;
			}
		};
		resultado = complexa.executar(3, 33);
		System.out.println(resultado);
	}
}
