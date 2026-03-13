package ro.ase.cts.Factory;

import ro.ase.cts.Abonamente.*;

public class FabricaAbonamente {
    public Abonament creareAbonament(TipAbonament tipAbonament) throws IllegalAccessException {
        switch (tipAbonament){
            case BASIC:
                return new AbonamentBasic();
            case PREMIUM:
                return new AbonamentPremium();
            case STANDARD:
                return new AbonamentStandard();
            default:
                throw new IllegalAccessException("tip abonament necunoscut");

        }
    }
}
