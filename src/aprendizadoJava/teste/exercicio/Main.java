package teste.exercicio;

public class Main {

    public static void main(String[] args) {

        Contato c1 = new Contato();

        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("66");
        telefone.setNumero("9 9907-1446");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casar");
        telefone2.setDdd("66");
        telefone2.setNumero("9 9907-xxxx");

        Telefone[] tel1 = new Telefone[2];

        tel1[0] = telefone;
        tel1[1] = telefone2;


        c1.setNome("Bruno");

        Endereco end1 = new Endereco();
        end1.setNomeRua("Comendador Henrique");
        end1.setCidade("Cuiabá");
        end1.setCep("78015-050");
        end1.setEstado("Mato Grosso");
        end1.setNumero("517");
        c1.setTelefones(tel1);
        c1.setEndereco(end1);
        if (c1 != null && c1.getTelefones() != null) {
            for (Telefone t : c1.getTelefones()) {
                c1.fichaContato();
            }
        }


        //----------

        Endereco end2 = new Endereco();
        end2.setNumero("15");
        end2.setEstado("DF");
        end2.setCep("72662-402");
        end2.setNomeRua("QD 311 Conjunto 02");
        end2.setCidade("Recanto das Emas");

        Telefone[] tel2 = new Telefone[2];

        tel2[0] = telefone;
        tel2[1] = telefone2;

        Contato c2 = new Contato("Rogério", end2, tel2);

        System.out.println("()()()()()");
        if (c2 != null && c2.getTelefones() != null) {
            for (Telefone t : c2.getTelefones()) {
                c2.fichaContato();
            }
        }
        //c2.fichaContato();


    }

}
