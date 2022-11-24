
public class Produto {

    private String descricao;
    private int tamanho;

    public Produto(String descricao, int tamanho) {
        this.descricao = descricao;
        this.tamanho = tamanho;
    }

    public double aumentarPreco(double precoAtual, double taxaAumento) {
        double aumento = precoAtual * taxaAumento / 100;
        double precoAumentado = precoAtual + aumento;
        return precoAumentado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
