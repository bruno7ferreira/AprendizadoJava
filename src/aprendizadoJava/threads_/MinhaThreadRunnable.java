package aprendizadoJava.threads_;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int valorAdormecido) {
        this.nome = nome;
        this.tempo = valorAdormecido;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        System.out.println(nome + " foi iniciado");

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " tem contador valor " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            System.out.println(nome + " Foi interrompida");
        }

    }


}
