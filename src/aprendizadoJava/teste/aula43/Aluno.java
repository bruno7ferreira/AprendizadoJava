package teste.aula43;


import java.util.Arrays;
import java.util.Objects;

public class Aluno {

    //Atributos
    private String cursos;
    private double[] notas;
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    //Métodos
    public double calcularMedia(double notas) {
        double media = notas / 1;
        return media;
    }

    //Construtor
    public Aluno() {

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "cursos='" + cursos + '\'' +
                ", notas=" + Arrays.toString(notas) +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    //Get and Set
    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //Equals e Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return cursos.equals(aluno.cursos) &&
                Arrays.equals(notas, aluno.notas) &&
                nome.equals(aluno.nome) &&
                endereco.equals(aluno.endereco) &&
                telefone.equals(aluno.telefone) &&
                cpf.equals(aluno.cpf);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(cursos, nome, endereco, telefone, cpf);
        result = 31 * result + Arrays.hashCode(notas);
        return result;
    }
}
