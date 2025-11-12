
import javax.swing.JOptionPane;

public class Main {

    /**
     * Método auxiliar para exibir um diálogo de entrada e obter um valor do
     * usuário.
     *
     * @param mensagem A mensagem a ser exibida para o usuário.
     * @return O texto inserido pelo usuário.
     */
    private static String perguntar(String mensagem) {
        return JOptionPane.showInputDialog(
                null,
                mensagem,
                "Entrada de Dados",
                JOptionPane.QUESTION_MESSAGE);
    }

    public static void main(String[] args) {
        // Coleta de todas as informações do usuário
        String nome = perguntar("Digite o seu nome:");
        String sobrenome = perguntar("Digite o seu sobrenome:");
        String endereco = perguntar("Digite o seu endereço:");
        String bairro = perguntar("Digite o seu bairro:");
        String cidade = perguntar("Digite a sua cidade:");
        String estado = perguntar("Digite o seu estado (UF):");
        String cep = perguntar("Digite o seu CEP:");
        String idadeStr = perguntar("Digite a sua idade:");
        int idade = Integer.parseInt(idadeStr);
        String rg = perguntar("Digite o seu RG:");
        int rgInt = Integer.parseInt(rg);
        String cpf = perguntar("Digite o seu CPF:");
        int cpfInt = Integer.parseInt(cpf);
        String cnh = perguntar("Digite o número da sua CNH:");
        int cnhInt = Integer.parseInt(cnh);

        // Cria uma string com todas as informações formatadas
        String resumo = String.format(
                "--- DADOS CADASTRADOS ---\n"
                        + "Nome Completo: %s %s\n"
                        + "Endereço: %s\n"
                        + "Bairro: %s\n"
                        + "Cidade: %s\n"
                        + "Estado: %s\n"
                        + "CEP: %s\n"
                        + "Idade: %d\n"
                        + "RG: %d\n"
                        + "CPF: %d\n"
                        + "CNH: %d\n",
                nome, sobrenome, endereco, bairro, cidade, estado, cep, idade, rgInt, cpfInt, cnh);

        // Exibe o resumo em uma única caixa de diálogo
        JOptionPane.showMessageDialog(
                null,
                resumo,
                "Resumo do Cadastro",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
