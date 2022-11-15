package Ejemplos;

import java.awt.Color;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Ejemplo14 extends JFrame {

    JTextPane text = new JTextPane();

    public Ejemplo14() {

        URL imagen = getClass().getResource("/img/smile.png");

        JTextPane text = new JTextPane(); //Incializamos el textPane
        setLayout(null); //Layout absoluto

		/*Instanciamos una clase SimpleAttributeSet, que guardará los atributos
		 para un determinado texto: si es negrita, cursiva, fuente, etc.
		*/
        SimpleAttributeSet attrs = new SimpleAttributeSet();

        //Texto en negrita + nueva línea
        textoNegrita(attrs, text, "Esto es un texto en negrita");
        nuevaLinea(text);

        //Texto en rojo + nueva línea
        textoRojo(attrs, text, "esto es un texto de color rojo");
        nuevaLinea(text);

		/*INSERTAR UN ICONO *************************************************************************
		El método para ello es insertIcon(). Este método reemplaza lo que hay seleccioado en el
		JTextPane por el icono. Si sólo queremos insertarlo al final, debemos cambiar la selección
		del texto al final, sin seleccionar nada. Eso se hace con el método setCaretPosition().
		Después generamos el icono desde la imagen y lo añadimos con insertIcon
		*/
        text.setCaretPosition(text.getStyledDocument().getLength());
        ImageIcon icono = new ImageIcon(imagen);
        text.insertIcon(icono);
        nuevaLinea(text);

		/*INSERTAR UN BOTÓN *************************************************************************
		El método es insertComponent() y, al igual que en el caso anterior, reemplaza el texto que
		haya seleccionado por el Component. Al igual que antes, con setCaretPosition() nos vamos
		al final del texto e insertamos el JButton.
		*/
        text.setCaretPosition(text.getStyledDocument().getLength());
        JButton boton = new JButton("Pulsame");
        text.insertComponent(boton);
        nuevaLinea(text);

        //Incializamos el scrollPane y le añadimos el editor
        JScrollPane scrollPane = new JScrollPane(text);
        scrollPane.setBounds(50,50,300,300);
        add(scrollPane);

        //Configurar y mostrar JFrame
        initPantalla();
    }

    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Ejemplo 14"); //Título del JFrame
        setSize(400, 400); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    //Método para texto en negrita
    private void textoNegrita(SimpleAttributeSet attrs, JTextPane text, String string){

		/*Para modificar el valor de estos atributos, nos ayuda la clase StyleConstants.
		Esta clase tiene muchos métodos para cambiar valores a una clase SimpleAttributeSet.
		En este caso concreto hemos usado setBold() para ponerlo en negrita.
		*/
        StyleConstants.setBold(attrs, true);

		/*Obtenemos el StyledDocument, que es lo que el JTextPane tiene dentro y
		representa al texto que estamos viendo.
		El StyledDocument tiene un método insert() que admite tres parámetros:
			- Posición en la que se quiere insetar el texto dentro del documento.
			- El texto
			- Los atributos del texto.
		Como queremos insertar al final, la posición es justo la longitud del texto,
		esto se obtiene con el método getLength().
		*/
        try {
            text.getStyledDocument().insertString(
                    text.getStyledDocument().getLength(), string, attrs);
        } catch (BadLocationException ex) {
            Logger.getLogger(Ejemplo14.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Método para texto en rojo
    private void textoRojo(SimpleAttributeSet attrs, JTextPane text, String string){

        StyleConstants.setForeground(attrs, Color.red);

        try {
            text.getStyledDocument().insertString(
                    text.getStyledDocument().getLength(), string, attrs);
        } catch (BadLocationException ex) {
            Logger.getLogger(Ejemplo14.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Método para cambiar de línea
    private void nuevaLinea(JTextPane text){

        try {
            text.getStyledDocument().insertString(
                    text.getStyledDocument().getLength(),
                    System.getProperty("line.separator"), null);
        } catch (BadLocationException ex) {
            Logger.getLogger(Ejemplo14.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        new Ejemplo14();
    }
}