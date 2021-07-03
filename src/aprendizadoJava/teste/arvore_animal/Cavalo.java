package teste.arvore_animal;

public class Cavalo extends Mamifero implements AnimalDomesticado {


    //Construtor
    public Cavalo(String nome) {
        super(nome);
    }

    //Métodos
    @Override
    public void amamentar() {
        System.out.println("Cavalo Amamentado!");
    }

    public void emitirSom() {
        System.out.println("Relinchar!");
    }


    public void alimentar() {
        System.out.println("dar ração pra Cavalo");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Cavalo levado ao Veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Veterinário foi chamado!");
    }


}
