package aprendizadoJava.lambda.interface_funcional;

@FunctionalInterface
public interface Calcular {

    //Uma interface funcional pode possuir apenas um método
    double executar(double a, double b);

    //Método padrão, que não será alterado
    default String world(){
        return "Hello World!";
    }

    //Método estático para acesso direto da classe
    static String mundo(){
        return "Olá Mundo!";
    }

}
