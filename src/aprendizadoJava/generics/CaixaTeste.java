package aprendizadoJava.generics;

public class CaixaTeste {

    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo!");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<String> caixaB = new Caixa<>();
        caixaB.guardar("Segredo!!");

        String coisaB = caixaB.abrir();
        System.out.println(coisaB);

        Caixa<Double> caixaC = new Caixa<>();
        caixaC.guardar( 7.7);

        Double coisaC = caixaC.abrir();
        System.out.println(coisaC);


    }

}
