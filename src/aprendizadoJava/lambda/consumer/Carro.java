package aprendizadoJava.lambda.consumer;

public class Carro {

    final String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CarroExemplo{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
