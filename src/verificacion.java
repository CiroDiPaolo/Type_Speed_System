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

    public static boolean verificar(String v1, String v2){

        if(v1.equals(v2)){

            return true;
        }else{

            return false;

        }

    }


}
