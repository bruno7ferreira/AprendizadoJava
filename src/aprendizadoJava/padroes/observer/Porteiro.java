package aprendizadoJava.padroes.observer;


import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariante observador) {
        observadores.add(observador);

    }

    public void monitorar() {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!"sair".equalsIgnoreCase(valor)) {
            System.out.println("Aniversariante chegou? ");
            valor = entrada.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                //Criar o evento
                //EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

                EventoChegadaAniversariante evento = null;
                //Notificar os Observadores!
                observadores.stream()
                        .forEach(o -> o.chegou(evento));
            } else {
                System.out.println("Alarme falso!");
            }

        }


        entrada.close();
    }
}
