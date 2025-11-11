
public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getcpf() {
        return cpf;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public int getidade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nCPF: " + cpf
                + "\nIdade: " + idade;

    }
}
