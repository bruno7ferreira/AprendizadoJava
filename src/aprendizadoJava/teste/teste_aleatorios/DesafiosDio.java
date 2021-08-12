package aprendizadoJava.teste.teste_aleatorios;

import java.util.Scanner;

public class DesafiosDio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double num[] = new double[6];
        int contadorPositivo = 0;

        for (int cont = 0; cont < 6; cont++) {
            num[cont] = entrada.nextDouble();
            if (num[cont] > 0) {
                contadorPositivo++;
            }
        }

        System.out.println(contadorPositivo + " valores positivos");
        entrada.close();
    }
}
