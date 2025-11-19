
public abstract class Funcionario {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularPagamentoMensal();

    public double getSalarioBase() {
        return salarioBase;
    }
}
