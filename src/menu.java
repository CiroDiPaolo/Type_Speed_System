import java.util.Scanner;

public class menu {

    public static void menuPrincipal(){

        System.out.println("Bienvenido al speed test de escritura!");

        time.sleep(1000);

        System.out.println("Eliga el modo de juego");

        time.sleep(1000);

        System.out.println("1. Palabra aleatoria");

        time.sleep(1000);

        System.out.println("2. Frase aleatoria");

        time.sleep(1000);

        System.out.println("0. Salir");

        time.sleep(1000);

        System.out.print("Ingrese su opcion =>");

    }

    public static void menuOpciones(int opcion){

        switch(opcion){

            case 1:

                palabraAleatoria();

                break;

            case 2:

                fraseAleatoria();

                break;

            case 0:

                System.out.println("Adios!");

                break;


        }

    }

    public static void palabraAleatoria() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nModo: Palabra aleatoria");

        System.out.println("Se mostrara una palabra aleatoria y deberas escribirla lo mas rapido posible.");

        System.out.println("Presiona enter para comenzar");

        time.enter();

        boolean respuesta = true;

        while (respuesta == true) {

            System.out.println("¡Comencemos!");

            System.out.println("3");

            time.sleep(1000);

            System.out.println("2");

            time.sleep(1000);

            System.out.println("1");

            time.sleep(1000);

            System.out.println("¡YA!");

            String palabra = Palabras.generarPalabra();
            long tiempoInicio = System.currentTimeMillis();
            System.out.println(palabra);
            String palabraIngresada = "";

            palabraIngresada = sc.nextLine();

            long tiempoFinal = System.currentTimeMillis();
            long tiempoTotal = tiempoFinal - tiempoInicio;

            if (verificacion.verificarPalabra(palabra, palabraIngresada)) {

                System.out.println("¡Correcto! Te tomó " + tiempoTotal + " milisegundos.");

            } else {

                System.out.println("Incorrecto. La palabra correcta era: " + palabra);

            }

            System.out.println("¿Quieres seguir jugando? (s/n)");

            respuesta = verificacion.verificarSeguirJugando(sc.nextLine());


        }

    }

    public static void fraseAleatoria() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nModo: Frase aleatoria");

        System.out.println("Se mostrara una frase aleatoria y deberas escribirla lo mas rapido posible.");

        System.out.println("Presiona enter para comenzar");

        time.enter();

        boolean respuesta = true;

        while (respuesta == true) {

            System.out.println("¡Comencemos!");

            System.out.println("3");

            time.sleep(1000);

            System.out.println("2");

            time.sleep(1000);

            System.out.println("1");

            time.sleep(1000);

            System.out.println("¡YA!");

            String frase = Palabras.generarFrase();
            long tiempoInicio = System.currentTimeMillis();
            System.out.println(frase);
            String fraseIngresada = "";

            fraseIngresada = sc.nextLine();

            long tiempoFinal = System.currentTimeMillis();
            long tiempoTotal = tiempoFinal - tiempoInicio;

            if (verificacion.verificarFrase(frase, fraseIngresada)) {

                System.out.println("¡Correcto! Te tomó " + tiempoTotal + " milisegundos.");

            } else {

                System.out.println("Incorrecto. La frase correcta era: " + frase);

            }

            System.out.println("¿Quieres seguir jugando? (s/n)");

            respuesta = verificacion.verificarSeguirJugando(sc.nextLine());

        }

    }


}
