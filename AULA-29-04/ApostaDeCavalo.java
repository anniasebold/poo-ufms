public class ApostaDeCavalo extends Aposta {
    private int numeroDoCavalo;

    public ApostaDeCavalo(double valor, int numeroDoCavalo, double ganho) {
        setValor(valor);
        setNumeroDoCavalo(numeroDoCavalo);
        setGanho(ganho);
    }

    public void setValor(double valor) {
        if(valor > 0)
            this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
}
