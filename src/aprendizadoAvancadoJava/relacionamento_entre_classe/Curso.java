package aprendizadoAvancadoJava.relacionamento_entre_classe;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    //atributos
    private String nome;
    final List<Aluno> alunos = new ArrayList<>();


    //Métodos
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    //Construtor
    public Curso(String nome) {
        this.nome = nome;

    }


    //get and set
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "" + nome + "";
    }
}
