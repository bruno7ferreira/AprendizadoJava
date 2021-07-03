package aprendizadoAvancadoJava.relacionamento_entre_classe;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    //atributos
    private String nome;
    final List<Curso> cursos = new ArrayList<>();


    //Métodos
    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);

    }

    public Curso obterCurso(String nome) {
        for (Curso i : this.cursos) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return null;
    }

    //construtor
    public Aluno(String nome) {
        this.nome = nome;

    }

    //get and set
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return
                "" + nome + "";
    }
}
