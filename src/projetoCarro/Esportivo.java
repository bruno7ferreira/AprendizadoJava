package projetoCarro;

public interface Esportivo {


    void ligarTurbo();

    void desligarTurbo();

    int  VELOCIDADE_MAXIMA = 240;

    boolean turboLigado = true;


    int deltaAcelerador = 20;
    int deltaFreiar = 20;


}
