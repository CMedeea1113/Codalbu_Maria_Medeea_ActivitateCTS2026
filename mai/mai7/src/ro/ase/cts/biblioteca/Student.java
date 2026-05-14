package ro.ase.cts.biblioteca;

public class Student{
    private static String nume;
    private boolean permisValid;
    private boolean aprobareProfesor;
    private boolean ecusonSpecial;

    public Student(String nume, boolean permisValid, boolean aprobareProfesor, boolean ecusonSpecial) {
        this.nume = nume;
        this.permisValid = permisValid;
        this.aprobareProfesor = aprobareProfesor;
        this.ecusonSpecial = ecusonSpecial;
    }

    public static String getnume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean permisValid() {
        return permisValid;
    }

    public void setPermisValid(boolean permisValid) {
        this.permisValid = permisValid;
    }

    public boolean aprobareProfesor() {
        return aprobareProfesor;
    }

    public void setAprobareProfesor(boolean aprobareProfesor) {
        this.aprobareProfesor = aprobareProfesor;
    }

    public boolean ecusonSpecial(boolean b) {
        return ecusonSpecial;
    }

    public void setEcusonSpecial(boolean ecusonSpecial) {
        this.ecusonSpecial = ecusonSpecial;
    }
}
