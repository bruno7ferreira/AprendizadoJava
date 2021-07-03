package desafioPratica;


public class SistemaMainCarro {

    public static void main(String[] args) {

        desafioPratica.Carro c1 = new Lexus("Lexus");
        Carro c2 = new Bravo("Bravo");

        c1.acelerarCarro();
        c2.acelerarCarro();
        System.out.println("Velocidade do " + c1.getNome() + " = " + c1.getVelocidade());
        System.out.println("Velocidade do " + c2.getNome() + " = " + c2.getVelocidade());
        c1.freiarCarro();
        c1.freiarCarro();
        c2.freiarCarro();
        c2.freiarCarro();
        System.out.println("Velocidade do " + c1.getNome() + " = " + c1.getVelocidade());
        System.out.println("Velocidade do " + c2.getNome() + " = " + c2.getVelocidade());


    }


}
