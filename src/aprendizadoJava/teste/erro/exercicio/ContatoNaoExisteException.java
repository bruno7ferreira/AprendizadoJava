package aprendizadoJava.teste.erro.exercicio;

public class ContatoNaoExisteException extends Exception {

    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;

    }

    public String getMenssage() {
        return "Contato " + nomeContato + " não existe na agenda!";
    }

}
