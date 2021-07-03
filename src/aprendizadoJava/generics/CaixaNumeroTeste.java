package generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        CaixaNumero<Integer> caixaA = new CaixaNumero<>();
        caixaA.guardar(7);
        System.out.println(caixaA.abrir());

        CaixaNumero<Double> caixaB = new CaixaNumero<>();
        caixaB.guardar(24.8);
        System.out.println(caixaB.abrir());

    }
}
