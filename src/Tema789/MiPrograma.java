package Tema789;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MiPrograma {

    public static InputStream in;
    public static PrintStream out;

    public void start(){

            imprimePrompt();

            switch (seleccioneMetodoDeEntrada()){
                case 1:
                    ProcesoInputConsola inputConsola = new ProcesoInputConsola();
                    inputConsola.start();
                    break;
                case 2:
                    ProcesoInputArchivo inputArchivo = new ProcesoInputArchivo();
                    inputArchivo.start();
                    break;
                default:
                    break;
            }


    }

    private int seleccioneMetodoDeEntrada() {

        Scanner sc = new Scanner(System.in);

        System.out.println( "Seleccione un metodo de entrada.\n");
        System.out.println( "1 - Entrada palabra por palabra.\n");
        System.out.println( "2 - Entrada palabra por fichero.\n");

        return sc.nextInt();

    }

    public void imprimePrompt(){

        System.out.println( "Este programa toma una lista de palabrasque pueden ser \n" +
                            "ingresadas linea a linea por consola o desde un fichero de texto, \n" +
                            "con una palabra por linea.\n");

    }

    public static void getPalabras(){


    }


}
