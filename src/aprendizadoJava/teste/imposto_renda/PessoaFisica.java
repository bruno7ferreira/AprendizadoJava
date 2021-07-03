package teste.imposto_renda;

public class PessoaFisica extends Pessoa {

    //Atributos
    private String cpf;


    //Métodos

    public PessoaFisica(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double descontoImposto() {

        if (getSalario() > 0 && getSalario() < 1400) {
            setSalario(getSalario() - 0);
        } else if (getSalario() >= 1400.01 && getSalario() <= 2100) {
            setSalario(getSalario() - 100);
        } else if (getSalario() >= 2100.01 && getSalario() <= 2800) {
            setSalario(getSalario() - 270);
        } else if (getSalario() >= 2800.01 && getSalario() <= 3600) {
            setSalario(getSalario() - 500);
        } else if (getSalario() >= 3600.01) {
            setSalario(getSalario() - 500);
        }
        return getSalario();

    }

    @Override
    public String toString() {
        return "Pessoa Fisica{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                ", CPF=" + getCpf() +
                '}';
    }

    //Construtor
    public PessoaFisica(String nome, double salario, String cpf) {
        super(nome, salario);
        this.cpf = cpf;
    }

    //get and set
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
