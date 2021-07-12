package aprendizadoJava.data_.calendario;

import java.text.DateFormat;
import java.util.Date;

public class FormatandoDatasLocais {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);

    }
}
