package aprendizadoJava.teste.conta_bancaria;

public class Main {

    public static void main(String[] args) {

        ContaPoupanca poupanca = new ContaPoupanca("Bruno", "0000",
                100000.00);

        ContaEspecial corrente = new ContaEspecial("Rogério", "7777",
                500000.00, 200000.00);

        System.out.println(poupanca.getSaldo());
        poupanca.sacar(100);
        System.out.printf("Saldo da conta: %.2f ", poupanca.getSaldo());

        System.out.println();

        System.out.println(corrente.getSaldo());
        corrente.sacar(500);
        System.out.printf("Saldo da conta: %.2f ", corrente.getSaldo());

        corrente.deposito(100);
        poupanca.deposito(50);

        System.out.println("-----");

        System.out.printf("Saldo da conta: %.2f \n", corrente.getSaldo());
        System.out.printf("Saldo da conta: %.2f \n", poupanca.getSaldo());
        System.out.println("");
        System.out.println(poupanca.getSaldo());
        poupanca.calcularNovoSaldo(50);
        System.out.println(poupanca.getSaldo());
        System.out.println("#######");
        System.out.println(corrente.toString());
        System.out.println(poupanca.toString());
        System.out.println();
        poupanca.calcularNovoSaldo2(10);
        System.out.println(poupanca.getSaldo());

    }

}
