package Practica2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica2 extends JFrame {
    CardLayout tarjetas;
    JLabel bienvenida, instruccion, instrucciones;
    JButton next;
    JPanel formulario;

    public Practica2(){

        //Centro el JFrame en la pantalla
        setLocationRelativeTo(null);

        //Inicializo un border layout para el JFrame
        setLayout(new BorderLayout());

        //Creo dos panel para el botón superior con fondo rojo
        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(Color.RED);

        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(Color.BLACK);

        //Añado un botón para intercambiar tarjetas y le añado el action listener
        JLabel bienvenida = new JLabel("BIENVENIDO");
        JButton next = new JButton("NEXT");

        //Añado el ActionListener al botón
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                next.next(formulario);
            }
        });

        //Añado el botón al panel de pestañas
        panelSuperior.add(bienvenida);
        panelInferior.add(next);

        //Añado el panel de pestañas a la parte superior del JFrame
        add(panelSuperior,BorderLayout.NORTH);
        add(panelInferior,BorderLayout.SOUTH);

        //Las Instrucciones
        JLabel instruccion= new JLabel("INSTRUCCIONES DE FORMULARIO");
        instruccion.setBounds();

        //Siguiente pestaña
        JPanel formulario = new JPanel();



        initTarjetas();
        initPantalla();
    }
    private void initTarjetas(){

    }
    private void initPantalla() {
        setTitle("Practica"); //Título del JFrame
        setSize(400,300); //Dimensiones del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    public static void main(String[] args) {
        new Practica2();
    }

}