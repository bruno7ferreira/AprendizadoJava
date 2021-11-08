package aprendizadoJava.teste.exercicio;

import java.util.Arrays;

public class Agenda {

    //Atributos
    private Contato[] contato;
    private String nome;

    //Métodos
    public void exibirAgenda() {
        System.out.println("Agenda: " + getNome() + " contato=" + Arrays.toString(contato));
    }

    public String obterInfo() {
        String info = "Nome =" + nome + "\n";

        if (contato != null) {
            for (Contato c : contato) {
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }


    @Override
    public String toString() {
        return "Agenda{" +
                "contato=" + Arrays.toString(contato) +
                ", nome='" + nome + '\'' +
                '}';
    }

    //Métodos get and set
    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
