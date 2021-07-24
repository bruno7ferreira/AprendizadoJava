package aprendizadoJava.threads_;

public class ThreadExemplo {


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
