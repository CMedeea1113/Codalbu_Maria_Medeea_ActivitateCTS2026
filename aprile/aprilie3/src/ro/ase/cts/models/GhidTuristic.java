package ro.ase.cts.models;

import ro.ase.cts.contracts.IServiciuTuristic;

public class GhidTuristic implements IServiciuTuristic {
    @Override
    public void descriere() {
        System.out.println("Serviciu turistic: ghid turistic");
    }
}
