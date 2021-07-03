package estrutura_de_dados.vetores;

import java.util.Arrays;

public class Vetor {

    //Atributos
    private String[] elementos;
    private int tamanho;

    //Construtor
    public Vetor(int elementos) {
        this.elementos = new String[elementos];
        this.tamanho = 0;
    }

    //Métodos
    //Usando Exceção
    public void adicionar(String elemento) throws Exception {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio ERRO ao adicionar");
        }
    }


    public boolean adicionar(int posicao, String elemento) {
        this.aumentarCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        //Movendo os elementos
        for (int cont = this.tamanho - 1; cont >= posicao; cont--) {
            this.elementos[cont + 1] = this.elementos[cont];
            if (posicao > this.tamanho) {

            }

        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int cont = 0; cont < this.elementos.length; cont++) {
                elementosNovos[cont] = this.elementos[cont];
            }
            this.elementos = elementosNovos;
        }
    }


    public int busca(String elemento) {

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {

                return i;
            }
        }
        return -1;
    }

    public void remover(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int cont = posicao; cont < this.tamanho - 1; cont++) {
            this.elementos[cont] = this.elementos[cont + 1];
        }
        this.tamanho--;
    }


    /*
    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

     */

    //ToString
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int cont = 0; cont < this.tamanho - 1; cont++) {
            s.append(this.elementos[cont]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();

    }

    //get and set
    public int getTamanho() {
        return this.tamanho;
    }


    //Usando boolean
    /*
    public boolean adicionar1(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    */

    /*
    public void adiciona(String elemento) {
        for (int cont = 0; cont < elemento.length(); cont++) {
            if (this.elementos[cont] == null) {
                this.elementos[cont] = elemento;
                break;
            }
        }

    }
    */


}
