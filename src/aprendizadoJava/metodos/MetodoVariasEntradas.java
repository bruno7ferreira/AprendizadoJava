package aprendizadoJava.metodos;

public class MetodoVariasEntradas {

    public static void main(String[] args) {


        Pessoa eu = new Pessoa();
        System.out.println(eu.nome);

        MetodoVariasEntradas teste = new MetodoVariasEntradas();
        int testei = teste.somarNumeros(10, 50, 10);
        System.out.println(testei);

    }

    public int somarNumeros(int... numeros) {
        int soma = 0;
        for (int cont : numeros) {
            soma += cont;
        }
        return soma;
    }
}


