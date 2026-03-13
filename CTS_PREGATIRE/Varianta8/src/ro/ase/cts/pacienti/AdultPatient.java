package ro.ase.cts.pacienti;

public class AdultPatient extends APatient{

    public AdultPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public String getType() {
        return "Adult";
    }
}
