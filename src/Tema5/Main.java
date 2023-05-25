package Tema5;

public class Main {
    public static void main(String[] args) {

            CocheCRUD cocheCrud = new CocheCrudImplV2();

            cocheCrud.save();
            cocheCrud.delete();
            cocheCrud.findAll();

            //CocheCRUD cocheCrud_v2 = new CocheCrudImplV2();


    }
}
