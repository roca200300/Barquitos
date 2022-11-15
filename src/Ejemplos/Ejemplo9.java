package Ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo9 extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu menu1, menu2, menu3;
    JMenuItem menuItem21, menuItem22, menuItem31, menuItem32;

    public Ejemplo9() {
        /* Creamos el JMenuBar y lo asociamos con el JFrame */
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        /* Creamos el primer JMenu y lo pasamos como parámetro al JMenuBar mediante el método add */
        menu1 = new JMenu("Opciones");
        menuBar.add(menu1);

        /* Creamos el segundo y tercer objetos de la clase JMenu y los asociamos con el primer JMenu creado */
        menu2 = new JMenu("Tamaño de la ventana");
        menu1.add(menu2);
        menu3 = new JMenu("Color de fondo");
        menu1.add(menu3);

        /* Creamos los dos primeros objetos de la clase JMenuItem y los asociamos con el segundo JMenu */
        menuItem21 = new JMenuItem("640*480");
        menu2.add(menuItem21);
        menuItem21.addActionListener(this);
        menuItem22 = new JMenuItem("1024*768");
        menu2.add(menuItem22);
        menuItem22.addActionListener(this);

        /* Creamos los otros dos objetos de la clase JMenuItem y los  asociamos con el tercer JMenu */
        menuItem31 = new JMenuItem("Rojo");
        menu3.add(menuItem31);
        menuItem31.addActionListener(this);
        menuItem32 = new JMenuItem("Verde");
        menu3.add(menuItem32);
        menuItem32.addActionListener(this);

        //COnfigurar y mostrar JFrame
        initPantalla();

    }

    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Ejemplo 9"); //Título del JFrame
        setSize(300, 200); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    /* Método que implementa las acciones de cada ítem de menú */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItem21) {
            setSize(640, 480);
        }
        if (e.getSource() == menuItem22) {
            setSize(1024, 768);
        }
        if (e.getSource() == menuItem31) {
            getContentPane().setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == menuItem32) {
            getContentPane().setBackground(new Color(0, 255, 0));
        }
    }

    public static void main(String[] args) {
        new Ejemplo9();
    }
}