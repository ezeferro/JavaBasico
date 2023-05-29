package Tema789;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MiPrograma {

    public static InputStream in;
    public static PrintStream out;

    public static void start(){

            imprimePrompt();

            switch (getMetodoDeEntrada()){
                case 1:
                    ProcesoInputConsola procesoInputConsola = new ProcesoInputConsola();
                    procesoInputConsola.start();
                    break;
                case 2:
                    ProcesoInputArchivo procesoInputArchivo = new ProcesoInputArchivo();
                    procesoInputArchivo.start();
                    break;
                default:
                    break;
            }


    }

    private static int getMetodoDeEntrada() {

        Scanner sc = new Scanner(System.in);

        System.out.println( "Seleccione un metodo de entrada.");
        System.out.println( "1 - Entrada palabra por palabra.");
        System.out.println( "2 - Entrada palabra por fichero.");

        return sc.nextInt();

    }

    public static void imprimePrompt(){

        System.out.println( "Este programa recibe un listado de palabras(por consola o en un fichero .txt),\n" +
                            "Un 'path' de un archivo de texto, busca las palabras en el archivo y las elimina.\n");

    }

    public static void getPalabras(){


    }


}
