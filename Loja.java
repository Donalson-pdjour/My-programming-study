import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ids = {1, 2, 3, 4, 5};
        String[] produtos = {"Camiseta", "Calça", "Tênis", "Boné", "Meia"};
        double[] precos = {29.90, 59.90, 129.90, 49.90, 9.90};

        System.out.println("Produtos disponíveis:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(ids[i] + " - " + produtos[i] + " - R$" + precos[i]);
        }

        System.out.print("Quantos produtos você deseja comprar? ");
        int quantidadeDesejada = 0;

        // Ler quantidade com validação
        while (true) {
            try {
                quantidadeDesejada = Integer.parseInt(scanner.next());
                if (quantidadeDesejada <= 0) {
                    System.out.print("Digite um número maior que zero: ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida! Digite um número: ");
            }
        }

        double total = 0;
        int produtosEscolhidos = 0;

        for (int i = 1; i <= quantidadeDesejada; i++) {
            System.out.print("Escolha o ID do produto " + i + ": ");
            int escolhaId = 0;

            // Ler ID com validação
            while (true) {
                try {
                    escolhaId = Integer.parseInt(scanner.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Entrada inválida! Digite um número válido de ID: ");
                }
            }

            // Procurar ID
            boolean encontrado = false;
            for (int j = 0; j < ids.length; j++) {
                if (ids[j] == escolhaId) {
                    total += precos[j];
                    produtosEscolhidos++;
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("ID inválido, tente novamente.");
                i--; // repete a escolha
            }
        }

        // --- Lógica do Frete Corrigida ---
        double frete = 10.0;
        double totalAPagar = total;

        if (total >= 100.00) {
            System.out.println("Parabéns! Você ganhou frete grátis!");
        } else {
            System.out.println("Frete: R$" + frete);
            totalAPagar += frete;
        }

        // Exibe o subtotal dos produtos e o total final
        System.out.printf("Subtotal dos produtos: R$%.2f\n", total);
        System.out.printf("Total a pagar: R$%.2f\n", totalAPagar);

        System.out.print("Confirmar pagamento? (s/n): ");
        String resposta = scanner.next();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("Compra realizada com sucesso!");
        }
    }
}
