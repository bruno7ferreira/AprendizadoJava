package aprendizadoJava._enum;

public class TesteEnum {

    public static void main(String[] args) {

        DiaDaSemanaEnum[] dias = DiaDaSemanaEnum.values();

        for (DiaDaSemanaEnum cont : dias
        ) {
            System.out.println(cont);
        }

    }


}
