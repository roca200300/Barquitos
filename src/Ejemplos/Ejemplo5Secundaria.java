package Ejemplos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo5Secundaria extends JDialog implements ActionListener {

    JButton boton;
    JLabel label;
    /*El primer parámetro le dice quien es su padre*/
    /*El segundo le dice si el modal es true or false*/
    /*El modal indica si puedo volver a la ventana padre sin cerrar la secundaria(false) o no(true)*/
    public Ejemplo5Secundaria(Ejemplo5Principal parent, boolean modal){

        //Invoco a la clase superior
        super(parent,modal);

        //Asignarle un layout absoluto
        setLayout(null);

        //Posición y tamaño de la ventana
        setBounds(430,10, 410,210);

        //Título
        setTitle("Ejemplo 5: Diálogos modales");

        //No redimensionable
        setResizable(false);

        //Etiqueta
        label = new JLabel("Esta es la ventana secundaria");
        label.setBounds(115,60,200,30);
        add(label);

        //Botón
        boton = new JButton("Volver");
        boton.setBounds(105,110,200,40);
        add(boton);
        boton.addActionListener(this);

        //TODO acción del botón

        //Muestro el JDialog
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== boton){
            setVisible(false);//Oculta la ventana secundaria
        }

    }
}

