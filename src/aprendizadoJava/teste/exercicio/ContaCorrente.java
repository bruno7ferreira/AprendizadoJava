package teste.exercicio;

import org.w3c.dom.ls.LSOutput;

public class ContaCorrente {

    //Atributos
    private int numeroConta;
    private double saldoConta;
    private boolean chequeEspecial;
    private double limite;

    //Métodos
    public double depositarDinheiro(double deposito) {
        return saldoConta += deposito;
    }

    public double consultarSaldo() {
        System.out.println("O saldo da conta é " + saldoConta);
        return saldoConta;
    }

    public boolean ativarChequeEspecial() {
        chequeEspecial = true;
        return chequeEspecial;
    }

    public boolean desativarChequeEspecial() {
        chequeEspecial = false;
        return chequeEspecial;
    }

    public boolean verificarChequeEspecial() {
        if (chequeEspecial) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
        return chequeEspecial;
    }


    public void statusConta() {
        System.out.println("*Conta Corrente* { " +
                "Numero da Conta= " + numeroConta +
                ", Saldo da Conta= " + saldoConta +
                ", Cheque Especial= " + chequeEspecial +
                ", Limite =" + limite +
                '}');
    }


    //Métodos Construtor
    public ContaCorrente(int numeroConta, double saldoConta, boolean chequeEspecial, double limite) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.chequeEspecial = chequeEspecial;
        this.limite = limite;
    }

    //Métodos Get and Set
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isPessoaEspecial() {
        return chequeEspecial;
    }

    public void setPessoaEspecial(boolean pessoaEspecial) {
        this.chequeEspecial = pessoaEspecial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
