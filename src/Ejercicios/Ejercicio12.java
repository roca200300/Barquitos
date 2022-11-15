package Ejercicios;

import javax.swing.*;
import java.awt.*;

public class Ejercicio12 extends JFrame {
    JPanel panel;
    public Ejercicio12(){
        initPanel();
        initPantalla();
    }
    void initPanel(){

        panel = new JPanel();
        add(panel); //Añado el panel al JFrame
        panel.setPreferredSize(new Dimension(800,600)); //Dimensiones del panel
    }
    private void initPantalla(){

        setTitle("Ejercicio 12");
        setSize(800,600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;



    }



    public static void main(String[] args) {
        new Ejercicio12();

    }
}
