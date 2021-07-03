package estrutura_de_dados.exercicio_vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 extends Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>(20);

        criarContatosDinamicamente(5, lista);

        int opcao = 1;
        while (opcao != 0) {
            opcao = obterOpcaoMenu(entrada);
        }

        System.out.println("Usuário digitou 0, programa encerrado!");
        switch (opcao) {
            case 1:
                adicionarContato(entrada, lista);
                break;
            case 2:
                obterPosicao(entrada, lista);
                break;
            case 3:
                excluirContato(entrada, lista);
                break;
            case 4:
                consultarLista(lista);
                break;
            case 5:
                excluirTudo(lista);
                break;
            default:
                //sair
                break;
        }

        entrada.close();
    }

    protected static void consultarLista(ArrayList<Contato> lista) {
        System.out.println(lista);
        for (Contato cont : lista) {
            System.out.println(cont);
        }
    }

    protected static void excluirTudo(ArrayList<Contato> lista) {
        lista.clear();
        System.out.println("Você excluiu todos os contatos da lista!!!");
    }

    protected static void excluirContato(Scanner entrada, ArrayList<Contato> lista) {

        int pos = Integer.parseInt(lerInformação("Entre com a posição a ser removida", entrada));
        try {
            lista.remove(pos);
            System.out.println("Contato excluído");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    protected static void obterPosicao(Scanner entrada, ArrayList<Contato> lista) {
        int pos = Integer.parseInt(lerInformação("Entre com a posição a ser pesquisada", entrada));
        try {
            boolean existe = lista.contains(pos);
            //boolean contato = lista.contains(pos);
            System.out.println("Contato existe, segue os dados");
            System.out.println(existe);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }

    }

    private static void adicionarContato(Scanner entrada, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = lerInformação("Entre com o nome", entrada);
        String telefone = lerInformação("Entre com o telefone", entrada);
        String email = lerInformação("Entre com e-mail", entrada);

        Contato contato = new Contato(nome, telefone, email);
        lista.add(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);

    }

    protected static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
        Contato contato;
        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();
            contato.setId(i);
            contato.setNome("C" + i);
            contato.setTelefone(i + " 1111-1111");
            contato.setEmail(i + "@mail.com");
            lista.add(contato);
        }

    }

    protected static int obterOpcaoMenu(Scanner entrada) {

        boolean entradaValida = false;
        int opcao = 0;
        String input;

        while (!entradaValida) {
            System.out.println("Escolha a opção desejada:");
            System.out.println("1-Adicionar Contato, 2-Consultar Contato, 3-Deletar Contato," +
                    " 4-Informa lista completa, 5-Excluir lista completa, 0-Sair");

            try {
                input = entrada.nextLine();
                opcao = Integer.parseInt(input);
                System.out.println("Atualizado!");

                if (opcao >= 0 && opcao <= 5) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida digite novamente!\n\n");
            }
        }

        return opcao;
    }

    protected static String lerInformação(String mensagem, Scanner entrada) {
        System.out.println(mensagem);
        String scan = entrada.nextLine();
        return scan;
    }
}
