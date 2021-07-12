package aprendizadoJava.data_.calendario;

import java.util.Calendar;

public class Calendario {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.println("Hoje " + hoje);
        System.out.println("ano " + ano);
        System.out.println("mes " + (mes + 1));
        System.out.println("dia " + dia);
        System.out.println("hora " + hora);
        System.out.println("minutos " + minutos);
        System.out.println("segundos " + segundos);

        System.out.printf("Hoje é dia: %d/%02d/%d \n", dia, (mes + 1), ano);
        System.out.printf("Agora são %d:%d:%d", hora, minutos, segundos);


    }

}
