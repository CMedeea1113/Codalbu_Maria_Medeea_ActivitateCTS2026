package ro.ase.cts.Sarcina;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AdapterSarcinaExterna implements AbstractSarcinaInterna{
    private SarcinaExterna sarcinaExterna;

    public AdapterSarcinaExterna(SarcinaExterna sarcinaExterna) {
        this.sarcinaExterna = sarcinaExterna;
    }

    @Override
    public String obtineTitlu() {
        return sarcinaExterna.getDescriere();
    }

    @Override
    public int obtinePrioritate() {
        String prioritate = sarcinaExterna.getPrioritateTextuala().toLowerCase();
        switch (prioritate) {
            case "scazuta":
                return 1;
            case "medie":
                return 2;
            case "ridicata":
                return 3;
            case "urgenta":
                return 4;
            default:
                return 0;
        }
    }

    @Override
    public LocalDate obtineTermenLimita() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(sarcinaExterna.getDataLimita(), formatter);
    }
}
