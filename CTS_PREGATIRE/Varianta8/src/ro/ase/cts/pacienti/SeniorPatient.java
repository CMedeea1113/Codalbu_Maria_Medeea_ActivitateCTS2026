package ro.ase.cts.pacienti;

public class SeniorPatient extends APatient{
    public SeniorPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public String getType() {
        return "Senior";
    }
}
