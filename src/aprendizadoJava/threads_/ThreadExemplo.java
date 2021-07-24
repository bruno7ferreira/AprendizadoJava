package aprendizadoJava.threads_;

public class ThreadExemplo {

    public static void main(String[] args) {

    }

}

class GerarPDF implements Runnable {
    @Override
    public void run() {
        System.out.println("Gerar PDF");
    }

}

class BarraDeCarregamento implements Runnable {
    @Override
    public void run() {
        System.out.println("Loading...");
    }
}
