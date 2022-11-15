package Ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3 extends JFrame implements ActionListener {

    JButton boton1, boton2;
    JLabel label;

    public Ejercicio3(){
        setLayout(null);
        setBounds(10,10, 410,210);
        setTitle("Ejercicio 3");
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Esta es la ventana principal");
        label.setBounds(115,60,200,30);
        add(label);

        boton1 = new JButton("Carne");
        boton1.setBounds(105,110,200,40);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Pescado");
        boton2.setBounds(105,140,200,40);
        add(boton2);
        boton2.addActionListener(this);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Ejercicio3();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== boton1){
            Ejercicio3Secundaria secundaria1 = new Ejercicio3Secundaria(this,true,"carne");
            secundaria1.setVisible(true);
        } else if (e.getSource()==boton2) {
            Ejercicio3Secundaria secundaria2 = new Ejercicio3Secundaria(this,true,"pescado");
            secundaria2.setVisible(true);
        }
    }
}
