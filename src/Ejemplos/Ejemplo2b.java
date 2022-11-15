package Ejemplos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo2b extends JFrame implements ActionListener {

    JButton[] botones = new JButton[3];
    int posicionx = 10;

    public Ejemplo2b(){
        //Asignarle un layout absoluto
        setLayout(null);

        //Posición y tamaño de la ventana
        setBounds(0,0, 350,200);

        //Título
        setTitle("Ejemplo 1: Botón");

        //No redimensionable
        setResizable(false);

        //Cerrar la aplicación al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Recorro el Array de botones
        for (int i=0; i < botones.length;i++){
            botones[i]= new JButton(String.valueOf(i+1));
            botones[i].setBounds(posicionx,100,90,30);
            add(botones[i]);
            botones[i].addActionListener(this);
            posicionx+= 100;
        }

        //Muestra el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejemplo2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (JButton boton: botones){
            if (e.getSource()==boton){
                setTitle("Boton 1");
            }

        }
    }
}