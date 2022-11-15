package Ejemplos;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo3 extends JFrame {
    
    JLabel display;
    JButton boton1, boton2, boton3, botonLimpiar;
    
    public Ejemplo3(){
        
        initDisplay();
        initBotones();
        initAcciones();
        initHovers();
        initPantalla();
        
    }
    
    private void initPantalla(){
        
        setTitle("Ejemplos.Ejemplo3: Eventos");
        setSize(240,390);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Cambio el color de fondo delJFrame
        getContentPane().setBackground(Color.magenta);
        setVisible(true);
        
    }
    
    private void initDisplay(){
        
        display= new JLabel("");
        display.setBounds(15,15,195,60);
        display.setOpaque(true);//Lo hago opaco para poder darle un color de fondo
        display.setBackground(Color.black);//color de fondo
        display.setForeground(Color.green);//color de la fuente(del texto)
        display.setBorder(new LineBorder(Color.DARK_GRAY));//Borde de la etiqueta
        display.setFont(new Font("MONOSPACE",Font.PLAIN,24));//Tipo de fuente
        display.setHorizontalAlignment(SwingConstants.RIGHT);//Alineo el texto a la derecha
        display.setFocusable(true);//Permito que tenga el foco para poder escribir con el teclado
        add(display);//añado el display al JFrame

        display.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Obtengo el string que corresponde a la tecla pulsada
                String ch = String.valueOf(e.getKeyChar());
                //Si pulsa 1, 2 o 3
                if("1".equals(ch)|| "2".equals(ch) || "3".equals(ch)){
                    display.setText(display.getText() + ch);
                }
                else if("c".equals(ch)){
                    display.setText("");//Borro el display
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    
    private void initBotones(){
        boton1 = new JButton("Pulsa o teclea 1");
        boton1.setBounds(15,90,195,50);
        boton1.setFont(new Font("MONOSPACED", Font.PLAIN,16));
        boton1.setOpaque(true);
        boton1.setFocusPainted(false);//le digo que no cambie el color cuando tenga el foco
        boton1.setBackground(Color.DARK_GRAY);
        boton1.setBorder(new LineBorder(Color.DARK_GRAY));
        boton1.setForeground(Color.WHITE);
        add(boton1);

        boton2 = new JButton("Pulsa o teclea 2");
        boton2.setBounds(15,155,195,50);
        boton2.setFont(new Font("MONOSPACED", Font.PLAIN,16));
        boton2.setOpaque(true);
        boton2.setFocusPainted(false);//le digo que no cambie el color cuando tenga el foco
        boton2.setBackground(Color.DARK_GRAY);
        boton2.setBorder(new LineBorder(Color.DARK_GRAY));
        boton2.setForeground(Color.WHITE);
        add(boton2);

        boton3 = new JButton("Pulsa o teclea 3");
        boton3.setBounds(15,220,195,50);
        boton3.setFont(new Font("MONOSPACED", Font.PLAIN,16));
        boton3.setOpaque(true);
        boton3.setFocusPainted(false);//le digo que no cambie el color cuando tenga el foco
        boton3.setBackground(Color.DARK_GRAY);
        boton3.setBorder(new LineBorder(Color.DARK_GRAY));
        boton3.setForeground(Color.WHITE);
        add(boton3);

        botonLimpiar = new JButton("LIMPIAR");
        botonLimpiar.setBounds(15,285,195,50);
        botonLimpiar.setFont(new Font("MONOSPACED", Font.PLAIN,16));
        botonLimpiar.setOpaque(true);
        botonLimpiar.setFocusPainted(false);//le digo que no cambie el color cuando tenga el foco
        botonLimpiar.setBackground(Color.DARK_GRAY);
        botonLimpiar.setBorder(new LineBorder(Color.DARK_GRAY));
        botonLimpiar.setForeground(Color.WHITE);
        add(botonLimpiar);
        
    }
    
    private void initAcciones(){
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
                display.requestFocus();//Le devuelve el foco al display (por si escribe con el teclado)
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "2");
                display.requestFocus();

            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "3");
                display.requestFocus();
            }
        });

        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                display.requestFocus();
            }
        });
    }
    
    private void initHovers(){

        boton1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                boton1.setBackground(Color.yellow);
                boton1.setBorder(new LineBorder(Color.green));
                boton1.setForeground(Color.blue);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton1.setBackground(Color.darkGray);
                boton1.setBorder(new LineBorder(Color.darkGray));
                boton1.setForeground(Color.white);

            }
        });
        boton2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                boton2.setBackground(Color.yellow);
                boton2.setBorder(new LineBorder(Color.green));
                boton2.setForeground(Color.blue);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton2.setBackground(Color.darkGray);
                boton2.setBorder(new LineBorder(Color.darkGray));
                boton2.setForeground(Color.white);

            }
        });
        boton3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                boton3.setBackground(Color.yellow);
                boton3.setBorder(new LineBorder(Color.green));
                boton3.setForeground(Color.blue);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton3.setBackground(Color.darkGray);
                boton3.setBorder(new LineBorder(Color.darkGray));
                boton3.setForeground(Color.white);

            }
        });
        botonLimpiar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                botonLimpiar.setBackground(Color.yellow);
                botonLimpiar.setBorder(new LineBorder(Color.green));
                botonLimpiar.setForeground(Color.blue);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonLimpiar.setBackground(Color.darkGray);
                botonLimpiar.setBorder(new LineBorder(Color.darkGray));
                botonLimpiar.setForeground(Color.white);

            }
        });
        
    }

    public static void main(String[] args) {
        new Ejemplo3();
    }
}