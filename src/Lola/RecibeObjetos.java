package Lola;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class RecibeObjetos {
    public static Object recibe(int puerto) {
        DatagramSocket socket;
        DatagramPacket paquete = null;
        byte recibidos[] = new byte[50000];
        try {
            socket = new DatagramSocket(puerto);
            paquete = new DatagramPacket(recibidos, recibidos.length);

            socket.receive(paquete);

            socket.close();
        } catch (SocketException ex) {
            System.out.println("Error al asignar el socket");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error en la recepciĂłn del paquete");
        }
        return deserializar(paquete.getData());
    }
    static Object deserializar(byte[] bytesRecibidos) {
        Object objeto = null;
        ByteArrayInputStream bytesDelPaquete = new ByteArrayInputStream(bytesRecibidos);

        try (ObjectInputStream is = new ObjectInputStream(bytesDelPaquete)) {
            objeto = is.readObject();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al convertir el objeto");
        } catch (IOException ex) {
            System.out.println("Error al extraer datos del paquete");
        }
        return objeto;
    }
}
