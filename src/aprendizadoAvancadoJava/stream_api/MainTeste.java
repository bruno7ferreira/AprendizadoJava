package aprendizadoAvancadoJava.stream_api;

public class MainTeste {

    public static void main(String[] args) {

        Media m1 = new Media().adicionar(8.3).adicionar(6.7);
        Media m2 = new Media().adicionar(7.9).adicionar(6.6);
        System.out.println(m1.getValue());
        System.out.println(m2.getValue());

        System.out.println(Media.combinar(m1, m2).getValue());


    }

}
