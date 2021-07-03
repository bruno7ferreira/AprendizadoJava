package teste.teste_aleatorios;

public @interface Anotacao {

    String autor();

    int aulaNumero();

    String blog() default "www.gmail.com";

    String site() default "www.globo.com";


}
