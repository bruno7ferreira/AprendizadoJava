package teste.exercicio46;

public class Circulo extends Figura2D {

    //Atrbuto
    private double raio;

    //Métodos
    @Override
    public double calcularArea() {
        return (Math.pow(raio, raio)) * Math.PI;
    }


    //get and set
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


}
