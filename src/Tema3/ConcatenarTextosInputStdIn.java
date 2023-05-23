package Tema3;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Concatena textos obtenidos desde la entrada estandard
 */
public class ConcatenarTextosInputStdIn {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String delimitador;
        String resultado;
        LinkedList<String> cadenas = new LinkedList<String>();


        System.out.println("Ingrese un caracter delimitador ( espacio por default )");
        delimitador = s.nextLine();
        if (delimitador.isBlank()){
            delimitador = String.valueOf(' ');
        }
        System.out.println("Ingrese los textos que desea concatenar");
        while (s.hasNext()){
            cadenas.add(s.nextLine());
        }

        //concatenamos textos separados por el delimitador
        resultado= "";
        for (String cadena: cadenas ) {
            resultado = resultado + delimitador + cadena;
        }

        System.out.println("La cadena generada es: " + resultado);

    }

}
