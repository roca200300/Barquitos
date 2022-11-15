package Lola;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static java.awt.Font.PLAIN;

public class Barcos extends JFrame implements ActionListener,Runnable {

    JPanel panel1, panel2; //panel para los botones (salvo el de resultado
    GridLayout miGridLayout;
    JButton [] botones= new JButton[35];
    JButton [] botones2= new JButton[35];

    JLabel label1, label2;

    JButton listo;

    JButton borrar;

    int puertoAlQueEnvia;
    int puertoPorElQueRecibe;

    int j = 0;

    public Barcos(int port1, int port2){
        initPantalla();
        initBotones();
        setVisible(true);

        this.puertoAlQueEnvia= port1;
        this.puertoPorElQueRecibe= port2;
        Thread h= new Thread(this);
        h.start();
    }
    public void initPantalla(){
        setLayout(null);

        //Tamaño de la ventana
        setBounds(10,10,900,900);

        //Título
        setTitle("Ejemplo 7a: JTextArea");

        //No redimensionable
        setResizable(false);

        //Cerrar proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void initBotones(){
        panel1 = new JPanel();
        panel1.setBounds(50, 50, 350, 350);
        panel1.setLayout(new GridLayout(5, 7));
        panel1.setVisible(true);
        add(panel1);

        label1 = new JLabel("Coloca 1 barco de 4 casillas, 1 de 3 y 2 de 2");
        label1.setBounds(50,430, 700,30);
        add(label1);

        label2 = new JLabel("Solo puedes colocar los barcos en horizontal y vertical");
        label2.setBounds(50,450, 700,30);
        add(label2);

        panel2 = new JPanel();
        panel2.setBounds(500, 50, 350, 350);
        panel2.setLayout(new GridLayout(5, 7));
        panel2.setVisible(true);
        add(panel2);

        listo = new JButton("LISTO");
        listo.setBounds(300,500,300,30);
        listo.addActionListener(this);
        listo.setVisible(false);
        add(listo);

        borrar = new JButton("BORRAR");
        borrar.setBounds(650,600,200,30);
        borrar.addActionListener(this);
        borrar.setVisible(false);
        add(borrar);


        for (int i = 0; i < botones.length; i++) {
            botones[i] = new JButton(String.valueOf(i));
            botones[i].setBackground(Color.BLUE);
            botones[i].addActionListener(this);
            panel1.add(botones[i]);
        }

        for (int i = 0; i < botones2.length; i++) {
            botones2[i] = new JButton(String.valueOf(i));
            botones2[i].setBackground(Color.BLUE);
            botones2[i].addActionListener(this);
            panel2.add(botones2[i]);
        }
    }



    public static void main(String[] args) {
        new Barcos(6500, 5000);
        new Barcos(5000, 6500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0;i<botones.length;i++){
            if (j<=10 && e.getSource().equals(botones[i])){
                botones[i].setBackground(Color.RED);
                j++;
            }
        }if (j>10){
            listo.setVisible(true);
            borrar.setVisible(true);
        }
        if (e.getSource().equals(borrar)){
            listo.setVisible(false);
            borrar.setVisible(false);
            j=0;
            for (int i = 0;i<botones.length;i++){
                botones[i].setBackground(Color.BLUE);
            }
        }
        if (e.getSource().equals(listo)) {
            listo.setVisible(false);
            borrar.setVisible(false);
        }
    }

    @Override
    public void run() {

    }
}