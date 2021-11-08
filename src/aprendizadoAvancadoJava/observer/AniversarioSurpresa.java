package aprendizadoAvancadoJava.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {

        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registrarObservadores(namorada);
        porteiro.registrarObservadores(e -> {
            System.out.println(" \n Surpresa!! via Lambda");
            System.out.println("Ocorreu as: " + e.getMomento());
        }); //Usando lambda
        porteiro.monitorar();


    }

}
