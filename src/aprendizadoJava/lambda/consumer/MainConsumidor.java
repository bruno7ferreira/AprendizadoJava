package lambda.consumer;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainConsumidor {

    public static void main(String[] args) {

        Consumer<Carro> fichaTecnica = c -> System.out.println(c.nome);

        Carro c1 = new Carro("Bravo");
        Carro c2 = new Carro("GT-R");
        Carro c3 = new Carro("Lexus");
        Carro c4 = new Carro("Raptor");
        fichaTecnica.accept(c1);

        List<Carro> veiculo = Arrays.asList(c1, c2, c3, c3);
        System.out.println(veiculo.toString());
        System.out.println("-------------");
        veiculo.forEach(fichaTecnica);
        System.out.println("-------------");
        veiculo.forEach(c -> System.out.println(c.nome));
        System.out.println("-------------");
        veiculo.forEach(System.out::println);


    }
}
