package br.com.impacta.persistencia;

public class Filme {

	public static int contador;
	
	public Filme() {
		contador++;
	}

	public Filme(String titulo, String diretores, double nota, int duracao, int ano, String generos, int numVotos,
			String url) {
		super();
		this.titulo = titulo;
		this.diretores = diretores;
		this.nota = nota;
		this.duracao = duracao;
		this.ano = ano;
		this.generos = generos;
		this.numVotos = numVotos;
		this.url = url;
	}



	public String titulo;
	public String diretores;
	public double nota;
	public int duracao;
	public int ano;
	public String generos;
	public int numVotos;
	public String url;

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", diretores=" + diretores + ", nota=" + nota + ", duracao=" + duracao
				+ ", ano=" + ano + ", generos=" + generos + ", numVotos=" + numVotos + ", url=" + url + "]";
	}



}
