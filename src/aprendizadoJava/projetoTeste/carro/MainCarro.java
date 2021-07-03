package projetoTeste.carro;

public class MainCarro {

    public static void main(String[] args) {


        Carro bravo = new Carro(220);
        Carro enzo = new Ferrari();
        System.out.println(bravo.getVelocidadeAtual());
        bravo.acelerar();
        System.out.println(bravo.getVelocidadeAtual());
        enzo.acelerar();
        System.out.println(enzo.getVelocidadeAtual());
        bravo.acelerar();
        System.out.println(bravo.getVelocidadeAtual());
        enzo.acelerar();
        System.out.println(enzo.getVelocidadeAtual());
        enzo.acelerar();
        enzo.acelerar();
        System.out.println("-----");
        System.out.println(enzo.getVelocidadeAtual());
        System.out.println(enzo.toString());
        Ferrari laFerrari = new Ferrari();
        laFerrari.ligarTurbo();
        System.out.println("---");
        laFerrari.acelerar();
        System.out.println(laFerrari.toString());

    }
}
