package aprendizadoAvancadoJava.relacionamento_entre_classe;

public class MainCurso {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Bruno Rogério");
        Aluno aluno2 = new Aluno("Kobe Bryant");
        Aluno aluno3 = new Aluno("Michael Schumacher");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Spring boot");
        Curso curso3 = new Curso("Hipernate");

        curso1.adicionarAluno(aluno1);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno1);


        System.out.println("Aluno cadastrados no curso de " + curso1 + " : " + curso2.alunos);
        System.out.println("Aluno " + aluno3.getNome() + " está cadastrado nos cursos de: " + aluno3.cursos);

        Curso cursoEncontrado = aluno1.obterCurso("Spring boot");
        if (cursoEncontrado != null) {
            System.out.println("-> " + cursoEncontrado.alunos);
        }


    }
}
