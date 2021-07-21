package aprendizadoAvancadoJava.stream_api;

public class Aluno {

    final private String nome;
    final private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }


    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "nome= " + nome +
                ", nota= " + nota;
    }
}
