package aprendizadoJava.teste.teste_aleatorios;

import java.util.Scanner;

public class DesafioDio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
//declare suas variaveis corretamente
        int num[] = new int[5];

        int numImpar = 0;
        int numPar = 0;
        int numPositivo = 0;
        int numNegativo = 0;

//continue a solução
        for (int cont = 0; cont < 5; cont++) {
            num[cont] = entrada.nextInt();

            if (num[cont] >= 0) {
                if (num[cont] > 0) {
                    numPositivo++;
                    if (num[cont] % 2 == 0) {
                        numPar++;
                    } else {
                        numImpar++;
                    }
                } else {
                    if (num[cont] % 2 == 0) {
                        numPar++;
                    } else {
                        numImpar++;
                    }
                }

            } else if (num[cont] < 0) {
                numNegativo++;
                if (num[cont] % 2 == 0) {
                    numPar++;
                } else {
                    numImpar++;
                }
            }
        }
//insira suas variaveis corretamente
        System.out.println(numPar + " valor(es) par(es)");
        System.out.println(numImpar + " valor(es) impar(es)");
        System.out.println(numPositivo + " valor(es) positivo(s)");
        System.out.println(numNegativo + " valor(es) negativo(s)");
    }

}

