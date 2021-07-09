package aprendizadoJava.projetoTeste.carro;

public class Carro {

    private int velocidadeAtual = 0;
    final int VELOCIDADE_MAXIMA;
    private int delta = 5;

    public Carro(int VELOCIDADE_MAXIMA) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }


    void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        velocidadeAtual += getDelta();
    }

    void frear() {
        if (velocidadeAtual >= delta) {
            velocidadeAtual -= delta;
        } else {
            System.out.println("O CarroExemplo está parado!");
            velocidadeAtual = 0;
        }
    }

    @Override
    public String toString() {
        return "CarroExemplo{" +
                "velocidadeAtual = " + velocidadeAtual +
                " Km/h}";
    }


    //Get and Set
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
