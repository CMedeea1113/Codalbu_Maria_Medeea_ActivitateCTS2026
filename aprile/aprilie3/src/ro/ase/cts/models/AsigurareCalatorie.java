package ro.ase.cts.models;

import ro.ase.cts.contracts.IServiciuTuristic;

public class AsigurareCalatorie implements IServiciuTuristic {
    @Override
    public void descriere() {
        System.out.println("Serviciu turistic: asigurare de calatorie");
    }
}