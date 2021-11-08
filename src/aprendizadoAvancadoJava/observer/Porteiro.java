package aprendizadoAvancadoJava.observer;

import aprendizadoJava.data_.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
    // lista com classes que implementam a interface

    public void registrarObservadores(ObservadorChegadaAniversariante observador) {
        observadores.add(observador);
    }

    public void monitorar() {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!"sair".equalsIgnoreCase(valor)) {
            System.out.print("Aniversariante chegou? ");
            valor = entrada.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                //criar evento
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

                //notificar os observadores
                observadores.stream()
                        .forEach(o -> o.chegou(evento));
                valor="sair";
            } else {
                System.out.println("Alarme falso!");
            }

        }

    }

}