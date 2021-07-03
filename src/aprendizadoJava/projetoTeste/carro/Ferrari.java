package projetoTeste.carro;

public class Ferrari extends Carro implements Esportivo {


    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari() {
        super(330);
        setDelta(15);
    }

   /* @Override
    void acelerar() {
        setVelocidadeAtual(getVelocidadeAtual() + delta);
    }
    */


    void frear() {
        if (getVelocidadeAtual() >= 0) {
            setVelocidadeAtual(getVelocidadeAtual() - getDelta());
        }
    }


    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
        setDelta(35);
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
        setDelta(15);
    }

    @Override
    public void ligarArcondicionado() {
        ligarAr = true;
        setDelta(getDelta() - 5);
    }

    @Override
    public void desligarArcondicionado() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        }else if (ligarTurbo && ligarAr){
            return 30;
        }else if (!ligarTurbo&& !ligarAr){
            return 20;
        }
        return 15;
    }
}
