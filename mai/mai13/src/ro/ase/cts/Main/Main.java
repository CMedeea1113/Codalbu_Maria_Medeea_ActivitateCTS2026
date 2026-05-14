package ro.ase.cts.Main;

import ro.ase.cts.abonament.AbonamentStandard;
import ro.ase.cts.abonament.DecorCalitate4K;
import ro.ase.cts.abonament.DecorFaraReclame;
import ro.ase.cts.abonament.IAbonament;

public class Main {
    public static void main ( String[] args){
        IAbonament abonament = new AbonamentStandard();
        abonament = new DecorCalitate4K(abonament);
        abonament = new DecorFaraReclame(abonament);
    System.out.println(abonament.getDescriere());
    System.out.println("Pret: "+ abonament.getPret());
    }
}
