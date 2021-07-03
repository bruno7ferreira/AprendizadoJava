package projetoCarro;

public class Bravo extends Carro {


    public Bravo(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Bravo{" +
                "nome='" + getNome() + '\'' +
                ", potencia=" + potencia +
                ", cilindradaMotor=" + cilindradaMotor +
                ", ligado=" + ligado +
                ", velocidade=" + velocidade +
                ", deltaAcelerador=" + deltaAcelerador +
                ", deltaFreiar=" + deltaFreiar +
                "} " + super.toString();
    }
}
