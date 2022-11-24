
public class ArrayUnidimensionais {
	public static void main(String args[]){
		int codigos[];
		int dados[] = new int[3];
		char artigos[] = new char[4];
		codigos = dados; // OK, dados se refere a um array int
		codigos = artigos; // NÃO ESTÁ CORRETO, artigos se refere a um array char
	}
}
