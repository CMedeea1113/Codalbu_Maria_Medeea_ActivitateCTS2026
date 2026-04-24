package ro.ase.cts.factory;

import ro.ase.cts.contracts.IServiciuTuristic;
import ro.ase.cts.models.*;

public class ServiciuTuristicFactory {
    public static IServiciuTuristic creeazaServiciu(TipServiciuTuristic tip) {
        switch (tip) {
            case CAZARE:
                return new Cazare();
            case TRANSPORT:
                return new Transport();
            case GHID_TURISTIC:
                return new GhidTuristic();
            case ASIGURARE_CALATORIE:
                return new AsigurareCalatorie();
            default:
                throw new IllegalArgumentException("Tip serviciu turistic invalid");
        }
    }
}
