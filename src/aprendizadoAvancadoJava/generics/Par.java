package aprendizadoAvancadoJava.generics;

import java.util.Objects;

public class Par<C, V> {

    //Atributos
    private C chave;
    private V valor;


    //Construtor
    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    //Get and Set
    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    //Equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return chave.equals(par.chave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave);
    }
}
