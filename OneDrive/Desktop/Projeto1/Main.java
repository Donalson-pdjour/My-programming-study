import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // É uma boa prática programar para a interface (List)
        List<Cliente> clientes = new ArrayList<>();

        // Usando o novo construtor e CPFs como String
        Cliente cliente1 = new Cliente("Maria Rocha", 44, "Rua General Camara 302", "Centro", "123.456.789-10");
        Cliente cliente2 = new Cliente("João Almeida", 28, "Avenida Brasil 500", "Jardins", "111.222.333-44");

        clientes.add(cliente1);
        clientes.add(cliente2);

        System.out.println("Lista de clientes: " + clientes);

        // Corrigido: Acessando um índice válido (0 para o primeiro cliente)
        System.out.println("\nDados do primeiro cliente (índice 0): " + clientes.get(0));

        // Removendo o segundo cliente (no índice 1) de forma mais clara
        System.out.println("\nCliente removido: " + clientes.remove(1));

        System.out.println("\nLista final de clientes: " + clientes);
    }
}
