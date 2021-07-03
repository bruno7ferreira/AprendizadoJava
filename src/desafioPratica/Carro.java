package desafioPratica;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    private String nome;
    private int velocidade;

    public Carro(String nome, int vm) {
        this.VELOCIDADE_MAXIMA = vm;
        this.nome = nome;
    }

    public void acelerarCarro() {
        if (velocidade < VELOCIDADE_MAXIMA) {
            this.velocidade += 10;
            if (velocidade > VELOCIDADE_MAXIMA) {
                velocidade = VELOCIDADE_MAXIMA;
            }
        }

    }

    public void freiarCarro() {
        if (velocidade > 0) {
            this.velocidade -= 10;
            if (velocidade < 0) {
                this.velocidade = 0;
            } else {
                this.velocidade = velocidade;
            }

        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }


}
