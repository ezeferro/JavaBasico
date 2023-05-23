package Tema3;

/**
 * Concatena los textos cargados en el arreglo cadenas[]
 */
public class ConcatenarTextos {

    public static void main(String[] args) {
        String concat = "";
        String[] cadenas = { "texto 1" , "mi nombre es pepe" , "esto es otro texto" };

        System.out.println("Cadenas a concatenar:");
        for (String texto: cadenas ) {
            System.out.println(texto);
            concat = concat.concat(texto);
        }

        System.out.println( "Concatenacion: " + concat );
    }
}
