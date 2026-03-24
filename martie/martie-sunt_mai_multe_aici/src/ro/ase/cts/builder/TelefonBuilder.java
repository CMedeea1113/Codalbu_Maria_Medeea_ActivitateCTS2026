package ro.ase.cts.builder;

import ro.ase.cts.telefon.Telefon;

public class TelefonBuilder implements AbstractBuilderTelefon {
    private String model;
    private boolean memorieExtinsa;
    private boolean husaProtectie;
    private boolean incarcatorWireless;
    private boolean folieEcran;

    public TelefonBuilder(String model) {
        this.model = model;
        this.memorieExtinsa = false;
        this.husaProtectie = false;
        this.incarcatorWireless = false;
        this.folieEcran = false;
    }

    @Override
    public void setMemorieExtinsa(boolean memorieExtinsa) {
        this.memorieExtinsa = memorieExtinsa;
    }

    @Override
    public void setHusaProtectie(boolean husaProtectie) {
        this.husaProtectie = husaProtectie;
    }

    @Override
    public void setIncarcatorWireless(boolean incarcatorWireless) {
        this.incarcatorWireless = incarcatorWireless;
    }

    @Override
    public void setFolieEcran(boolean folieEcran) {
        this.folieEcran = folieEcran;
    }

    @Override
    public Telefon build() {
        return new Telefon(model, memorieExtinsa, husaProtectie, incarcatorWireless, folieEcran);
    }
}