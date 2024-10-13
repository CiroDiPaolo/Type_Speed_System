public class Palabras {

    public static String generarPalabra(){

        String [] PALABRAS = {"hola", "mundo", "como", "estas", "agua", "beber", "saltar","helicoptero", "persiana","patineta","submarino"};

        return PALABRAS[(int) (Math.random() * PALABRAS.length)];
    }



    public static String generarFrase(){

        String [] FRASES = {"Si funciona, no lo toques", "Funciona en mi maquina", "¿Ya probaste reiniciarlo?", "Ayer funcionaba", "No es un problema de código, es un problema del usuario."};

        return FRASES[(int) (Math.random() * FRASES.length)];
    }

}

