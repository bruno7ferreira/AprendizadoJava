package aprendizadoJava.lambda.interface_funcional;

public class MainPrincipalPadrao {

    public static void main(String[] args) {

        Subtracao menos = new Subtracao();
        System.out.println(menos.getNome() + " - " + menos.executar(10, 5));

        Somar mais = new Somar();
        System.out.println(mais.getNome() + " + " + mais.executar(10, 5));

        Divisao divi = new Divisao();
        System.out.println(divi.getNome() + " / " + divi.executar(10, 5));

        Multiplicar vezes = new Multiplicar();
        System.out.println(vezes.getNome() + " x " + vezes.executar(10, 5));


    }
}
