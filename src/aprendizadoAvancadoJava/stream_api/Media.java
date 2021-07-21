package aprendizadoAvancadoJava.stream_api;

public class Media {

    private double total;
    private int quantidade;

    public Media adicionar(double valor) {
        total += valor;
        quantidade++;
    }

    public double getValue() {
        return total / quantidade;
    }

}
