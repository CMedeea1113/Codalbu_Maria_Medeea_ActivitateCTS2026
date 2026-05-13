package ro.ase.cts.cinema;

import java.util.ArrayList;
import java.util.List;

public class ProxyCinema implements Icinema {
    private Cinema cinema;
    private List<Spectator> saladeasteptare;

    public ProxyCinema(Cinema cinema) {
        this.cinema = cinema;
        this.saladeasteptare = new ArrayList<>();
    }

    @Override
    public void permiteAcces(Spectator spectator) {
        if (!spectator.biletValid()) {
            System.out.println("Acces refuzat pentru " + spectator.getNume()
                    + ". Nu are bilet valid.");
            return;
        }

        saladeasteptare.add(spectator);
        System.out.println(spectator.getNume()
                + " asteapta formarea grupului.");

        if (saladeasteptare.size() >= 2) {
            System.out.println("S-a format un grup de minim 2 spectatori.");

            for (Spectator s : saladeasteptare) {
                s.setBrataraVIP(true);
                cinema.permiteAcces(s);
            }

            saladeasteptare.clear();
        }
    }
}