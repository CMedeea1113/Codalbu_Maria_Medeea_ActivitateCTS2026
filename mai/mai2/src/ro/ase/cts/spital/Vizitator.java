package ro.ase.cts.spital;

public class Vizitator {
    private String nume;
    private boolean areScrisoareAcceptare;
    private boolean areHaineProtectie;

    public Vizitator(String nume, boolean areScrisoareAcceptare) {
        this.nume = nume;
        this.areScrisoareAcceptare = areScrisoareAcceptare;
        this.areHaineProtectie = false;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreScrisoareAcceptare() {
        return areScrisoareAcceptare;
    }

    public boolean isAreHaineProtectie() {
        return areHaineProtectie;
    }

    public void echipeaza() {
        this.areHaineProtectie = true;
    }
}