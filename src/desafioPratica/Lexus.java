package desafioPratica;

public class Lexus extends Carro {


    public Lexus(String nome) {
        super(nome, 300);
    }

    @Override
    public void acelerarCarro() {
        setVelocidade(getVelocidade() + 30);
    }

    @Override
    public void freiarCarro() {
        if (getVelocidade() > 0) {
            setVelocidade(getVelocidade() - 30);
            if (getVelocidade() < 0) {
                setVelocidade(0);
            } else {
                setVelocidade(getVelocidade());
            }
        }
    }

    @Override
    public String toString() {
        return "Lexus{} " + super.toString();
    }
}
