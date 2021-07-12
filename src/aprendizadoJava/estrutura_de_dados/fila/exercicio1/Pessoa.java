package aprendizadoJava.estrutura_de_dados.fila.exercicio1;

public class Pessoa {

    private String nome;
    private int prioridade;

    public Pessoa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
