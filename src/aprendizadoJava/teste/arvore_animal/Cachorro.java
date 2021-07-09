package aprendizadoJava.teste.arvore_animal;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado {

    //Atributos
    private String tamanho;
    private String raca;


    //Métodos
    @Override
    public void amamentar() {
        System.out.println("Cachorro amamentado!");
    }

    @Override
    public void alimentar() {
        System.out.println("Dar ração para cachorro");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Cachorro levado ao veterinário!");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Veterinário foi chamado!");
    }


    public void emitirSom() {
        System.out.println("Latindo!");
    }

    public void brincar() {
        System.out.println("Brincar com Cachorro!");
    }

    public void levarPassear() {
        System.out.println("Cachorro levado para passear!");
    }


    //Construtor
    public Cachorro(String nome, String tamanho, String raca) {
        super(nome);
        this.tamanho = tamanho;
        this.raca = raca;
    }

    //Get and Set
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
