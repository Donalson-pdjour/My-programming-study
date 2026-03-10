import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Usar Locale.US para garantir que o ponto seja o separador decimal para
        // doubles
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locadora locadora = new Locadora();
        List<Veiculo> veiculosDisponiveis = new ArrayList<>();

        // Adicionando alguns veículos para teste
        veiculosDisponiveis.add(new Carros("Gol", "Volkswagen", 100.0, 2020, 50000, "ABC123CHASSI", "BRA2E19", "Branco",
                false, true, 4));
        veiculosDisponiveis.add(new Moto("CG 160", "Honda", 70.0, 2022, 15000, "DEF456CHASSI", "BRA3F20", "Vermelha",
                "Lateral", "Aberto"));

        int opcao;
        do {
            System.out.println("\n--------- Menu Principal ---------");
            System.out.println("1. Cadastrar novo veículo");
            System.out.println("2. Ver veículos disponíveis");
            System.out.println("3. Agendar locação de veículo");
            System.out.println("4. Gerar nota fiscal");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.println("\n--------- Cadastro de Novo Veículo ------");
                    System.out.print("Deseja cadastrar um (1) Carro ou uma (2) Moto? ");
                    int tipoVeiculo = sc.nextInt();
                    sc.nextLine(); // Consumir nova linha

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Preço da Diária: ");
                    double precoDiaria = sc.nextDouble();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    System.out.print("KM Rodados: ");
                    int kmRodados = sc.nextInt();
                    sc.nextLine(); // Consumir nova linha
                    System.out.print("Chassi: ");
                    String chassi = sc.nextLine();
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Cor: ");
                    String cor = sc.nextLine();

                    if (tipoVeiculo == 1) { // Carro
                        System.out.print("Possui caçamba (true/false): ");
                        boolean cacamba = sc.nextBoolean();
                        System.out.print("Possui rack (true/false): ");
                        boolean rack = sc.nextBoolean();
                        System.out.print("Número de portas: ");
                        int numeroPortas = sc.nextInt();
                        sc.nextLine();

                        Carros novoCarro = new Carros(modelo, marca, precoDiaria, ano, kmRodados, chassi, placa, cor,
                                cacamba, rack, numeroPortas);
                        veiculosDisponiveis.add(novoCarro);
                        System.out.println("Carro cadastrado com sucesso!");

                    } else if (tipoVeiculo == 2) { // Moto
                        System.out.print("Tipo de pezinho (Lateral/Central): ");
                        String pezinho = sc.nextLine();
                        System.out.print("Tipo de capacete (Aberto/Fechado): ");
                        String capacete = sc.nextLine();

                        Moto novaMoto = new Moto(modelo, marca, precoDiaria, ano, kmRodados, chassi, placa, cor,
                                pezinho, capacete);
                        veiculosDisponiveis.add(novaMoto);
                        System.out.println("Moto cadastrada com sucesso!");

                    } else {
                        System.out.println("Tipo de veículo inválido.");
                    }
                    break;
                case 2:
                    System.out.println("\n--- Veículos Disponíveis ---");
                    if (veiculosDisponiveis.isEmpty()) {
                        System.out.println("Nenhum veículo disponível no momento.");
                    } else {
                        for (int i = 0; i < veiculosDisponiveis.size(); i++) {
                            System.out.println((i + 1) + " - " + veiculosDisponiveis.get(i).getMarca() + " "
                                    + veiculosDisponiveis.get(i).getModelo());
                        }
                    }
                    break;
                case 3:
                    if (veiculosDisponiveis.isEmpty()) {
                        System.out.println("Nenhum veículo disponível para agendar.");
                        break;
                    }
                    System.out.println("\n--- Agendar Locação ---");
                    for (int i = 0; i < veiculosDisponiveis.size(); i++) {
                        System.out.println((i + 1) + " - " + veiculosDisponiveis.get(i).getMarca() + " "
                                + veiculosDisponiveis.get(i).getModelo());
                    }
                    System.out.print("Escolha o número do veículo para agendar: ");
                    int veiculoIndex = sc.nextInt() - 1;

                    if (veiculoIndex >= 0 && veiculoIndex < veiculosDisponiveis.size()) {
                        Veiculo veiculoEscolhido = veiculosDisponiveis.get(veiculoIndex);
                        System.out.print("Por quantos dias deseja alugar? ");
                        int dias = sc.nextInt();
                        locadora.agendar(veiculoEscolhido, new Date(), dias);
                        // Para simplificar, o veículo agendado é removido da lista de disponíveis
                        veiculosDisponiveis.remove(veiculoIndex);
                    } else {
                        System.out.println("Seleção de veículo inválida.");
                    }
                    break;
                case 4:
                    List<Agenda> agendamentos = locadora.getAgendas();
                    if (agendamentos.isEmpty()) {
                        System.out.println("Nenhum agendamento encontrado para gerar nota fiscal.");
                        break;
                    }

                    System.out.println("\n--- Selecione o Agendamento para Gerar a Nota ---");
                    for (int i = 0; i < agendamentos.size(); i++) {
                        Agenda ag = agendamentos.get(i);
                        System.out.println((i + 1) + " - Veículo: " + ag.getVeiculo().getMarca() + " "
                                + ag.getVeiculo().getModelo() + " | Dias: " + ag.getDias());
                    }
                    System.out.print("Escolha o número do agendamento: ");
                    int agendaIndex = sc.nextInt() - 1;

                    if (agendaIndex >= 0 && agendaIndex < agendamentos.size()) {
                        Agenda agendaEscolhida = agendamentos.get(agendaIndex);
                        System.out.print("Digite o número da nota: ");
                        int numeroNota = sc.nextInt();
                        sc.nextLine(); // Consumir nova linha

                        locadora.gerarNota(agendaEscolhida.getVeiculo(), agendaEscolhida.getDias(),
                                agendaEscolhida.getDataAgenda().toString(), numeroNota);
                        // Remove o agendamento da lista após gerar a nota para evitar duplicidade
                        agendamentos.remove(agendaIndex);

                    } else {
                        System.out.println("Seleção de agendamento inválida.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
