package aprendizadoJava.teste.modular.operacao.interno;

import aprendizadoJava.teste.modular.operacao.Operacao;

public class Multiplicacao implements Operacao {

    @Override
    public int executar(int a, int b) {
        return a * b;
    }
}
