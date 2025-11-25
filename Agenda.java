import java.util.Date;

public class Agenda {
    private Date dataAgenda;
    private int dias;
    private Veiculo veiculo;

    public Agenda(Date dataAgenda, int dias, Veiculo veiculo) {
        this.dataAgenda = dataAgenda;
        this.dias = dias;
        this.veiculo = veiculo;
    }

    public void setDataAgenda(Date dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    public Date getDataAgenda() {
        return dataAgenda;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    @Override
    public String toString() {
        return "Agenda{" + "dataAgenda=" + dataAgenda + ", dias=" + dias + ", veiculo=" + veiculo + '}';
    }

}
