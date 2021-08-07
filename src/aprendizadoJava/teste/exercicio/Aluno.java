package aprendizadoJava.teste.exercicio;


public class Aluno extends Pessoa {

    //Atributos
    private String cursos;
    private double notas;

    //Métodos
    public double calcularMedia(double notas) {
        double media = notas / 1;
        return media;
    }

    public String obterEtiqueEndereco() {
        String s = "Endereço do Aluno: ";
        s += getEndereco();
        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(getEndereco());
    }

    public String verificarAprovado() {
        String resultado = "";

        if (notas >= 7) {
            System.out.println("Está aprovado");
        } else {
            System.out.println("Está reprovado");
        }
        return resultado;
    }

    //Construtor
    public Aluno(String nome, String endereco, String telefone, String cpf, String cursos, Double notas) {
        super(nome, endereco, telefone, cpf);
        this.cursos = cursos;
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "cursos='" + cursos + '\'' +
                ", notas=" + notas +
                '}';
    }

    //Get and Set
    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }
}
