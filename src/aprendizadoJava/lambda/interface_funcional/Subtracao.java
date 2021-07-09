package aprendizadoJava.lambda.interface_funcional;

//import lambda.interface_funcional.Calcular;

public class Subtracao implements Calcular {

    private String nome = "Subtração";

    public double executar(double x, double y) {
        return x - y;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
