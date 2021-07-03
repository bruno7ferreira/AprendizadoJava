package aprendizadoAvancadoJava.vetorEmatrizes;

import java.util.Scanner;

public class ExemploMatriz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos tem na turma? ");
        int qdAlunos = input.nextInt();

        System.out.println("Quantos notas por aluno? ");
        int qdNotas = input.nextInt();

        Double[][] notasDaTurma = new Double[qdAlunos][qdNotas];
        double totalNotas = 0;

        for (int i = 0; i < qdAlunos; i++) {
            for (int cont = 0; cont < notasDaTurma[i].length; cont++) {
                //verificar esse bloco de código
                System.out.printf("Informe a nota " + (i + 1) + " do aluno " + (cont + 1) + " ");
                notasDaTurma[i][cont] = input.nextDouble();
                totalNotas += notasDaTurma[i][cont];
            }
        }
        double media = totalNotas / (qdAlunos * qdNotas);
        System.out.println("Média " + media);

        for (Double[] cont : notasDaTurma) {
            System.out.println(cont);
        }

        //System.out.println(Arrays.toString(notasDaTurma));

        input.close();
    }
}
