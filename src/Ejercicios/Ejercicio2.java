package Ejercicios;

import javax.swing.*;

public class Ejercicio2 extends JFrame {
    JButton boton1, boton2, boton3;

    public Ejercicio2() {
        setLayout(null);
        setBounds(0,0, 400,400);

        boton1 = new JButton("Alejandro");
        boton2 = new JButton("Andrés");
        boton3 = new JButton("Armando");

        boton1.setBounds(10,10,90,30);
        boton2.setBounds(10,40,90,30);
        boton3.setBounds(10,70,90,30);

        add(boton1);
        add(boton2);
        add(boton3);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}