import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Locadora {
    private List<Agenda> agendas = new ArrayList<>();
    private String cnpj = "XX.XXX.XXX/0001-XX"; // CNPJ Fixo para a locadora

    public void agendar(Veiculo v, Date data, int dias) {
        Agenda agendamento = new Agenda(data, dias, v);
        this.agendas.add(agendamento);
        System.out.println("Veículo agendado com sucesso para " + dias + " dias!");
    }

    public List<Agenda> getAgendas() {
        return this.agendas;
    }

    public void gerarNota(Veiculo v, int dias, String dataLocador, int numeroDaNota) {
        double valorTotal = v.calcularTotal(dias);
        NotaFiscal n = new NotaFiscal(valorTotal, dataLocador, numeroDaNota, this.cnpj);
        System.out.println("\n--- Nota Fiscal Gerada ---");
        System.out.println(n);
        System.out.println("Veículo: " + v.getMarca() + " " + v.getModelo());
        System.out.println("--------------------------");
    }
}