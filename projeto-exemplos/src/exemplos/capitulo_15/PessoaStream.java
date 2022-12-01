package exemplos.capitulo_15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PessoaStream {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Washington", 35, "masculino");
		Pessoa p2 = new Pessoa("Willians", 40, "masculino");
		Pessoa p3 = new Pessoa("Ulisses", 50, "masculino");
		Pessoa p4 = new Pessoa("Rosália", 65, "feminino");
		Pessoa p5 = new Pessoa("Luis", 70, "masculino");
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		
		System.out.println("-------------- Filtrando somente os nomes");		
		pessoas.stream()
				.forEach( p -> System.out.println(p.nome) );
		
		System.out.println("-------------- Limitando");		
		pessoas.stream()
				.limit(3)
				.forEach( p -> System.out.println(p.nome) );
		
		System.out.println("-------------- Ordenando");		
		pessoas.stream()
				.sorted( (item1, item2) -> item1.nome.compareTo(item2.nome) )
				.forEach( p -> System.out.println(p.nome) );
		
		System.out.println("-------------- Filtrando");		
		pessoas.stream()
				.filter( p -> p.nome.equals("Willians") )
				.forEach( p -> System.out.println(p) );
		
		System.out.println("-------------- Múltiplos filtros");		
		pessoas.stream()
				.filter( p -> p.idade > 40 )
				.filter( p -> p.idade < 70 )
				.forEach( p -> System.out.println(p) );
		
		System.out.println("-------------- Gerando uma nova lista");		
		List<String> nomes = pessoas.stream()
									.map( Pessoa::getNome )
									.toList();		
		nomes.stream().forEach( System.out::println );
		
		System.out.println("-------------- Contando itens");		
		System.out.println( pessoas.stream()
							.filter( p -> p.idade > 40 )
							.filter( p -> p.idade < 70 )
							.count()
							);
		
		System.out.println("-------------- Menor valor");		
		System.out.println( pessoas.stream()
							.min( Comparator.comparing(Pessoa::getIdade))
							);
		
		System.out.println("-------------- Maior valor");		
		System.out.println( pessoas.stream()
							.max( Comparator.comparing(Pessoa::getIdade))
							);
		
	}
}
