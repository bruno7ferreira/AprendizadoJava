package aprendizadoJava.teste.exercicio;

import java.util.Scanner;

public class MainTesteAgenda {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome da agenda:");
        String nome = entrada.nextLine();


        Agenda a1 = new Agenda();
        a1.setNome(nome);

        Contato[] contatos = new Contato[3];
        for (int cont = 0; cont < 3; cont++) {
            System.out.println("Entre com as informações do contato " + (cont + 1));
            Contato c = new Contato();
            System.out.println("Informe o nome:");
            nome = entrada.nextLine();

            System.out.println("Informe o telefone:");
            String phone = entrada.nextLine();
            c.setPhone(phone);

            System.out.println("Informe o e-mail:");
            String email = entrada.nextLine();
            c.setEmail(email);

            contatos[cont] = c;
        }
        a1.setContato(contatos);

        if (a1 != null) {
            System.out.println(a1.obterInfo());
        }


        entrada.close();
    }
}
