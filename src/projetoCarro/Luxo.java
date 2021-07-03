package projetoCarro;

public interface Luxo {

    //Atributo
    boolean arCondicionado = true;

    //Métodos
    void ligarArCondicionado();

    void desligarArConcionado();

    default int velocidadeDoAr() {
        return 1;
    }

}
