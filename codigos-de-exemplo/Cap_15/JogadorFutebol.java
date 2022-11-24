public class JogadorFutebol {

    private String nome;
    private String posicao;

    public JogadorFutebol(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public JogadorFutebol() {
        // do nothing
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String toString() {
        return nome + " - " + posicao;
    }
}
