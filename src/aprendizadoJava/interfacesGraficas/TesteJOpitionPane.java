package aprendizadoJava.interfacesGraficas;

import javax.swing.*;

public class TesteJOpitionPane {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Informe o seu Nome");
        JOptionPane.showMessageDialog(null, nome + " YES!");
        JOptionPane.showMessageDialog(null, "Good!!");

    }
}
