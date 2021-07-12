package aprendizadoJava._enum;

public enum DiaDaSemanaEnum {

    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    private DiaDaSemanaEnum(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
