package estrutura_de_dados.vetores;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<>();

        carros.add("Bravo");
        carros.add("BMW");
        System.out.println(carros);
        carros.add(1, "GT-R");
        System.out.println(carros);

        if (carros.contains("Bravo")) {
            System.out.println("Contém o carro " + carros.get(0));
        } else {
            System.out.println("Não foi encontrado!");
        }
        System.out.println(carros.indexOf("Bravo"));
        carros.remove(1);
        System.out.println(carros);
        System.out.println(carros.size());
        carros.set(1, "Mercedes");
        System.out.println(carros);


    }
}
