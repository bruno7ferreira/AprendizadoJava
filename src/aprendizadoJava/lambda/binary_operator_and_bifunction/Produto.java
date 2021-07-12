package aprendizadoJava.lambda.binary_operator_and_bifunction;

public class Produto {

    protected String nome;
    protected double desconto;
    protected double preco;

    public Produto(String nome, double desconto, double valor) {
        this.nome = nome;
        this.desconto = desconto;
        this.preco = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", desconto=" + desconto +
                ", valor=" + preco +
                '}';
    }
}
