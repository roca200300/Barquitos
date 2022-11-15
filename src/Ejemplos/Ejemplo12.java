package Ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ejemplo12 extends JFrame implements ItemListener {
    private JComboBox combo1;
    private JLabel label1;

    public Ejemplo12() {

        //Añado el ComboBox con sus items y su ItemListener, así como la etiqueta
        combo1 = new JComboBox();
        combo1.setBounds(10, 10, 80, 20);
        add(combo1);

        combo1.addItem("ninguno");
        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItemListener(this);

        label1 = new JLabel("Color seleccionado: ninguno");
        label1.setBounds(10, 80, 200, 30);
        add(label1);

        //Configurar y mostrar JFrame
        initPantalla();
    }

    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Ejemplo 12"); //Título del JFrame
        setSize(300, 200); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    public static void main(String[] args) {
        new Ejemplo12();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        String texto = "Color seleccionado:  ";

        if (e.getSource() == combo1) {
            String seleccionado = (String) combo1.getSelectedItem();
            texto += seleccionado;
            label1.setText(texto);

        }
        if (e.getSource() == combo1) {
            if (combo1.getSelectedItem() == "rojo") {
                getContentPane().setBackground(Color.red);
            } else if (combo1.getSelectedItem() == "verde") {
                getContentPane().setBackground(Color.green);
            } else if (combo1.getSelectedItem() == "azul") {
                getContentPane().setBackground(Color.blue);
            } else if (combo1.getSelectedItem() == "ninguno") {
                getContentPane().setBackground(Color.darkGray);

            }
            //TODO 1: Cambiar el color del fondo al seleccionado
            //TODO 2:Añadir 15 colores más(usar arrays)
            //TODO 3: Extraer los colores de un fichero
            //TODO 4:Extraer los colores de una API
        }
    }
}