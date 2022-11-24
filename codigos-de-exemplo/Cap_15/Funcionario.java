public class Funcionario implements Comparable<Funcionario> {

    private int matricula;
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(int matricula, String nome, String cargo, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario() {
        // do nothing
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return String.format("%4d %-20s %-15s %,10.2f", matricula, nome, cargo, salario);
    }

    /**
     * Utiliza a matricula como ordenacao natural.
     */
    public int compareTo(Funcionario func) {
        return this.matricula - func.matricula;
    }
}
