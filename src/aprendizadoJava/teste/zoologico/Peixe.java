package teste.zoologico;

public class Peixe extends Animal {

    //Atributos
    private static String caracteristicas = "Barbatanas e Cauda";


    //Construtor
    public Peixe(String nome, double comprimento, int numPatas, String cor,
                 String ambiente, int velocidade) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.setNumPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinza");

    }

    @Override
    public String toString() {
        return "Peixe{" +
                "nome='" + getNome() + '\'' +
                ", comprimento=" + getComprimento() +
                ", numPatas=" + getNumPatas() +
                ", cor='" + getCor() + '\'' +
                ", ambiente='" + getAmbiente() + '\'' +
                ", velocidade=" + getAmbiente() + '\'' +
                ",caracteristicas=" + getCaracteristicas() +
                '}';
    }

    //Get and Set
    public static String getCaracteristicas() {
        return caracteristicas;
    }

    public static void setCaracteristicas(String caracteristicas) {
        Peixe.caracteristicas = caracteristicas;
    }




}
