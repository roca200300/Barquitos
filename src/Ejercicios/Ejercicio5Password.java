package Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio5Password extends JFrame implements ActionListener {

    JLabel labelUsuario, labelPassword, labelResultado;
    JTextField textFieldUsuario;
    JPasswordField passwordField;
    JButton boton;

    String usuario = "jairo";
    String password = "12345678";
    public Ejercicio5Password(){

        //Layout
        initLayout();

        //Etiqueta
        labelUsuario = new JLabel("Usuario:");
        labelUsuario.setBounds(50,50,300,30);
        add(labelUsuario);

        //JTextField
        textFieldUsuario = new JTextField();
        textFieldUsuario.setBounds(50,80,300,30);
        add(textFieldUsuario);

        //Etiqueta
        labelPassword = new JLabel("Contraseña:");
        labelPassword.setBounds(50,110,300,30);
        add(labelPassword);

        //JPasswordField
        passwordField = new JPasswordField();
        passwordField.setBounds(50,140,300,30);
        add(passwordField);

        //Botón
        boton = new JButton("Enviar");
        boton.setBounds(50,185,300,30);
        boton.addActionListener(this);
        add(boton);

        //Etiqueta
        labelResultado = new JLabel("Introduce los datos y pulsa en Enviar");
        labelResultado.setBounds(50,230,300,30);
        add(labelResultado);

        setVisible(true);

    }

    private void initLayout(){

        //Layout absoluto
        setLayout(null);

        //Tamaño de la ventana
        setBounds(10,10,800,600);

        //Título
        setTitle("Ejercicio 5");

        //No redimensionable
        setResizable(false);

        //Cerrar proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Ejercicio5Password();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton){
            String clave = new String(passwordField.getPassword());
            if (textFieldUsuario.getText().equals(usuario) && clave.equals(password)){
                labelResultado.setText("Correcto");
                labelResultado.setForeground(Color.GREEN);
            }
            else{
                labelResultado.setText("Incorrecto");
                labelResultado.setForeground(Color.RED);
            }
        }
    }
}