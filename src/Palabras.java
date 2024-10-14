public class Palabras {

    public static String generarPalabra(){

        String [] PALABRAS = {"hola", "mundo", "como", "estas", "agua", "beber", "saltar","helicoptero", "persiana","patineta","submarino"};

        return PALABRAS[(int) (Math.random() * PALABRAS.length)];
    }



    public static String generarFrase(){

        String [] FRASES = {"Si funciona, no lo toques", "Funciona en mi maquina", "¿Ya probaste reiniciarlo?", "Ayer funcionaba", "No es un problema de código, es un problema del usuario."};

        return FRASES[(int) (Math.random() * FRASES.length)];
    }

    public static String generarParrafos() {

        String[] PARRAFOS = {"La programación es un lenguaje formal, artificial y bien definido que permite a los programadores escribir instrucciones o secuencias de órdenes para que una computadora las ejecute.", "Java es un lenguaje de programación orientado a objetos y multiplataforma, ampliamente utilizado para crear software compatible con una gran diversidad de sistemas operativos." , "Los programadores suelen ser personas curiosas y disfrutan aprendiendo nuevas cosas. La programación les permite explorar nuevas tecnologías y conceptos, lo que puede ser muy atractivo."};

        return PARRAFOS[(int) (Math.random() * PARRAFOS.length)];

    }

}

