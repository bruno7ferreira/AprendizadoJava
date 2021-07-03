package teste.teste_aleatorios;

public class ClassesAninhadas {

    public static class Externa {

        private String texto = "Texto externo";

        public class Interna {

            private String texto = "Texto interno";

            public void imprimeTexto() {
                System.out.println(texto);

                System.out.println(Externa.this.texto);
            }

        }


    }

    public static void main(String[] args) {

        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();

        interna.imprimeTexto();



    }

}
