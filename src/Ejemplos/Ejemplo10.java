package Ejemplos;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejemplo10 extends JFrame implements ChangeListener {
    private JCheckBox checkBox1, checkBox2, checkBox3;
    private JLabel label1;

    public Ejemplo10() {

        //Añado los 3 checkbox con su ChangeListener y la etiqueta
        checkBox1 = new JCheckBox("Español");
        checkBox1.setBounds(10,10,150,30);
        checkBox1.addChangeListener(this);
        add(checkBox1);

        checkBox2 = new JCheckBox("Inglés");
        checkBox2.setBounds(10,50,150,30);
        checkBox2.addChangeListener(this);
        add(checkBox2);

        checkBox3 = new JCheckBox("Alemán");
        checkBox3.setBounds(10,90,150,30);
        checkBox3.addChangeListener(this);
        add(checkBox3);

        label1 = new JLabel("Idiomas: ninguno");
        label1.setBounds(10,130,250,30);
        add(label1);

        //COnfigurar y mostrar JFrame
        initPantalla();
    }

    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Ejemplo 10"); //Título del JFrame
        setSize(300, 200); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    public static void main(String[] args) {
        new Ejemplo10();
    }

    @Override
    public void stateChanged(ChangeEvent e) {

        String texto = "Idiomas:  ";

        if (checkBox1.isSelected()) {
            texto += "Español, ";
        }
        if (checkBox2.isSelected()) {
            texto += "Ingles, ";
        }
        if (checkBox3.isSelected()) {
            texto += "Alemán, ";
        }

        //Quito la última ',' y escribo el texto
        texto = texto.substring(0, texto.length() - 2);
        label1.setText(texto);

    }

}