package ro.ase.cts.Sarcina;

import java.time.LocalDate;

public class SarcinaInterna implements AbstractSarcinaInterna{
    private String titlu;
    private int prioritate;
    private LocalDate termenLimita;

    public SarcinaInterna(String titlu, int prioritate, LocalDate termenLimita) {
        this.titlu = titlu;
        this.prioritate = prioritate;
        this.termenLimita = termenLimita;
    }

    @Override
    public String obtineTitlu() {
        return titlu;
    }

    @Override
    public int obtinePrioritate() {
        return prioritate;
    }

    @Override
    public LocalDate obtineTermenLimita() {
        return termenLimita;
    }
}
