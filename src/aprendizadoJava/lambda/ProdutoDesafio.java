package lambda;

public class ProdutoDesafio {

    final String nome;
    final Double preco;
    final Double desconto;

    public ProdutoDesafio(String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "ProdutoDesafio{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                '}';
    }
}
