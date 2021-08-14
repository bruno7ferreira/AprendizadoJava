package aprendizadoAvancadoJava.swing;

import javax.swing.*;
import java.awt.*;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador"); //Instancia um objeto do time janela
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // define a ação ao clicar em fechar a janela
        janela.setSize(600, 200); //definindo tamanho da janela
        janela.setLayout(new FlowLayout()); // definindo um layout padrao
        janela.setLocationRelativeTo(null); // centraliza a janela na tela do computador

        JButton botao = new JButton("Clicar!"); //criando um botao
        janela.add(botao);

        botao.addActionListener(e -> {
            System.out.println("O evento ocorreu!");
        });

        janela.setVisible(true); // setVisible = altera a visibilidades
    }

}
