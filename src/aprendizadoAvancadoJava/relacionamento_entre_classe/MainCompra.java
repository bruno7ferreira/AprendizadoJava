package aprendizadoAvancadoJava.relacionamento_entre_classe;

public class MainCompra {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Bruno";
        compra1.adicionarProduto(new Produto("Caneta", 10, 4.50));
        compra1.adicionarProduto(new Produto("Lapís", 20, 1.30));
        compra1.adicionarProduto(new Produto("Caderno", 5, 20.50));

        System.out.println(compra1.listaCompra.size());
        System.out.println("Valor total da compra R$" + compra1.getValorTotal());


    }
}
