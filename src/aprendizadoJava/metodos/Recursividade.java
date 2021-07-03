package aprendizadoJava.metodos;

public class Recursividade {

    public static void main(String[] args) {

        int[] vetor = new int[5];

        for (int cont = 0; cont < vetor.length; cont++) {
            vetor[cont] = (int) (Math.random() * vetor.length);
        }

        System.out.println(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        somar(0, 0, vetor);
    }

    public static int somar(int soma, int posicao, int[] vetor) {
        int resultado = 0;
        if (posicao < vetor.length) {
            soma += vetor[posicao];
            return somar(soma, posicao + 1, vetor);
        } else {
            return soma;
        }

    }

}
