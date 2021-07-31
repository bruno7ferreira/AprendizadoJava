package aprendizadoAvancadoJava.tratamento_de_erro;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner entranda = new Scanner(System.in);
        try {


            System.out.println(7 / entranda.nextInt());

            entranda.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {// finally = o codigo dentro do finally será executado independente de erro ou não
            entranda.close();
            System.out.println("!!!");
        }
        System.out.println("Fim");
    }


}
