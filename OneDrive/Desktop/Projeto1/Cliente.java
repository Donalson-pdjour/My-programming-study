public class Cliente {
    private String nome;
    private int idade;
    private String endereco;
    private String bairro;
    private String cpf;

    // Construtor
    public Cliente(String nome, int idade, String endereco, String bairro, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cpf = cpf;
    }

    // Getters (métodos para acessar os dados)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCpf() {
        return cpf;
    }

    // Sobrescrevendo o método toString para uma representação em String do objeto
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
