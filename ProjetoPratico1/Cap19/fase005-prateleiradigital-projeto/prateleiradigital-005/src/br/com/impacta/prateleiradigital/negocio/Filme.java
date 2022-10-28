package br.com.impacta.prateleiradigital.negocio;

/**
 * Classe que representa o conceito de Filme no domínio do negócio da aplicação desenvolvida
 *
 */
public class Filme implements Comparable<Filme> {

		public static final double NOTA_MINIMA = 0;
		public static final double NOTA_MAXIMA = 10;
		
		private String titulo;
		private String diretores;
		private double nota;
		private int duracao;
		private int ano;
		private String generos;
		private int numVotos;
		private String url;
		
	
		public Filme(){}
		
		/**
		 * Construtor que que recebe os dados dos atributos da classe Filme 
		 * 
		 * @param titulo Titulo do filme 
		 * @param diretores Texto contendo os diretores do filme separados por virgula
		 * @param nota Nota média atribuída ao filme. Nota deve estar compreendida entre 0 e 10 inclusive 
		 * @param duracao Duração (em minutos) do filme. A duração deve ser maior ou igual a zero
		 * @param ano Ano de lançamento do filme. O ano deve ser maior ou igual a zero
		 * @param generos  Texto contendo os gêneros nos quais o filme se enquadra separados por virgulas
		 * @param numVotos Numero de votos recebidos pelo filme. O valor deve ser maior ou igual a zero
		 * @param url URL do site que contém mais detalhes a respeito do filme 
		 * 
		 * @throws IllegalArgumentException caso algum atributo informado esteja infringindo as regras para eles determinadas
		 */
		public Filme(String titulo, String diretores, double nota, int duracao, int ano, String generos, int numVotos, String url) throws IllegalArgumentException {
			this.setTitulo(titulo);
			this.setDiretores(diretores);
			this.setNota(nota);
			this.setDuracao(duracao);
			this.setAno(ano);
			this.setGeneros(generos);
			this.setNumVotos(numVotos);
			this.setUrl(url);
		}
		
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getDiretores() {
			return diretores;
		}
		
		public void setDiretores(String diretores) {
			this.diretores = diretores;
		}
		
		public double getNota() {
			return nota;
		}
		
		public void setNota(double nota) {
			if(nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA){
				this.nota = nota;
			}else {
				String msg = String.format("Nota informada [%.2f] está fora do intervalo permitido!", nota);
				throw new  IllegalArgumentException(msg);
			}
		}
		
		public int getDuracao() {
			return duracao;
		}
		
		public void setDuracao(int duracao) {
			if(duracao > 0){
				this.duracao = duracao;
			}else {
				String msg = String.format("Duração em minutos informada [%d] não é válido!", duracao);
				throw new  IllegalArgumentException(msg);
			}
		}
		
		public int getAno() {
			return ano;
		}
		
		public void setAno(int ano) {
			if(ano > 0){
				this.ano = ano;
			}else {
				String msg = String.format("Ano informado [%d] é inválido!", ano);
				throw new  IllegalArgumentException(msg);

			}
		}
		
		public String getGeneros() {
			return generos;
		}
		
		public void setGeneros(String generos) {
			this.generos = generos;
		}
		
		public int getNumVotos() {
			return numVotos;
		}
		
		public void setNumVotos(int numVotos) {
			if(numVotos > 0){
				this.numVotos = numVotos;
			}else {
				String msg = String.format("Número de votos informado [%d] é inválido!", numVotos);
				throw new  IllegalArgumentException(msg);
			}
		}
		
		public String getUrl() {
			return url;
		}
		
		public void setUrl(String url) {
			this.url = url;
		}
		
		@Override
		public String toString(){
			
			return 
			   String.format("%-60s", this.getTitulo()).concat
			   (String.format("%-40s",this.getDiretores())).concat
			   (String.format("%-8.2f", this.getNota())).concat
			   (String.format("%-8d", this.getDuracao())).concat
			   (String.format("%-8d", this.getAno())).concat		
			   (String.format("%-40s",this.getGeneros())).concat
			   (String.format("%-8d", this.getNumVotos())).concat
			   (String.format("%-30s", this.getUrl()));
			
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ano;
			result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Filme other = (Filme) obj;
			if (ano != other.ano)
				return false;
			if (titulo == null) {
				if (other.titulo != null)
					return false;
			} else if (!titulo.equals(other.titulo))
				return false;
			return true;
		}

		@Override
		public int compareTo(Filme filme) {
			return this.getTitulo().compareTo(filme.getTitulo());
		}
		
}
