package data_.calendario;

import java.text.NumberFormat;
import java.util.Locale;

public class Local {

    public static void main(String[] args) {


        Locale local = Locale.getDefault();
        System.out.println(local);

        Locale[] locais = Locale.getAvailableLocales();

        //get.DisplayName (informa o pais e qual o idioma)
        for (Locale cont : locais) {
            System.out.println("Pais: " + cont.getDisplayCountry());
            System.out.println("Idioma: " + cont.getDisplayLanguage());
            System.out.println("Nome: " + cont.getDisplayName());
            System.out.println("Código: " + cont.getLanguage());

            System.out.println();
        }

        NumberFormat euro = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(euro.format(100));

        Locale br = new Locale("pt", "Brazil");

        NumberFormat real = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("R" + real.format(100));




    }
}
