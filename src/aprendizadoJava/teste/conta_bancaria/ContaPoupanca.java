package teste.conta_bancaria;

import java.util.Calendar;
import java.util.Objects;

public class ContaPoupanca extends ContaBancaria {

    //Atributos
    private double diaRendimento = 0.50;

    //Métodos

    public void calcularNovoSaldo2(double taxaRendimento2) {

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento2));
        }


    }

    public double calcularNovoSaldo(double diaRendimento1) {
        diaRendimento = diaRendimento1;
        double novosaldo = diaRendimento + getSaldo();
        System.out.println("Novo saldo = " + novosaldo);
        setSaldo(novosaldo);
        return novosaldo;

    }

    //Construtor
    public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);

    }

    @Override
    public String toString() {
        return "Conta Poupança{" +
                "Nome do Cliente ='" + getNomeCliente() + '\'' +
                ", Número da Conta ='" + getNumConta() + '\'' +
                ", Saldo = " + getSaldo() +
                ", Taxa de Rendimento = " + getDiaRendimento() +
                '}';
    }

    //Métodos Get and Set
    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    //Equal and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ContaPoupanca that = (ContaPoupanca) o;
        return Double.compare(that.diaRendimento, diaRendimento) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diaRendimento);
    }
}
