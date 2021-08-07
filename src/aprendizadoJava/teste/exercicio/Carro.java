package aprendizadoJava.teste.exercicio;

public class Carro {

    //Atributos
    private String fabricante;
    private String modelo;
    private int potencia;
    private int ano;
    private boolean ligado;
    public double torque;

    //Métodos
    public double aumentarTorque() {
        return torque;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    int aumentarPotencia(int p) {
        //potencia += 10;
        return potencia += 10;
    }

    public boolean ligarCarro() {
        ligado = true;
        System.out.println("CarroExemplo ligado");
        return ligado;
    }

    public void desligarCarro() {
        this.ligado = false;
        System.out.println("CarroExemplo desligado");
    }

    public void status(String status) {
        System.out.println(ligado);
    }

    @Override
    public String toString() {
        return "CarroExemplo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                ", ano=" + ano +
                '}';
    }

    //Método construtor
    public Carro(String fabricante, String modelo, int potencia, int ano) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.potencia = potencia;
        this.ano = ano;
    }

    public Carro() {

    }

    public Carro(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //Métodos Get and Set
    public boolean isLigado() {
        return ligado;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}
