package aprendizadoJava.teste.exercicio;

public class Lampada {

    //Atributos
    private int voltagem;
    private String tipo;
    private double valor;
    private boolean ligado;

    //Métodos
    public boolean ligarLampada() {
        return ligado = true;
    }

    public boolean desligarLampada() {
        return ligado = false;
    }

    public void mostrarEstado() {
        if (ligado) {
            System.out.println("Está ligado");
        } else {
            System.out.println("Está desligado!");
        }
    }

    public boolean mudarEstado() {
        if (ligado) {
            System.out.println("Lâmpada ligada");
        } else {
            System.out.println("Lâmpada desligada");
        }
        return ligado;
    }


    //Método toString
    @Override
    public String toString() {
        return "Lampada{" +
                "voltagem=" + voltagem +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                '}';
    }

    //Método construtor
    public Lampada(int voltagem, String tipo, double valor) {
        this.voltagem = voltagem;
        this.tipo = tipo;
        this.valor = valor;
    }

    //Métodos Get and Set
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
