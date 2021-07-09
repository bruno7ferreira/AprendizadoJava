package aprendizadoJava.threads_.exercicio;

public class MainSemafaro {

    public static void main(String[] args) {


        threads_.exercicio.ThreadSemafaro semafaro = new threads_.exercicio.ThreadSemafaro();
        for (int i = 0; i < 10; i++) {
            System.out.println(semafaro.getCor());
            semafaro.esperaCorMudar();

        }

        semafaro.desligarSemafaro();
    }

}
