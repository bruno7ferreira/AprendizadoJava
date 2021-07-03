package projetoCarro;

public class Gtr extends Carro implements Esportivo {

    protected boolean turboLigado = true;

    public Gtr(String nome) {
        super(nome);
    }


    @Override
    public void ligarTurbo() {
        if (!turboLigado) {
            setDeltaAcelerador(getDeltaAcelerador() + 15);
            turboLigado = true;
        } else {
            System.out.println("Turbo já está ligado!");
        }
    }

    @Override
    public void desligarTurbo() {
        if (turboLigado) {
            setDeltaAcelerador(getDeltaAcelerador() - 15);
            turboLigado = false;
        } else {
            System.out.println("Turno já está desligado!");
        }
    }


}
