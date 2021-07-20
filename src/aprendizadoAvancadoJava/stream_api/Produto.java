package aprendizadoAvancadoJava.stream_api;

public class Produto {

    final private String nome;
    private double preco;
    private double desconto;
    private double valorFrete;

    public Produto(String nome, double preco, double desconto, double valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                ", valorFrete=" + valorFrete +
                '}';
    }
}
