package aprendizadoJava.excecao;

import java.util.stream.Stream;


public class NumeroNegativoException extends RuntimeException {

    private String nomeDoAtributo;

    NumeroNegativoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;

    }

    public String getMenssage() {
        return String.format("O atributo %s está negativo", nomeDoAtributo);
    }
}
