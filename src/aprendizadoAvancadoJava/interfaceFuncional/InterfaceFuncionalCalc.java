package aprendizadoAvancadoJava.interfaceFuncional;

@FunctionalInterface
public interface InterfaceFuncionalCalc {

    public double executar(double a, double b);

    //método default
    default String legal() {
        return "legal";
    }

    //Método por referencia
    static String testeMetodo() {
        return "Muito bom!";
    }


}
