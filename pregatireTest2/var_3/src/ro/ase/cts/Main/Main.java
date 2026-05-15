package ro.ase.cts.Main;

import ro.ase.cts.Streaming.AbonamentStandard;
import ro.ase.cts.Streaming.DecorClitate4K;
import ro.ase.cts.Streaming.DecorOfline;
import ro.ase.cts.Streaming.IAbonament;

public class Main {
    public static void main( String[] args){
        IAbonament iAbonament = new AbonamentStandard();
        iAbonament = new DecorClitate4K(iAbonament);
        iAbonament = new DecorOfline(iAbonament);

        System.out.println(iAbonament.getDescriere());
        System.out.println("pretul: "+ iAbonament.getPret());
    }
}
