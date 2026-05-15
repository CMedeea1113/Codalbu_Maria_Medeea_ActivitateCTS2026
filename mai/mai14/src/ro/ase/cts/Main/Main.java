package ro.ase.cts.Main;

import ro.ase.cts.Sarcina.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Planificator planificator = new Planificator();

        AbstractSarcinaInterna sarcinaInterna =
                new SarcinaInterna("Raport proiect", 2, LocalDate.of(2026, 5, 20));

        SarcinaExterna sarcinaExterna =
                new SarcinaExterna("Implementare modul calendar", "urgenta", "25-05-2026");

        AbstractSarcinaInterna sarcinaAdaptata =
                new AdapterSarcinaExterna(sarcinaExterna);

        System.out.println("=== SARCINA INTERNA ===");
        planificator.planificaSarcina(sarcinaInterna);

        System.out.println("\n=== SARCINA EXTERNA ADAPTATA ===");
        planificator.planificaSarcina(sarcinaAdaptata);
    }
}
