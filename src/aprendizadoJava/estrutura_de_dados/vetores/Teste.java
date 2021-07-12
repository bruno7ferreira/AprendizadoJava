package aprendizadoJava.estrutura_de_dados.vetores;

public class Teste {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);


        try {
            vetor.adicionar("Elemento 1");
            vetor.adicionar("Elemento 2");
            vetor.adicionar("Elemento 3");

            System.out.println(vetor.getTamanho());
            System.out.println(vetor);
            System.out.println("---------");
            System.out.println(vetor.busca("elemento 1"));
            vetor.adicionar(0, "Elemento 0");
            System.out.println(vetor);
            System.out.println(vetor.getTamanho());
            vetor.adicionar(3, "Elemento 4");
            System.out.println(vetor);


        } catch (Exception e) {
            //e.getMessage();
            e.printStackTrace();
        }


    }
}
