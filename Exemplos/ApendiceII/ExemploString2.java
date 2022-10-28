
public class ExemploString2 {
	public static void main(String args[]){
		String nomeCompleto = "Claudio da Silva Souza";
		String nome = "", sobrenome = "";
		for(int i = 0; i < nomeCompleto.length(); i++){
			if(nomeCompleto.charAt(i) == ' '){
				nome = nomeCompleto.substring(0,i);
				sobrenome = nomeCompleto.substring(i);
				break;
			}
		}
		System.out.println(nome.trim());
		System.out.println(sobrenome.trim());
	}
}
