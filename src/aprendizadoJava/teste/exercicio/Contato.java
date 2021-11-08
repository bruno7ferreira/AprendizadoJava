package aprendizadoJava.teste.exercicio;

public class Contato {

    //Atributos
    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;
    private String email;
    private String phone;

    //Métodos
    public void fichaContato() {
        System.out.println("Nome: " + getNome() +
                " \nEndereço: " + getEndereco() +
                " \nTelefone: " + getTelefones());
    }

    public String obterInfo() {
        return "Nome =" + nome +
                "Telefone =" + telefones +
                "E-mail =" + email;
    }


    //Construtor
    public Contato(String nome, Endereco endereco, Telefone[] telefones) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefones = telefones;
    }

    public Contato() {

    }

    //Métodos get and set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
