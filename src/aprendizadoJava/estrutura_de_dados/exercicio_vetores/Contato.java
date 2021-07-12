package aprendizadoJava.estrutura_de_dados.exercicio_vetores;

import java.util.Objects;

public class Contato {

    //Atributos
    private int id;
    private String nome;
    private String telefone;
    private String email;

    //Métodos


    //Construtor
    public Contato(String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato() {

    }

    //toString
    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                " nome='" + nome + '\'' +
                " telefone='" + telefone + '\'' +
                " email=" + email + '\'' +
                "}\n";
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

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return id == contato.id &&
                Objects.equals(nome, contato.nome) &&
                Objects.equals(telefone, contato.telefone) &&
                Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, telefone, email);
    }
}
