package ro.ase.cts.pacienti;

public abstract class APatient {
    protected String name;
    protected int age;

    public APatient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getType();
}
