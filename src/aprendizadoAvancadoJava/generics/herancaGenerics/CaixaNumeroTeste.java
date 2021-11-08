package aprendizadoAvancadoJava.generics.herancaGenerics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardarCoisa(24.8);

        System.out.println(caixaA.pegarCoisa());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardarCoisa(7);

        Integer coisaB = caixaB.pegarCoisa();
        System.out.println(coisaB);


    }
}
