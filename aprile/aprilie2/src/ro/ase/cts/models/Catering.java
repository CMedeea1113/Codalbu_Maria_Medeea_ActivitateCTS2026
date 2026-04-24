package ro.ase.cts.models;

import ro.ase.cts.contracts.IServiciuEveniment;

public class Catering implements IServiciuEveniment {
    @Override
    public void descriere() {
        System.out.println("Serviciu: catering");
    }
}
