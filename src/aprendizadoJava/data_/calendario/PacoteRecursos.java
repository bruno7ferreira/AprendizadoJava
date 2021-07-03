package aprendizadoJava.data_.calendario;

import java.util.Locale;
import java.util.ResourceBundle;

public class PacoteRecursos {

    public static void main(String[] args) {

        System.out.println("Local atual " + Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

        System.out.println("Olá " + rb.getString("world"));
        Locale.setDefault(new Locale("pt_BR", "pt_BR"));
        rb = ResourceBundle.getBundle("meu-texto");
        System.out.println(rb.getString("hello1"));

    }
}
