package excecao;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Informe um número: ");
            System.out.println(7 / entrada.nextInt());
        } catch (Exception x) {
            System.out.println(x.getMessage());
        } finally {
            System.out.println("Final!!!");
            entrada.close();
        }
        System.out.println("FIM!");

    }
}
