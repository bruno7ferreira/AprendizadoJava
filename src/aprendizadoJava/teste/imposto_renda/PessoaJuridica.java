package aprendizadoJava.teste.imposto_renda;

public class PessoaJuridica extends Pessoa {

    //Atributos
    private String cnpj;


    //Métodos
    public PessoaJuridica(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public double descontoImposto() {
        return (this.getSalario() / 100) * 0.1;
    }

    @Override
    public String toString() {
        return "Pessoa Juridica{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                ", CNPJ=" + getCnpj() +
                '}';
    }

    //Construtor
    public PessoaJuridica(String nome, double salario, String cnpj) {
        super(nome, salario);
        this.cnpj = cnpj;
    }

    //get and set
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
