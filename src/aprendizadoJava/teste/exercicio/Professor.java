package aprendizadoJava.teste.exercicio;

public class Professor extends Pessoa {

    //Atributos
    private String departamento;
    private String nomeCurso;
    private double salario;

    //Métodos
    public double calcularSalarioLiquido(double salario) {
        return salario;
    }

    public String obterEtiqueEndereco() {
        String s = "Endereço do Professor:  ";
        s += getEndereco();
        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(getEndereco());
    }

    //Construtor
    public Professor(String nome, String endereco, String telefone, String cpf, String departamento, String nomeCurso, Double salario) {
        super(nome, endereco, telefone, cpf);
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "departamento='" + departamento + '\'' +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", salario=" + salario +
                '}';
    }

    // Get and Set
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
