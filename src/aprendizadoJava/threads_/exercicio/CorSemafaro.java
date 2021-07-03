package threads_.exercicio;

public enum CorSemafaro {

    VERDE(7000), AMARELO(2000), VERMELHO(9000);

    private int tempoEspera;

    CorSemafaro(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
