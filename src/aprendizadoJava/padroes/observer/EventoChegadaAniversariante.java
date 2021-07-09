package aprendizadoJava.padroes.observer;

import javax.xml.crypto.Data;
import java.util.Date;

public class EventoChegadaAniversariante {

    //Atributo
    public final Data momento;

    //Construtor
    public EventoChegadaAniversariante(Date momento) {
        this.momento = (Data) momento;
    }

    public Data getMomento() {
        return momento;
    }


}
