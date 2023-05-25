package Tema5;

public class CocheCrudImplV2 implements CocheCRUD {

    @Override
    public void save() {
        System.out.println( "save() -> Metodo save");
        System.out.println( "Implementado en CocheCrudImplV2");
    }

    @Override
    public void findAll(){
        System.out.println("findAll() -> Devuelvo lista de coches");
        System.out.println( "Implementado en CocheCrudImplV2");
    }

    @Override
    public void delete() {
        System.out.println("delete() -> Borro todo");
        System.out.println( "Implementado en CocheCrudImplV2");
    }
}
