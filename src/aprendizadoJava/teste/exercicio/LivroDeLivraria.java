package aprendizadoJava.teste.exercicio;

import teste.exercicio.Livro;

public class LivroDeLivraria extends Livro {

    private int numerosPaginas;

    public LivroDeLivraria(String titulo) {
        super(titulo);
    }

    public int getNumerosPaginas() {
        return numerosPaginas;
    }

    public void setNumerosPaginas(int numerosPaginas) {
        this.numerosPaginas = numerosPaginas;
    }

    @Override
    public String toString() {
        return "LivroDeLivraria{" +
                "numerosPaginas=" + numerosPaginas +
                '}';
    }

    public LivroDeLivraria(String titulo, int numerosPaginas) {
        super(titulo);
        this.numerosPaginas = numerosPaginas;
    }
}
