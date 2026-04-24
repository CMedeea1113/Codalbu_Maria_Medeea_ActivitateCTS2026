package ro.ase.cts.factory;

import ro.ase.cts.contracts.IServiciuEveniment;
import ro.ase.cts.models.Catering;
import ro.ase.cts.models.Decor;
import ro.ase.cts.models.Fotograf;
import ro.ase.cts.models.Sonorizare;

public class ServiciuFactory {
    public static IServiciuEveniment creeazaServiciu(TipServiciu tip) {
        switch (tip) {
            case CATERING:
                return new Catering();
            case SONORIZARE:
                return new Sonorizare();
            case DECOR:
                return new Decor();
            case FOTOGRAF:
                return new Fotograf();
            default:
                throw new IllegalArgumentException("Tip serviciu invalid");
        }
    }
}
