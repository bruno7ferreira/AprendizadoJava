package teste.conta_bancaria;

public class ContaEspecial extends ContaBancaria {

    //Atributos
    private double limite;

    //Métodos

    @Override
    public double sacar(double saque) {

        double novoSaldo;
        if (saque > limite) {
            System.out.println("ERRO! O valor do saque é maior que o limite.");
        } else {
            novoSaldo = getSaldo() - saque;
            setSaldo(novoSaldo);
            System.out.println("Extrato do saldo após o saque: " + getSaldo());
        }

        return getSaldo();
    }


    @Override
    public String toString() {
        return "Conta Especial{" +
                "Nome do Cliente ='" + getNomeCliente() + '\'' +
                ", Número da Conta ='" + getNumConta() + '\'' +
                ", Saldo = " + getSaldo() +
                '}';
    }


    //Construtor
    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    //Get and Set
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
