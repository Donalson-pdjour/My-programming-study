public class Veiculo {
    private String modelo;
    private String marca;
    private double precoDiaria;
    private int ano;
    private int kmRodados;
    private String chassi;
    private String placa;
    private String cor;

    public Veiculo(String modelo, String marca, double precoDiaria, int ano, int kmRodados, String chassi, String placa,
            String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.precoDiaria = precoDiaria;
        this.ano = ano;
        this.kmRodados = kmRodados;
        this.chassi = chassi;
        this.placa = placa;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo +
                ", marca=" + marca +
                ", precoDiaria=" + precoDiaria +
                ", ano=" + ano +
                ", kmRodados=" + kmRodados +
                ", chassi=" + chassi +
                ", placa=" + placa +
                ", cor=" + cor + "]";
    }

    public double calcularTotal(int dias) {
        return precoDiaria * dias;
    }

}
