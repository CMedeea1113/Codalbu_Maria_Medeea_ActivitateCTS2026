package ro.ase.cts.models;

import ro.ase.cts.contracts.IServiciuTuristic;

public class Cazare implements IServiciuTuristic {
    @Override
    public void descriere() {
        System.out.println("Serviciu turistic: cazare");
    }
}