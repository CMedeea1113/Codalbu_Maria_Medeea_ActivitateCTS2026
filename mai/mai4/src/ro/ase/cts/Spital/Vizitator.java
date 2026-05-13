package ro.ase.cts.Spital;

public class Vizitator {
    private String nume;
    private boolean areScrisoareAcceptare;
    private boolean echipatProtectie;

    public Vizitator(String nume, boolean areScrisoareAcceptare) {
        this.nume = nume;
        this.areScrisoareAcceptare = areScrisoareAcceptare;
        this.echipatProtectie = false;
    }

    public String getNume() {
        return nume;
    }

    public boolean areScrisoareAcceptare() {
        return areScrisoareAcceptare;
    }

    public void setEchipatProtectie() {
        this.echipatProtectie = echipatProtectie;
    }
}
