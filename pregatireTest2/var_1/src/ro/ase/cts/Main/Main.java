package ro.ase.cts.Main;

import ro.ase.cts.rezervare.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ManagerRezervare manager = new ManagerRezervare();

        System.out.println("=== REZERVARE INTERNA ===");

        AbstractRezervareInterna rezervareInterna =
                new RezervareSistemVechi("Maria Popescu", LocalDate.of(2026, 6, 10), 205);

        manager.proceseazaRezervare(rezervareInterna);


        System.out.println("\n=== REZERVARE EXTERNA ADAPTATA ===");

        RezervareExterna rezervareExterna =
                new RezervareExterna("Andrei Ionescu", "CAM-307", "15-06-2026");

        AbstractRezervareInterna rezervareAdaptata =
                new AdapterRezervare(rezervareExterna);

        manager.proceseazaRezervare(rezervareAdaptata);
    }
}
