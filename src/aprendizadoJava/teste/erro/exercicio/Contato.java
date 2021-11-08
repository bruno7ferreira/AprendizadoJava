package aprendizadoJava.teste.erro.exercicio;

public class Contato {

    //Atributos
    private static int contador = 0;

    private String nome;
    private String telefone;
    private String email;
    private int id;

    //Construtor
    public Contato(String nome, String telefone, String email) {
        contador++;
        id = contador;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }


}
