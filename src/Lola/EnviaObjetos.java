package Lola;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class EnviaObjetos {
    public static void envia(Object objeto, String hostdestino, int puerto) {
        try {
            DatagramSocket socket;
            DatagramPacket paquete;
            byte bytesEnviar[];

            bytesEnviar = serializar(objeto);
            socket = new DatagramSocket();
            paquete = new DatagramPacket(bytesEnviar, bytesEnviar.length,
                    InetAddress.getByName(hostdestino), puerto);
            socket.send(paquete);
            socket.close();

        } catch (SocketException ex) {
            System.out.println("Error al asignar el socket");
            ex.printStackTrace();
        } catch (UnknownHostException ex) {
            System.out.println("Error al crear el paquete");
        } catch (IOException ex) {
            System.out.println("Error en el envĂ­o del paquete");
        }
    }

    static byte[] serializar(Object objeto) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (
                ObjectOutputStream os = new ObjectOutputStream(bytes)) {
            os.writeObject(objeto);
        } catch (IOException ex) {
            System.out.println("Error al crear el array de bytes");
        }
        return bytes.toByteArray();
    }
}
