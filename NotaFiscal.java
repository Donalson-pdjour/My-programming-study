public class NotaFiscal {
    private double valorTotal;
    private String dataLocador;
    private int numeroNota;
    private String cnpj;

    public NotaFiscal(double valorTotal, String dataLocador, int numeroNota, String cnpj) {
        this.valorTotal = valorTotal;
        this.dataLocador = dataLocador;
        this.numeroNota = numeroNota;
        this.cnpj = cnpj;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getDataLocador() {
        return dataLocador;
    }
    public void setDataLocador(String dataLocador) {
        this.dataLocador = dataLocador;
    }
    public int getNumeroNota() {
        return numeroNota;
    }
    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public String toString() {
        return "NotaFiscal{" + "valorTotal=" + valorTotal +
                ",Data Locador=" + dataLocador +
                ", numeroNota=" + numeroNota + ", cnpj=" + cnpj + '}';
    }
}
