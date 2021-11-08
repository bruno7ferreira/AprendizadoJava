package aprendizadoJava.teste.exercicio;

public class MainSistemaExercicio40 {

    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa("Bruno", "Cuiabá", "1111-1111", "123");
        Pessoa aluno = new Aluno("Rogério", "Recanto", "2222-2222", "789", "TI", 10.0);
        Pessoa professor = new Professor("Ferreira", "Portugal", "3333-3333", "456", "Negocios", "investimento", 15000.00);


        //System.out.println(pessoa.obterEtiqueEndereco());
        System.out.println(aluno.obterEtiqueEndereco());
        System.out.println(professor.obterEtiqueEndereco());

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}
