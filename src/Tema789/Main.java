package Tema789;


import java.io.*;
import java.sql.Array;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            boolean exit = false;
            do {

                imprimirPrompt();

                switch (s.nextInt()) {
                    case 0:
                        ejercicioRevertirString();
                        break;
                    case 1:
                        ejercicioRecorrerString();
                        break;
                    case 2:
                        ejercicioRecorrerArrayBidim();
                        break;
                    case 3:
                        ejercicioOperacionesVector();
                        break;
                    case 4:
                        ejercicioRespuesta();
                        break;
                    case 5:
                        ejercicioCopiarArrayListALinkedList();
                        break;
                    case 6:
                        ejercicioEliminaNumerosPares();
                        break;
                    case 7:
                        ejercicioDividePorCero();
                        break;
                    case 8:
                        ejercicioCopiaFichero();
                        break;
                    case 9:
                        ;
                    default: exit = true
                        ;

                }

                System.out.println("Ejecucion de ejercicio finalizada \n");

                try {
                    TimeUnit.SECONDS.sleep(2 );
                } catch (Exception e){
                    System.out.println( "Error during sleep " + e.getMessage() );
                }

            } while ( !exit );



    }

    public static void ejercicioCopiaFichero() {

        try {
            InputStream in = new FileInputStream("C:/files/file1.txt");
            byte[] input = in.readAllBytes();

            PrintStream out = new PrintStream("C:/files/file2.txt");
            out.write(input);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void ejercicioDividePorCero () {

        try {
            dividePorCero();
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }
    }

    public static void dividePorCero () throws ArithmeticException {

        try {
            int divzero = 1 / 0;
        } catch ( ArithmeticException e ){
           throw new ArithmeticException();
        }
    }

    private static void ejercicioEliminaNumerosPares() {

        List<Integer> l = new ArrayList<Integer>();

        for (int i = 1 ; i <= 10 ; i++){
            l.add(i);
        }

        //el objeto iterator nos permite recorrer y eliminar al mismo tiempo
        for (Iterator<Integer> iterator = l.iterator(); iterator.hasNext();) {
            Integer i = iterator.next();
            if (i % 2 == 0) {

                System.out.print(i);
                if(iterator.hasNext()){
                    System.out.print("->");
                }else{
                    System.out.println();
                }
                iterator.remove();
            }

        }

    }

    public static void ejercicioCopiarArrayListALinkedList() {

        List<Integer> a = new ArrayList<Integer>();
        List<Integer> l = new LinkedList<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        l.addAll(a);

        System.out.println("Recorro y muesto la ArrayList");
        for( Integer i : a ){
            System.out.print( i + ", ");
        }
        System.out.println();
        System.out.println("Imprimo con System.out.println:");
        System.out.println( a );

        System.out.println("Recorro y muesto la LinkedList");
        for(Integer i : l ){
            System.out.print( i + ", ");
        }
        System.out.println();
        System.out.println("Imprimo con System.out.println:");
        System.out.println( l );
    }

    public static void ejercicioRespuesta(){

        Vector<Integer> v = new Vector<Integer>();

        System.out.println("Cpacidad inicial(por defecto) de vector = ");
        System.out.println(v.capacity());

        System.out.println("Le agregamos 1000 elementos: ");

        int capacity = 0;
        for(int i = 1; i <= 1000; i++) {
            v.add(i);
            if (  capacity != v.capacity() ){
                capacity = v.capacity();
                System.out.println("Capacidad = " + v.capacity() + " // Numero de elementos agregados = " + v.size() );
            }
        }
        System.out.println("Capacidad = " + v.capacity() + " // Numero de elementos agregados = " + v.size() );

        System.out.println("Al agregar 1000 elementos en un array con tamaño 10 por defecto,\n" +
                "la estructura de datos va a duplicar su tamaño 8 veces para poder almacenar los datos correctamente\n" +
                "en este caso se estarian desperdiciando 280 posiciones de memoria\n");


    }

    public static void ejercicioOperacionesVector(){

        Vector<Integer> v = new Vector<Integer>(5);

        v.add(3);
        v.add(16);
        v.add(5);
        v.add(8);
        v.add(55);

        System.out.println(v);
        System.out.println("Elimino el 2do y 3er elemeno");
        v.remove(1);
        v.remove(1);
        System.out.println(v);

    }

    public static void ejercicioRecorrerArrayBidim() {

        int[][] array2D = { {45,56,1,2},{34,54,6,0},{23,56,2,1},{33,44,55,66} };

        for(int i=0; i<array2D.length-1 ; i++){
            for(int j=0; j<array2D[i].length; j++){

                System.out.println( "Posicion i = " + i + " j = " + j + " Valor = " + array2D[i][j]);

            }
        }
    }

    public static void imprimirPrompt(){

        System.out.println( "Ingrese el numero segun el ejercicio que desea ejecutar:");
        System.out.println( "0 - Revertir texto");
        System.out.println( "1 - Recorrer array de Strings");
        System.out.println( "2 - Recorrer array bidimensional de enteros");
        System.out.println( "3 - Crear , modificar y recorrer vector");
        System.out.println( "4 - Respuesta a pregunta: cuál es el problema de utilizar un Vector con " +
                            " la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo");
        System.out.println( "5 - Crear ArrayList de Strings");
        System.out.println( "6 - Crear ArrayList de int");
        System.out.println( "7 - Funcion divide por cero");
        System.out.println( "8 - InputStream y PrintStream");
        System.out.println( "9 - Sorpresa!");


    }

    public static void ejercicioRecorrerString(){

        String[] strings = new String[10];

        strings[0] = "Texto 1";
        strings[1] = "Texto 1";
        strings[2] = "Texto 1";
        strings[3] = "Texto 1";

        for ( String s : strings ){

            System.out.println(s);

        }

    }

    public static void ejercicioRevertirString(){

        Scanner sc = new Scanner(System.in);
        String input = new String();
        String reversed = new String();

        System.out.println("Ingrese un texto: ");
        input = sc.nextLine();

        reversed = reverse(input);

        System.out.println("Texto invertido: ");
        System.out.println(reversed);

    }

    public static String reverse(String texto){

        char[] text_aux = texto.toCharArray();
        String text_rev = "";

        for (int i = text_aux.length - 1 ; i >= 0 ; i--) {
            text_rev += text_aux[i];
        }

        return text_rev;

    }
}
