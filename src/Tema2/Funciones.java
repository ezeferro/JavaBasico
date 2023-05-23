package Tema2;

import java.util.Scanner;

/**
 * En esta clase implementamos un metodo getPrecioIva
 * que agrega el IVA al precio ingresado por pantalla
 * y luego lo mostramos en la salida standard
 */
public class Funciones{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un precio:");
        System.out.println("Precio + IVA = " + getPrecioIva( s.nextFloat() ) );

    }

    public static float getPrecioIva( float precio ){
        return precio * 1.21f;
    }

}
