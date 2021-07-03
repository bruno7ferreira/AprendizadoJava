package aprendizadoAvancadoJava.vetorEmatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploArrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas? ");
        int qtDeNotas = entrada.nextInt();

        Double[] notas = new Double[qtDeNotas];


        for (int cont = 0; cont < notas.length; cont++) {
            System.out.println("Informe as notas do aluno: ");
            notas[cont] = entrada.nextDouble();
        }
        System.out.println(Arrays.toString(notas));

        int total = 0;
        for (Double i : notas) {
            total += i;
        }
        System.out.println("Total igual a: " + total);

        System.out.println("A média é " + (total / notas.length));
        entrada.close();
    }
}
