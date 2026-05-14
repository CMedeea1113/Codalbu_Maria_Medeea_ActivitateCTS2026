package ro.ase.cts.biblioteca;

public class Biblioteca implements IBibloteca{
    @Override
    public static void permiteAcces(Student student) {
        System.out.println("Studentul "+ Student.getnume()+" a intrat in sala de asteptare");
    }


}
