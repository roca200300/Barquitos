package Ejemplos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo1 extends JFrame implements ActionListener {

    JButton boton;//declaracion del boton

    public Ejemplo1(){

        //Asignarle un layout absoluto
        setLayout(null);

        //Posición y tamaño de la ventana
        setBounds(0,0, 450,350);

        //Título
        setTitle("Ejemplo 1: Botón");

        //No redimensionable
        setResizable(false);

        //Cerrar la aplicación al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //TODO Creación del botón
        //el "to do" ese sirve para dejar marcado asuntos pendientes
        boton = new JButton("Finalizar");

        //Posición y dimension del boton
        boton.setBounds(300,250, 100,30);

        //Añado el boton al JFrame
        add(boton);

        //Añado el action listener al boton
        boton.addActionListener(this);

        //Muestra el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejemplo1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Si he pulsado el botón
        if (e.getSource()== boton){
            //Salgo de la aplicacion
            System.exit(0);
        }
    }
}