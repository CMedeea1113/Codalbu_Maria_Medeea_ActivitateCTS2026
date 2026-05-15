package ro.ase.cts.rezervare;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdapterRezervare implements AbstractRezervareInterna{
    private RezervareExterna rezervareExterna;

    public AdapterRezervare(RezervareExterna rezervareExterna) {
        this.rezervareExterna = rezervareExterna;
    }

    @Override
    public String nume() {
        return rezervareExterna.client();
    }

    @Override
    public int numarCamera() {
        return Integer.parseInt(
                rezervareExterna.codCamera().replace("CAM-", "")
        );
    }

    @Override
    public LocalDate dataCheckin() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(rezervareExterna.perioada(), formatter);
    }

}
