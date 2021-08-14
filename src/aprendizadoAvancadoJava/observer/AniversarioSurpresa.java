package aprendizadoAvancadoJava.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {

        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registrarObservadores(namorada);
        porteiro.registrarObservadores(evento -> System.out.println(" \n Surpresa!! via Lambda")); //Usando lambda
        porteiro.monitorar();


    }

}
