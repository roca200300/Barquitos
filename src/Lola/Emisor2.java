package Lola;

public class Emisor2 {
    static int puertoAlQueEnvia = 6500;
    static int puertoPorElQueRecibe = 5000;

    public static void main(String[] args) {
        System.out.println(RecibeObjetos.recibe(puertoPorElQueRecibe));
        EnviaObjetos.envia("Mensaje desde el emisor2", "localhost", puertoAlQueEnvia);
        System.out.println(RecibeObjetos.recibe(puertoPorElQueRecibe));
        EnviaObjetos.envia("Otro mensaje desde el emisor2", "localhost", puertoAlQueEnvia);
    }
}
