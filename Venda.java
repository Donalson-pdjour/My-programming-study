
public class Venda {

    private int notaFiscal;
    private double valorVenda;

    public Venda(int notaFiscal, double valorVenda) {
        this.notaFiscal = notaFiscal;
        this.valorVenda = valorVenda;

    }

    public void setnotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public int getnotaFiscal() {
        return notaFiscal;
    }

    public void setvalorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getvalorVenda() {
        return valorVenda;
    }

    @Override
    public String toString() {
        return "notaFiscal = " + notaFiscal
                + ",valorVenda = " + valorVenda;
    }

}
