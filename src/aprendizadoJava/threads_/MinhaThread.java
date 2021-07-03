package threads_;

public class MinhaThread extends Thread {

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run() {
        System.out.println("Executando a thread");


        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " Contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            System.out.println("Erro de exceção");
        }


    }


}
