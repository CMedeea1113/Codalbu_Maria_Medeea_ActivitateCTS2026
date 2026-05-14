package ro.ase.cts.biblioteca;

import java.util.List;
import java.util.ArrayList;

public abstract class ProxyBiblioteca implements IBibloteca {
    private Biblioteca biblioteca;
    private List<Student> salaDeAsteptare;

    public ProxyBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.salaDeAsteptare = new ArrayList<>();
    }

    @Override
    public void permiteAcces(Student student) {
        if (!student.permisValid()) {
            System.out.println("Acces refuzat pentru " + student.getnume()
                    + ". Are permisul invalid.");
            return;
        }

        if (!student.aprobareProfesor()) {
            System.out.println("Acces refuzat pentru " + student.getnume()
                    + ". Nu are aprobare de la profesor.");
            return;
        }

        salaDeAsteptare.add(student);
        System.out.println(student.getnume()
                + " asteapta formarea grupului.");

        if (salaDeAsteptare.size() >= 2) {
            System.out.println("S-a format un grup de minim 2 studenti.");

            for (Student s : salaDeAsteptare) {
                s.setEcusonSpecial(true);
                biblioteca.permiteAcces(s);
            }

            salaDeAsteptare.clear();
        }
    }
}

