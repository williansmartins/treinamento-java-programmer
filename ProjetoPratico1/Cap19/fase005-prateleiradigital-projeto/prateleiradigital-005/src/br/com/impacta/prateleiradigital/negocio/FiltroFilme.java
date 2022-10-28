package br.com.impacta.prateleiradigital.negocio;

/**
 * Classe utilitária de negócio que representa um filtro relacionado a busca de filmes no repositório de dados
 */
public class FiltroFilme {
	
	private String tituloParcial;
	private String genero;
	private int anoInicial;
	private int anoFinal;
	
	/**
	 * 
	 * @param tituloParcial Texto representando parte do titulo de filme ou nulo (todos os titulos)
	 * @param genero Genero do filme ou nulo (todos os generos)
	 * @param anoInicial Ano limite inferior de lançamento do filme. Deve ser maior que zero ou quando 0 representa sem limite inferior
	 * @param anoFinal Ano limite superior de lançamento do filme. Se igual a 0 considerar sem limite superior e se for maior que zero, deve ser maior que o ano inicial
	 * 
	 */
	public FiltroFilme(String tituloParcial, String genero, int anoInicial, int anoFinal) {
		this.setTituloParcial(tituloParcial);
		this.setGenero(genero);
		this.setAnoInicial(anoInicial);
		this.setAnoFinal(anoFinal);
	}

	public String getTituloParcial() {
		return tituloParcial;
	}

	public void setTituloParcial(String tituloParcial) {
		this.tituloParcial = tituloParcial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoInicial() {
		return anoInicial;
	}

	/**
	 * Deve ser maior que zero ou quando 0 representa sem limite inferior
	 * @param anoInicial Ano informado como limite inferior
	 */
	public void setAnoInicial(int anoInicial) {
		if(anoInicial >= 0){
			this.anoInicial = anoInicial;
		}
	}

	public int getAnoFinal() {
		return anoFinal;
	}

	/**
	 * Ano limite superior de lançamento do filme. Se igual a 0 considerar sem limite superior e se for maior que zero, deve ser maior que o ano inicial
	 * @param anoFinal Ano informado como limite superior
	 */
	public void setAnoFinal(int anoFinal) {
		if(anoFinal != 0 && anoFinal > anoInicial){
			this.anoFinal = anoFinal;
		}
	}
	
}
