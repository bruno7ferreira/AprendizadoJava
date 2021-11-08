package aprendizadoJava.teste.teste_aleatorios;

public class MainWrappers {

    public static void main(String[] args) {

        System.out.println(soma(10, 10, 20, 30));
    }

    static int soma(int i, Integer... vetor) {

        int total = 0;
        for (int cont = 0; cont < vetor.length; cont++) {
            total += vetor[cont];
        }
        return total + i;
    }
}
