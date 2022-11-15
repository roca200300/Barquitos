package Ejercicios;

import javax.swing.*;

public class Ejercicio3Secundaria extends JDialog {

    JLabel label1;

    public Ejercicio3Secundaria(Ejercicio3 parent, boolean modal, String texto){
        super(parent,modal);

        setLayout(null);

        setBounds(430,10, 410,210);

        setTitle("Ejercicios.Ejercicio3");

        setResizable(false);

        label1 = new JLabel(texto);
        label1.setBounds(115,60,200,30);
        add(label1);

        setVisible(true);
    }
}
