package Tema789;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ProcesoInput {

    public List<String> palabras = new ArrayList<String>();
    public File file;

    public abstract void start();

    public void replace(List<String> list, File file) {
        String line = null;
        List<String> lines = new ArrayList<String>();

        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ( ( line = br.readLine() ) != null ) {
                for ( String palabra: list) {
                    if(line.contains(palabra)){
                        line = line.replace(palabra, "");
                    }
                }
                lines.add(line);
            }
            fr.close();
            br.close();

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for ( String l : lines){
                bw.write(l);
                bw.write("\n");
            }
            bw.flush();
            bw.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public File getFile() {

        Scanner sc = new Scanner(System.in);
        String path = null;

        sc.reset();

        System.out.println("Escriba la ruta del archivo de texto que desea modificar:");

        if (sc.hasNext()) {
            path = sc.nextLine();
            return new File(path);
        }

        return null;
    }
}
