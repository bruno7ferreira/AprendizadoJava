package aprendizadoJava.data_.calendario;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class ApiJavaData {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2020, 9, 14));

        try {
            System.out.println(LocalDate.parse("1991-13-14"));
        } catch (Exception e) {
            System.out.println("Defina o valor em ano/mes/dia");
            System.out.println("Exemplo 2020/01/21");
        }

        System.out.println(agora.plusDays(5));
        System.out.println(agora.minusMonths(1));
        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfYear());//dia do ano
        System.out.println(agora.isLeapYear());//ano bissexto

        LocalTime horaAgora = LocalTime.now();
        System.out.println(horaAgora);

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds();
        for (String cont : fusos) {
            System.out.println(cont);
        }


    }
}
