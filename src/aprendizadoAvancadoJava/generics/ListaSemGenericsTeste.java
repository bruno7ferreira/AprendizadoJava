package aprendizadoAvancadoJava.generics;

import java.util.Arrays;
import java.util.List;

public class ListaSemGenericsTeste {

    public static void main(String[] args) {

        List<String> carros = Arrays.asList("Lexus", "GR-R", "BMW", "Dodge");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);

        //fazendo o casting de objeto para String
        String ultimoCarro = (String) ListaSemGenerics.getUltimo1(carros);
        System.out.println(ultimoCarro);

        //fazendo o casting de objeto para Integer
        Integer ultimoNumero = (Integer) ListaSemGenerics.getUltimo1(numeros);
        System.out.println(ultimoNumero);


    }

}
