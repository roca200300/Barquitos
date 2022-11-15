package Lola;

public class Emisor1 {
    static int puertoAlQueEnvia = 5000;
    static int puertoPorElQueRecibe = 6500;

    public static void main(String[] args) {

        EnviaObjetos.envia("Hola desde el emisor1", "localhost", puertoAlQueEnvia);
        System.out.println(RecibeObjetos.recibe(puertoPorElQueRecibe));
        EnviaObjetos.envia("2º mensaje desde el emisor1", "localhost", puertoAlQueEnvia);
        System.out.println(RecibeObjetos.recibe(puertoPorElQueRecibe));
    }
}
