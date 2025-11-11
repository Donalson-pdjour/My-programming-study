
public class Produto {

    private String nomeProduto;
    private double preco;
    private int quantidade;

    public Produto(String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setnomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getnomeProduto() {
        return nomeProduto;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public double getpreco() {
        return preco;
    }

    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getquantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "NomeProduto =" + nomeProduto
                + ", Preco =" + String.format("%.2f", +preco)
                + ", Quantidade =" + quantidade;
    }

}
