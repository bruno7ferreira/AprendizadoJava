package aprendizadoAvancadoJava.generics.herancaGenerics;

public class CaixaIntTeste {

    public static void main(String[] args) {

        CaixaInt caixaA = new CaixaInt();
        caixaA.guardarCoisa(7);

        Integer coisaA = caixaA.pegarCoisa();
        System.out.println(coisaA);

    }

}
