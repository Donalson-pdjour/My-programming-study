
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro ca = new Cadastro();
        int opcao;

        do {
            System.out.println("\n------------ Menu Principal ------------");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Cadastrar Venda");
            System.out.println("4. Listar Pessoas");
            System.out.println("5. Listar Produtos");
            System.out.println("6. Listar Vendas");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.err.println(" Digite o nome da Pessoa: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o número do cpf: ");
                    String cpf = sc.nextLine();
                    System.out.println("Digite a idade: ");
                    int idade = sc.nextInt();
                    Pessoa p = new Pessoa(nome, cpf, idade);
                    ca.adicionarPessoa(p);
                    break;
                case 2:
                    System.out.println("Nome do Produto: ");
                    String nomeProduto = sc.nextLine();
                    System.out.println("Digite o preço: ");
                    double preco = sc.nextDouble();
                    System.out.println("Digite a quantidade: ");
                    int quantidade = sc.nextInt();
                    Produto pr = new Produto(nomeProduto, preco, quantidade);
                    ca.adicionarProduto(pr);
                    break;
                case 3:
                    System.out.println("Digite o número da nota fiscal: ");
                    int numeroNotaFiscal = sc.nextInt();
                    System.out.println("Digite o valor da venda: ");
                    double valorVenda = sc.nextDouble();
                    Venda ve = new Venda(numeroNotaFiscal, valorVenda);
                    ca.adicionarVenda(ve);
                case 4:
                    ca.listarPessoas();
                    break;
                case 5:
                    ca.listarProdutos1();
                    break;
                case 6:
                    ca.listarVendas();
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida !");
            }
        } while (opcao != 0);
        sc.close();
    }

}
