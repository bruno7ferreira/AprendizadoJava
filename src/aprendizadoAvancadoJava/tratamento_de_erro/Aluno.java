package aprendizadoAvancadoJava.tratamento_de_erro;


import java.util.ArrayList;
import java.util.List;

public class Aluno {

    //atributos
    public String nome;


    //construtor
    public Aluno(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return
                "" + nome + "";
    }
}
