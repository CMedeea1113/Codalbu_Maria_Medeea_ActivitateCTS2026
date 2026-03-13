package ro.ase.cts.pacienti;

public class CopilPatient extends APatient {
    public CopilPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public String getType() {
        return "Copil";
    }
}
