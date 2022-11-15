package Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio5 extends JFrame implements ActionListener {

    private JLabel label, label2, label3;
    private JTextField textField, textfield2;
    private JButton boton;

    public Ejercicio5(){
        //Layout absoluto
        setLayout(null);

        //Tamaño de la ventana
        setBounds(10,10,800,800);

        //Título
        setTitle("Ejercicio 5");

        //No redimensionable
        setResizable(false);

        //Cerrar proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Etiqueta
        label= new JLabel("Introduce tu usuario");
        label.setBounds(50,50,200,30);
        add(label);

        //JTextField
        textField= new JTextField();
        textField.setBounds(50,100,200,30);
        add(textField);

        //Etiqueta2
        label2= new JLabel("Introduce tu contraseña");
        label2.setBounds(300,50,200,30);
        add(label2);

        //JTextField2
        textfield2= new JTextField();
        textfield2.setBounds(300,100,200,30);
        add(textfield2);

        //Botón
        boton = new JButton("Acceder");
        boton.setBounds(50,150,200,30);
        boton.addActionListener(this);
        add(boton);

        //Etiqueta3
        label3= new JLabel();
        label3.setBounds(50,200,200,30);
        add(label3);

        //Muestro el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton){
            if (textField.getText().equals("jairo")  && textfield2.getText().equals("12345678")) {
                label3.setForeground(Color.green);
                label3.setText("CORRECTO");
                label3.setVisible(true);
            }else{
                label3.setForeground(Color.red);
                label3.setText("INCORRECTO");
                label3.setVisible(true);
                }
            }
        }
    }