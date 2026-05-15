package ro.ase.cts.rezervare;

import java.time.LocalDate;

public interface AbstractRezervareInterna {
    String nume();
    int  numarCamera();
    LocalDate dataCheckin();
}
