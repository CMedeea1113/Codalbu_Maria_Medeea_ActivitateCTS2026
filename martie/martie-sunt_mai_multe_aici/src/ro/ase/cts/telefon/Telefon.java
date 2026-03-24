package ro.ase.cts.telefon;

public class Telefon {
    private final String model;
    private final boolean memorieExtinsa;
    private final boolean husaProtectie;
    private final boolean incarcatorWireless;
    private final boolean folieEcran;

    public Telefon(String model, boolean memorieExtinsa, boolean husaProtectie,
                   boolean incarcatorWireless, boolean folieEcran) {
        this.model = model;
        this.memorieExtinsa = memorieExtinsa;
        this.husaProtectie = husaProtectie;
        this.incarcatorWireless = incarcatorWireless;
        this.folieEcran = folieEcran;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "model='" + model + '\'' +
                ", memorieExtinsa=" + memorieExtinsa +
                ", husaProtectie=" + husaProtectie +
                ", incarcatorWireless=" + incarcatorWireless +
                ", folieEcran=" + folieEcran +
                '}';
    }
}