package aprendizadoAvancadoJava.tratamento_de_erro;


public class Aluno {

    //atributos
    public String nome;
    public Double nota;


    //construtor
    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }


    @Override
    public String toString() {
        return
                "Nome: " + nome + " nota:" + nota + "";
    }
}
