
public class Moto extends Veiculo {

    protected String pezinho;
    protected String capacete;

    public Moto(String modelo, String marca, double precoDiaria, int ano, int kmRodados, String chassi, String placa,
            String cor,
            String pezinho, String capacete) {
        super(modelo, marca, precoDiaria, ano, kmRodados, chassi, placa, cor);
        this.pezinho = pezinho;
        this.capacete = capacete;

    }

    public void setPezinho(String pezinho) {
        this.pezinho = pezinho;
    }

    public String getPezinho() {
        return pezinho;
    }

    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }

    public String getCapacete() {
        return capacete;
    }

    @Override
    public String toString() {
        return "Moto [Pezinho:  " + pezinho
                + ", Capacete:  " + capacete
                + ", Modelo:  " + getModelo()
                + ", Marca:  " + getMarca()
                + ", Preço Diaria:  " + getPrecoDiaria()
                + ", Ano:  " + getAno()
                + ", Km Rodados:  " + getKmRodados()
                + ", Chassi:  " + getChassi()
                + ", Placa:  " + getPlaca()
                + ", Cor:  " + getCor() + "]";

    }

}
