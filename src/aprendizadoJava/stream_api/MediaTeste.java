package stream_api;

public class MediaTeste {

    private double total;
    private int quantidade;

    public MediaTeste adicionar(double valor) {
        total += valor;
        quantidade++;
        return this;
    }

    public double getValor() {
        return total / quantidade;
    }

    public static MediaTeste combinar(MediaTeste m1, MediaTeste m2) {
        MediaTeste resultante = new MediaTeste();
        resultante.total = m1.total + m2.total;
        resultante.quantidade = m1.quantidade + m2.quantidade;
        return resultante;
    }


}
