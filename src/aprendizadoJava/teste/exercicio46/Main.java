package aprendizadoJava.teste.exercicio46;

public class Main {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        quadrado.setNome("Quadrado");

        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.setNome("Circulo");

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(3);
        triangulo.setNome("Triangulo");

        Cubo cubo = new Cubo();
        cubo.setLado(3);
        cubo.setNome("Cubo");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(3);
        cilindro.setRaio(2);
        cilindro.setNome("Cilindro");

        Piramide piramide = new Piramide();
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setNumPoliBase(4);
        piramide.setBase(quadrado);
        piramide.setNome("Piramide");

        FiguraGeometrica[] figuraGeometrica = new FiguraGeometrica[6];
        figuraGeometrica[0] = quadrado;
        figuraGeometrica[1] = circulo;
        figuraGeometrica[2] = triangulo;
        figuraGeometrica[3] = cubo;
        figuraGeometrica[4] = cilindro;
        figuraGeometrica[5] = piramide;

        for (FiguraGeometrica cont : figuraGeometrica) {
            System.out.println("--------------");
            System.out.println(cont.getNome());
            if (cont instanceof Figura2D) {
                Figura2D f2d = (Figura2D) cont;
                System.out.println(f2d.calcularArea());

            } else if (cont instanceof Figura3D) {
                Figura3D f3d = (Figura3D) cont;
                System.out.println(f3d.calcularArea());
                System.out.println(f3d.calcularVolume());
            }

        }


    }
}
