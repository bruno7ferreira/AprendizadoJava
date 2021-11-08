package aprendizadoJava.teste.teste_aleatorios;

import java.util.Scanner;

public class DesafioDio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //continue a solucao de acordo com as notas do enunciado
        int notasInseridas = entrada.nextInt();
        int atual = notasInseridas; // 576
        int notas100 = atual / 100; // 576/100 =5,76
        atual -= notas100 * 100; //576-100 = 476 =47.600
        int notas50 = atual / 50;
        atual -= notas50 * 50;
        int notas20 = atual / 20;
        atual -= notas20 * 20;
        int notas10 = atual / 10;
        atual -= notas10 * 10 ;
        int notas5 = atual / 5;
        atual -= notas5 * 5;
        int notas2 = atual / 2;
        atual -= notas2 * 2;
        int notas1 = atual;

        //continue a solucao de acordo com os exemplos de saída
        System.out.println(notasInseridas);
        System.out.println(  notas100 + " nota(s) de R$ 100,00");
        System.out.println(  notas50 + " nota(s) de R$ 50,00");
        System.out.println(  notas20 + " nota(s) de R$ 20,00");
        System.out.println(  notas10 + " nota(s) de R$ 10,00");
        System.out.println(  notas5 + " nota(s) de R$ 5,00");
        System.out.println(  notas2 + " nota(s) de R$ 2,00");
        System.out.println(  notas1 + " nota(s) de R$ 1,00");
    }

    }

