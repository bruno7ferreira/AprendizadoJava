package aprendizadoJava.lambda.interface_funcional;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Bruno", "Paulo", "Maria", "Clara");

        //Forma tradicional
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        System.out.println("___________");

        //Foreach com Lambda #1
        aprovados.forEach((nome) -> {
            System.out.println(nome.concat(" :D "));
        });
        System.out.println("___________");

        List<String> carros = Arrays.asList("Bravo", "BMW", "GT-R");
        //Forma apreviada, quando se utiliza apenas um parâmetro
        carros.forEach(variavelCarro -> System.out.println(variavelCarro));
        System.out.println("___________");

        //Método de referencia
        aprovados.forEach(System.out::println);
        carros.forEach(System.out::println);
        System.out.println("___________");

        
    }
}
