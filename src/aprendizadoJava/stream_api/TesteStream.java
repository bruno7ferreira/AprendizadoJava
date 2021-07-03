package stream_api;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class TesteStream {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Bruno", "Maria Clara", "Alexandra", "Paulo Marcello", "Clara Luanny",
                "Lucicleia", "Gustavo");

        Iterator<String> cont = nomes.iterator();
        while (cont.hasNext()) {
            System.out.println(cont.next());
        }

    }

}
