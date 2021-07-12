package aprendizadoJava.data_.calendario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainCalendario {

    public static void main(String[] args) {

        Calendar hoje1 = Calendar.getInstance();

        GregorianCalendar hoje = new GregorianCalendar();

        System.out.println(hoje);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm z");
        Calendar data1 = new GregorianCalendar(2001, 9, 27, 14, 30);
        System.out.println(sdf.format(data1.getTime()));

        

    }

}
