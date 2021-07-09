package aprendizadoJava.lambda.interface_funcional;

//import lambda.interface_funcional.Calcular;

public class Somar implements Calcular {

    private String nome = "Soma";

    @Override
    public double executar(double a, double b) {
        return a + b;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
