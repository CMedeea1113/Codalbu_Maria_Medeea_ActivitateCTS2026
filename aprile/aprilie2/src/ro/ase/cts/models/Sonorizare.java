package ro.ase.cts.models;

import ro.ase.cts.contracts.IServiciuEveniment;

public class Sonorizare implements IServiciuEveniment {
    @Override
    public void descriere() {
        System.out.println("Serviciu: sonorizare");
    }
}
