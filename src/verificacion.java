public class verificacion {

    public static boolean verificarSeguirJugando(String respuestaStr){

        if (respuestaStr.equals("n")) {

            return false;

        } else if (respuestaStr.equals("s")) {

            return true;

        } else {

            System.out.println("Respuesta inválida.");

        }

        return false;

    }

    public static boolean verificarFrase(String frase, String fraseIngresada){

        if(frase.equals(fraseIngresada)){

            return true;
        }else{

            return false;

        }

    }

    public static boolean verificarPalabra(String palabra, String palabraIngresada){

        if (palabra.equals(palabraIngresada)) {

            return true;

            //System.out.println("¡Correcto! Te tomó " + tiempoTotal + " milisegundos.");
        } else {

            return false;

            //System.out.println("Incorrecto. La palabra correcta era: " + palabra);
        }

    }

}
