package ro.ase.cts.Main;

import ro.ase.cts.universitate.IIncarcareProiect;
import ro.ase.cts.universitate.TransferFisierVechi;
import ro.ase.cts.universitate.adapterFisier;

public class Main {
    public static void main( String[] args){
        System.out.println("=== Testare Adapter ===");
        TransferFisierVechi transferFisierVechi= new TransferFisierVechi();
        IIncarcareProiect adapter = new adapterFisier(transferFisierVechi);
        adapter.incarca();
    }
}
