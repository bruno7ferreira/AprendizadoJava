package aprendizadoAvancadoJava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaComGenericsTeste {

    public static void main(String[] args) {

        List<String> carros2 = Arrays.asList("Bravo", "Lexus", "GT-R", "Mercedes");
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4);

        String ultimoCarro2 = ListaComGenerics.getUltimo2(carros2);
        System.out.println(ultimoCarro2);

        Integer ultimoNumero2 = ListaComGenerics.getUltimo2(numeros2);
        System.out.println(ultimoNumero2);


    }

}
