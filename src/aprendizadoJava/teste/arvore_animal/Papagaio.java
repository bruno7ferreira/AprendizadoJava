package aprendizadoJava.teste.arvore_animal;

public class Papagaio extends Ave {


    //Métodos
    public void voar() {
        System.out.println("Ave voando!");
    }

    public void emitirSom() {
        System.out.println("Som de Papagaio!");
    }

    //Construtor
    public Papagaio(String nome) {
        super(nome);
    }
}
