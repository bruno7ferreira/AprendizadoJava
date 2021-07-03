package aprendizadoJava.data_.calendario;

import java.util.Calendar;
import java.util.TimeZone;

public class FusoHorario {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        TimeZone tz = calendario.getTimeZone();
        System.out.println(tz);

        String[] fusosHorarios = TimeZone.getAvailableIDs();

        for (String cont : fusosHorarios) {
            System.out.println(cont);

        }

        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
        System.out.println(tzSP.getDisplayName());
        System.out.println(tzSP.getID());


    }
}
