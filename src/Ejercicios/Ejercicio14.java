package Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.BorderLayout.*;

public class Ejercicio14 extends JFrame implements ActionListener{

    private JButton[] botonesDer = new JButton[5];
    private JButton[] botonesIzq = new JButton[5];

    BorderLayout miBorderLayout;

    JLabel label1, label2;

    JTextArea TextArea;

    public Ejercicio14(){
        //Instancia un objeto BorderLayout con una separacion de 3px en horizonal y vertical
        miBorderLayout = new BorderLayout(1,1);

        //Uso este BorderLayout para que sea el controlador de posicionamiento de mi objeto JFrame
        setLayout(miBorderLayout);

        //Creo 10 botones y los añado a mi objeto JFrame
        for (int i = 0; i < botonesDer.length; i++) {
            botonesDer[i]= new JButton("Este");
            add(botonesDer[i],EAST);
        }
        for (int i = 0; i < botonesIzq.length; i++) {
            botonesIzq[i]= new JButton("Oeste");
            add(botonesIzq[i],WEST);
        }


        //Creo dos labels y los añado a mi Jframe
        label1= new JLabel("Que pasa larva");
        label2= new JLabel("MESSI>CR7");
        add(label1,NORTH);
        add(label2,SOUTH);

        //Creo el JtextArea y lo añado
        TextArea= new JTextArea();
        add(TextArea,CENTER);

        initPantalla();
    }
    private void initPantalla() {

        setTitle("EJERCICIO 14"); //Título del JFrame
        setSize(550,550); //Dimensiones del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }


    public static void main(String[] args) {
        new Ejercicio14();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
