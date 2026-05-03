package ro.ase.cts.spital;

public class Spital implements ISpital {

    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    @Override
    public void permiteAcces(Vizitator vizitator) {
        System.out.println("Vizitatorul " + vizitator.getNume()
                + " a primit acces in saloanele spitalului " + numeSpital + ".");
    }
}