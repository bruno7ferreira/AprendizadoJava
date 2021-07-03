package projetoCarro;


public abstract class Carro {

    //Atributos
    protected String nome;
    protected int potencia;
    protected double cilindradaMotor;

    protected boolean ligado = false;
    protected int velocidade = 0;


    protected static final int IDCARRO = (int) (Math.random() * 100);

    protected static int VELOCIDADE_MAXIMA;

    protected int deltaAcelerador = 10;
    protected int deltaFreiar = 10;


    //Métodos
    public void acelerarCarro() {
        try {
            if (ligado) {
                velocidade += deltaAcelerador;
            } else {
                System.out.println("ERRO! Carro está desligado!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void freiarCarro() {
        if (velocidade > 0) {
            if (velocidade >= 10) {
                velocidade -= deltaFreiar;
                if (velocidade < 0) {
                    velocidade = 0;
                }

            } else {
                velocidade = 0;
            }

        }
        System.out.println("Carro Parado!");

    }

    public void ligarCarro() {
        try {
            if (!ligado) {
                ligado = true;
                System.out.println("Carro foi ligado!");
            } else {
                System.out.println("ERRO! Carro já está ligado!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void desligarCarro() {
        try {
            if (ligado) {
                if (velocidade == 0) {
                    ligado = false;
                    System.out.println("Carro parado!");
                } else {
                    System.out.println("Não foi possível deligar, pare o Carro!");
                }
            } else {
                System.out.println("Carro já está desligado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //Métodos Especiais ----------------------------------------------------------------------------------

    //Construtor
    public Carro(String nome) {
        this.nome = nome;
        VELOCIDADE_MAXIMA = 200;

        //this.IDCARRO = (int) (Math.random() * 100);
    }

    //Get and Set
    public String getNome() {
        return nome;
    }

    public int getPotencia() {
        return potencia;
    }

    public double getCilindradaMotor() {
        return cilindradaMotor;
    }

    public static int getIDCARRO() {
        return IDCARRO;
    }

    public int getVelocidade() {
        System.out.println(velocidade + "Km/h");
        return velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public int getDeltaAcelerador() {
        return deltaAcelerador;
    }

    public void setDeltaAcelerador(int deltaAcelerador) {
        this.deltaAcelerador = deltaAcelerador;
    }

    public int getDeltaFreiar() {
        return deltaFreiar;
    }

    public void setDeltaFreiar(int deltaFreiar) {
        this.deltaFreiar = deltaFreiar;
    }
}
