package Tema789;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcesoInputConsola extends  ProcesoInput implements ObtenerInput{

    public void start() {

        getInput();

        file = getFile();

        replace(palabras, file);

    }
    @Override
    public void getInput() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra y presione 'Enter'\n" +
                "Para finalizar, ingrese \"!!\" \n" +
                "" );

        String palabra = sc.nextLine();

        while ( !palabra.equals("!!")){
            palabras.add(palabra);
            palabra = sc.nextLine();
        }


    }

}
