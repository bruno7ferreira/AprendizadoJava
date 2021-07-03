package teste.arvore_animal;

public abstract class Mamifero extends Animal {


    //Métodos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero!");
    }

    public abstract void amamentar();


    //Construtor
    public Mamifero(String nome) {
        super(nome);
    }


}
