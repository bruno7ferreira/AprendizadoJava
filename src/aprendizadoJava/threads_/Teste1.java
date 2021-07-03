package threads_;

public class Teste1 {

    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread 1 ", 75);
        //thread.start();

        MinhaThread thread2 = new MinhaThread("Thread 2", 50);

        MinhaThread thread3 = new MinhaThread("Thread 3", 100);


    }
}
