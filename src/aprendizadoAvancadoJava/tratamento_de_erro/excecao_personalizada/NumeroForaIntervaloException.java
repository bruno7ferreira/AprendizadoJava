package aprendizadoAvancadoJava.tratamento_de_erro.excecao_personalizada;

@SuppressWarnings("Serial")
public class NumeroForaIntervaloException extends RuntimeException {

    private String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
    }
}
