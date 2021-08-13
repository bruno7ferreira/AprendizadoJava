package aprendizadoAvancadoJava.observer;

import aprendizadoJava.data_.Data;

public class EventoChegadaAniversariante {

    private final Data momento;

    public EventoChegadaAniversariante(Data momento) {
        this.momento = momento;
    }

    public Data getMomento() {
        return momento;
    }
}
