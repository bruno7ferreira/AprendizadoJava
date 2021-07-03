package teste.exercicio;

public class Telefone {

    //Atriutos
    private String tipo;
    private String ddd;
    private String numero;

    //Contrutor
    public Telefone() {

    }

    public Telefone(String tipo, String ddd, String numero) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }

    //Métodos

    public void telInfo() {
        System.out.println(tipo + " " + ddd + " " + numero);
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "tipo='" + tipo + '\'' +
                ", ddd='" + ddd + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    //Métodos get and set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
