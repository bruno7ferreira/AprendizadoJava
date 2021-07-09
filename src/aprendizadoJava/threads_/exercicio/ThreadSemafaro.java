package aprendizadoJava.threads_.exercicio;

public class ThreadSemafaro implements Runnable {

    private CorSemafaro cor;
    private boolean parar;
    private boolean corMudou;

    public ThreadSemafaro() {
        this.cor = CorSemafaro.VERMELHO;
        this.parar = false;
        this.corMudou = false;

        new Thread(this).start();

    }

    @Override
    public void run() {

        while (!parar) {
            try {
                /*switch (this.cor) {
                    case VERMELHO:
                        Thread.sleep(10000);
                        break;
                    case VERDE:
                        Thread.sleep(5000);
                        break;
                    case AMARELO:
                        Thread.sleep(2500);
                        break;
                }
                 */
                Thread.sleep(this.cor.getTempoEspera());
                this.mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    private synchronized void mudarCor() {
        switch (this.cor) {
            case VERMELHO:
                this.cor = CorSemafaro.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemafaro.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemafaro.AMARELO;
                break;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void esperaCorMudar() {
        while (!this.corMudou) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.corMudou = false;
    }

    public synchronized void desligarSemafaro() {
        this.parar = true;
    }

    public CorSemafaro getCor() {
        return cor;
    }

}
