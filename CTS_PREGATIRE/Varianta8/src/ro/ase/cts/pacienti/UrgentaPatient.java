package ro.ase.cts.pacienti;

public class UrgentaPatient extends APatient{
    public UrgentaPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public String getType() {
        return "Urgenta";
    }
}
