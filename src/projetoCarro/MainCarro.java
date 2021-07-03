package projetoCarro;

public class MainCarro {

    public static void main(String[] args) {

        Carro bravo = new Bravo("Bravo");

        bravo.ligarCarro();
        bravo.acelerarCarro();
        bravo.acelerarCarro();
        bravo.getVelocidade();
        bravo.freiarCarro();
        bravo.getVelocidade();
        bravo.desligarCarro();
        bravo.freiarCarro();
        bravo.getVelocidade();

        bravo.toString();
        Carro lexus1 = new Lexus("Lexus");


    }
}
