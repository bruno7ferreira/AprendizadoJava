package aprendizadoAvancadoJava.generics.exemploComGenerics;

public class CaixaTeste {

    public static void main(String[] args) {

        // sintaxe <>
        //exemplo <tipo>
        Caixa<String> caixaA = new Caixa<>();

        caixaA.guardarCoisa("Segredo!");
        System.out.println(caixaA.pegarCoisa());

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardarCoisa(10.0);
        Double v = caixaB.pegarCoisa();
        System.out.println(v);


    }
}
