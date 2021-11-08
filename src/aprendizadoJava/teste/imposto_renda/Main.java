package aprendizadoJava.teste.imposto_renda;

public class Main {

    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica("Bruno", 5000, "123456789");

        PessoaJuridica p2 = new PessoaJuridica("Ferreira Company", 15000, "987654321");

        System.out.println(p1.getSalario());
        p1.descontoImposto();
        System.out.println(p1.getSalario());

        System.out.println(p2.getSalario());
        p2.descontoImposto();
        System.out.println(p2.getSalario());

        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = p1;
        pessoas[1] = p2;

        for (Pessoa cont : pessoas) {
            System.out.println(cont.toString());
        }

    }

}
