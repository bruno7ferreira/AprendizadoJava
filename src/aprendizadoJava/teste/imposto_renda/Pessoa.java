package teste.imposto_renda;

import java.util.Objects;

public abstract class Pessoa {

    //Atributos
    private String nome;
    private double salario;


    //Métodos
    public abstract double descontoImposto();

    //Construtor
    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //HashCode Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Double.compare(pessoa.salario, salario) == 0 &&
                Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, salario);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
