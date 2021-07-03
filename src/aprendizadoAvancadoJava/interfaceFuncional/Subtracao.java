package aprendizadoAvancadoJava.interfaceFuncional;

public class Subtracao implements Calculo {

    @Override
    public double executar(double a, double b) {
        return a - b;
    }
}
