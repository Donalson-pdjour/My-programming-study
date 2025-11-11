
import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private List<Pessoa> pessoas;
    private List<Produto> produtos;
    private List<Venda> vendas;

    public Cadastro() {
        pessoas = new ArrayList<>();
        produtos = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarPessoas() {
        System.out.println("\n ----Pessoas Cadastradas---");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }

    public void listarProdutos1() {
        System.out.println("\n ----Produtos Cadastrados---");
        for (Produto pr : produtos) {
            System.out.println(pr);
        }
    }

    public void listarVendas() {
        System.out.println("\n ----Vendas Cadastradas---");
        for (Venda ve : vendas) {
            System.out.println(ve);
        }
    }

}
