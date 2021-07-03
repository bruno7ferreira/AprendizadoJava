package teste.erro.aula50;

import javax.swing.*;
import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args) {

        System.out.println("Entre com um número decimal");
        try {
            double num = leNumero();
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            //e.printStackTrace();
        }

    }

    public static double leNumero() throws Exception {
        Scanner entrada = new Scanner(System.in);
        double num = entrada.nextDouble();
        return num;
    }
}
