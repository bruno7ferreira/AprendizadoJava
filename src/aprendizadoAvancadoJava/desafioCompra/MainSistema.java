package aprendizadoAvancadoJava.desafioCompra;

public class MainSistema {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Bruno");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Notebook", 3000, 1);
        compra1.adicionarItem(new Produto("Impressora", 400), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Mouse", 300, 1);
        compra2.adicionarItem(new Produto("Computador", 7000), 1);

        cliente1.listaDeCompras.add(compra1);
        cliente1.listaDeCompras.add(compra2);
        System.out.println("O valor da compra do cliente " + cliente1 + " foi de: " + cliente1.obterValorTotal());

    }
}
