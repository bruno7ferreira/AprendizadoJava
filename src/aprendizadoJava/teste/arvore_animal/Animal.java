package teste.arvore_animal;

public abstract class Animal {

    //Atributos
    private String nome;


    //Métodos
    public abstract void emitirSom();

    //Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    //Get and Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
