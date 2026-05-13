package ro.ase.cts;
import ro.ase.cts.cinema.Cinema;
import ro.ase.cts.cinema.Icinema;
import ro.ase.cts.cinema.ProxyCinema;
import ro.ase.cts.cinema.Spectator;

public class Main {
    public static void main(String[] args){
        System.out.println("=== TESTARE PROXY SPITAL ===");

        Icinema cinema = new ProxyCinema(new Cinema());


        Spectator v1 = new Spectator("Andrei", true, true);
        Spectator v2 = new Spectator("Maria", true, true);
        Spectator v3 = new Spectator("Ioana", true, false);
        Spectator v4 = new Spectator("Alex", false, true);

        cinema.permiteAcces(v1);
        cinema.permiteAcces(v2);
        cinema.permiteAcces(v3);
        cinema.permiteAcces(v4);
    }
}

