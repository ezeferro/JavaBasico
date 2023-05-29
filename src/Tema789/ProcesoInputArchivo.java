package Tema789;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcesoInputArchivo extends ProcesoInput implements ObtenerInput{


    public void start() {

        getInput();

        file = getFile();

        replace(palabras, file);

    }

    @Override
    public void getInput() {

        String path;
        String line;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Path al fichero con la lista de palabras" );

        path = sc.nextLine();

        try {
            file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ( ( line = br.readLine() ) != null ) {
                palabras.add(line);
            }
            fr.close();
            br.close();

        } catch(Exception e){
            System.out.println( e.getMessage() );
        }
    }

}
