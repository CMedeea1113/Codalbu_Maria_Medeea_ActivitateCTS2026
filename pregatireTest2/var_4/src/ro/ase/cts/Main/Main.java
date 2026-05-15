package ro.ase.cts.Main;

import ro.ase.cts.stadion.IStadion;
import ro.ase.cts.stadion.ProxyStadion;
import ro.ase.cts.stadion.Spectator;
import ro.ase.cts.stadion.Stadion;

public class Main {
    public static void main( String[] args){
        IStadion iStadion = new ProxyStadion(new Stadion());
        Spectator v1 = new Spectator("Andrei", true, true);
        Spectator v2 = new Spectator("Maria", true, true);
        Spectator v3 = new Spectator("Ioana", true, false);
        Spectator v4 = new Spectator("Alex", false, true);

        iStadion.permiteacess(v1);
        iStadion.permiteacess(v2);
        iStadion.permiteacess(v3);
        iStadion.permiteacess(v4);
    }
}
