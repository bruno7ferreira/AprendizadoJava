package aprendizadoJava.teste.conta_bancaria;

import java.util.Objects;

public abstract class ContaBancaria {

    //Atributos
    private String nomeCliente;
    private String numConta;
    private double saldo;

    //Métodos
    public double sacar(double saque) {
        System.out.println("Valor sacado " + saque);

        return saldo = saldo - saque;
    }

    public double deposito(double deposito) {
        System.out.println("Valor depositado");
        return saldo = saldo + deposito;
    }

    //Construtor
    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //Get and Set
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    //Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaBancaria that = (ContaBancaria) o;
        return Double.compare(that.saldo, saldo) == 0 &&
                nomeCliente.equals(that.nomeCliente) &&
                numConta.equals(that.numConta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCliente, numConta, saldo);
    }
}
