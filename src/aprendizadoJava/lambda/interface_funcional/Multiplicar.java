package lambda.interface_funcional;

import lambda.interface_funcional.Calcular;

public class Multiplicar implements Calcular {

    private String nome = "Multiplicação";

    @Override
    public double executar(double a, double b) {
        return a * b;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
