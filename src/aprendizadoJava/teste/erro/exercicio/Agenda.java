package teste.erro.exercicio;

import java.util.Arrays;

public class Agenda {

    //Atributos
    private Contato contato[];


    //Métodos
    public void adicionarContato(Contato c) throws AgendaCheiaExeption {
        boolean cheia = true;
        for (int cont = 0; cont < contato.length; cont++) {
            if (contato[cont] == null) {
                contato[cont] = c;
                cheia = false;
                break;
            }
        }
        if (cheia) {
            throw new AgendaCheiaExeption();
        }

    }

    public int consultarContato(String nome) throws ContatoNaoExisteException {

        for (int cont = 0; cont < contato.length; cont++) {

            if (contato[cont] != null) {
                if (contato[cont].getNome().equalsIgnoreCase(nome)) {
                    return -1;
                }

            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    //Construtor
    public Agenda(Contato[] contato) {
        this.contato = contato;
    }

    public Agenda() {
        contato = new Contato[5];
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato c : contato) {
            if (c != null) {
                s += c.toString() + "\n";
            }
        }
        return s;
    }


}
