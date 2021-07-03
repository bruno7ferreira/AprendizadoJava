package projetoCarro;

public class Lexus extends Carro implements Luxo {

    boolean arCondicionado;

    public Lexus(String nome) {
        super(nome);
    }

    //boolean arCondicionado;

    @Override
    public void ligarArCondicionado() {
        if (!arCondicionado) {
            setDeltaAcelerador(getDeltaAcelerador() - 5);
            arCondicionado = true;
        } else {
            System.out.println("Ar-Condicionado já está ligado");
        }
    }

    @Override
    public void desligarArConcionado() {
        if (arCondicionado) {
            setDeltaAcelerador(getDeltaAcelerador() + 5);
        } else {
            System.out.println("Ar-Condicionado já está ligado!");
        }


    }
}
