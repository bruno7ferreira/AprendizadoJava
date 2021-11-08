package aprendizadoJava.teste.exercicio;

public class Contador {

    //Atributos
    public static int cont;

    //Métodos
    public int zerarContador() {
        return cont = 0;
    }

    public int incrementarContador() {
        return cont++;
    }

    public void retornarContador() {
        System.out.println(cont);
    }

    //Contrutor
    public Contador() {
        cont++;
    }

    

}
