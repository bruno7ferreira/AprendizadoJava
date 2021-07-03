package threads_;

public class Teste4 {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable(" Thread 1 ", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable(" Thread 2 ", 450);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable(" Thread 3 ", 400);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();

        t3.start();

        try {
            t1.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();


        System.out.println("\n Programa finalizado! \n");


    }
}
