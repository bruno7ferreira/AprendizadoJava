package aprendizadoJava.teste.teste_aleatorios;

import java.io.*;

public class TesteBufferedWriter {

    public static void main(String[] args) {

        File file = new File("Arquivo.txt");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bf = new BufferedWriter(fw);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
