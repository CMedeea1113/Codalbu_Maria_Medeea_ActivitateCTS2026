package ro.ase.cts.builder;

import ro.ase.cts.telefon.Telefon;

public interface AbstractBuilderTelefon {
    void setMemorieExtinsa(boolean memorieExtinsa);
    void setHusaProtectie(boolean husaProtectie);
    void setIncarcatorWireless(boolean incarcatorWireless);
    void setFolieEcran(boolean folieEcran);
    Telefon build();
}