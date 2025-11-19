
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ERRO: nome da classe escrita errado
        Motorista mot = new Motorista("João", 2500.0, 12);
        Gerente gerente = new Gerente("Maria", 5000.0, 1500.0);

        // A chamada ao construtor de Gerente foi corrigida para incluir um bônus.
        Funcionario ger = new Gerente("Maria", 5000.0, 1500.0);
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(mot);
        funcionarios.add(gerente);

        // ERRO: método inexistente
        mot.imprimirDados();

        System.out.println("Pagamento gerente: " + ger.calcularPagamentoMensal());
        System.out.println("Pagamento motorista: " + mot.calcularPagamentoMensal());
        System.out.println("Pagamento gerente: " + ger.calcularPagamentoMensal());

        for (Funcionario funcionario : funcionarios) {
            ((Motorista) funcionarios).imprimirDados();
            System.out.println("--------------------");
        }
    }
}
