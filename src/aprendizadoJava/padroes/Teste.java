package padroes;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Teste {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[10];

        Random random = new Random();

        for (int cont = 0; cont < numeros.length; cont++) {
            numeros[cont] = random.nextInt(10);

        }

        for (int num : numeros) {
            System.out.println(num);
        }

        entrada.close();

    }
}