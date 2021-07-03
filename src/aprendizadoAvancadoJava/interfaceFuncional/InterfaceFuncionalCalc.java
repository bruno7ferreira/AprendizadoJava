package aprendizadoAvancadoJava.interfaceFuncional;

@FunctionalInterface
public interface InterfaceFuncionalCalc {

    public double executar(double a, double b);

    default String legal() {
        return "legal";
    }

    static String testeMetodo() {
        return "Muito bom!";
    }




}
