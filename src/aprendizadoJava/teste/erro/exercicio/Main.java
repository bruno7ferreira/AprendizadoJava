package teste.erro.exercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(entrada);
            if (opcao == 1) {
                consultarContato(entrada, agenda);
            } else if (opcao == 2) {
                adicionarContato(entrada, agenda);
            }
        }

        entrada.close();
    }

    public static void adicionarContato(Scanner entrada, Agenda agenda) {
        System.out.println("Criando um contato, entre com as informações");

        try {
            //Scanner entrada;
            String nome = leInformacaoString(entrada, "Entre com o nome do contato a ser pesquisado");
            String telefone = leInformacaoString(entrada, "Entre com o telefone do contato a ser pesquisado");
            String email = leInformacaoString(entrada, "Entre com o e-mail do contato a ser pesquisado");

            Contato contato = new Contato("Bruno", "9999-9999", "bruno@email.com");

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaExeption e) {
            System.out.println(e.getMenssage());
            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }


    }

    public static void consultarContato(Scanner entrada, Agenda agenda) {
        String nomeContato = leInformacaoString(entrada, "Entre com o nome do contato a ser pesquisado");
        try {
            if (agenda.consultarContato(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            e.printStackTrace();
            System.out.println(e.getMenssage());
        }
    }

    public static String leInformacaoString(Scanner entrada, String msg) {
        System.out.println(msg);
        String entradaInfo = entrada.nextLine();
        return entradaInfo;
    }

    public static int obterOpcaoMenu(Scanner entrada) {

        boolean entradaValida = false;
        int opcao = 3;
        while (!entradaValida) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1- Para consultar ");
            System.out.println("2- Para adicionar um contato na agenda ");
            System.out.println("3- Para sair ");

            try {
                String entradaDado = entrada.nextLine();
                opcao = Integer.parseInt(entradaDado);
                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else if (opcao == 1 || opcao == 2 || opcao != 3) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n");
            }

        }

        return opcao;
    }

}
