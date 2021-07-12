package aprendizadoAvancadoJava.lambda.consumer;

public class Produto {

    String nome;
    double preco;
    double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return nome +
                ", R$ " + preco +
                "0, " + desconto +
                "%";
    }
}
