package aprendizadoJava.teste.arvore_animal;

public class Gato extends Mamifero implements AnimalEstimacao, AnimalDomesticado {

    //Atributos
    private String raca;


    //Métodos
    @Override
    public void amamentar() {
        System.out.println("Gato amamentado!");
    }

    @Override
    public void alimentar() {
        System.out.println("Dar ração para gato!");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Gato levado ao Veterinário");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Veterinário foi chamado!");
    }

    public void emitirSom() {
        System.out.println("Miando!");
    }

    public void brincar() {
        System.out.println("Brincar com Gato!");
    }

    public void levarPassear() {
        System.out.println("Gato levado para passear!");
    }

    //Construtor
    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    //Get and Set
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
