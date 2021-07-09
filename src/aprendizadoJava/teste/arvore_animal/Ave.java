package aprendizadoJava.teste.arvore_animal;

public abstract class Ave extends Animal {


    //Métodos
    @Override
    public void emitirSom() {
        System.out.println("Som de Ave!");
    }

    public abstract void voar();

    //Construtor
    public Ave(String nome) {
        super(nome);
    }

}
