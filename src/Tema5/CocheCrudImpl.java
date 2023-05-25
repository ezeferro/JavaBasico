package Tema5;

import java.util.List;

public class CocheCrudImpl implements CocheCRUD {


    @Override
    public void save() {
            System.out.println( "save() -> Metodo save");
            System.out.println( "Implementado en CocheCrudImpl");
    }

    @Override
    public void findAll(){
        System.out.println("findAll() -> Devuelvo lista de coches");
        System.out.println( "Implementado en CocheCrudImpl");
    }

    @Override
    public void delete() {
        System.out.println("delete() -> Borro todo");
        System.out.println( "Implementado en CocheCrudImpl");
    }
}
