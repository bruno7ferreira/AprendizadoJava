package teste.erro.aula52;

public class MinhaExcecao {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] demon = {2, 0, 4, 8, 0, 2, 4};

        for (int cont = 0; cont < numeros.length; cont++) {
            try {
                if (numeros[cont] % 2 != 0)
                    throw new DivisaoNaoExata(numeros[cont], demon[cont]);
                System.out.println(numeros[cont] + " / " + demon[cont] + " = " + (numeros[cont] / demon[cont]));
            } catch (Exception variavel) {
                System.out.println("------------------");
                System.out.println("Ocorreu um erro " + variavel.getMessage());
                variavel.printStackTrace();
            }

        }
    }
}
