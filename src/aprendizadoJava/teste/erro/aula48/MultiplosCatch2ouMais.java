package aprendizadoJava.teste.erro.aula48;

public class MultiplosCatch2ouMais {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int cont = 0; cont < numeros.length; cont++) {
            try {
                System.out.println(numeros[cont] + " / " + demon[cont] + " = " + (numeros[cont] / demon[cont]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException variavel) {
                System.out.println("Erro ao dividir por zero1");
            }

        }


    }
}
