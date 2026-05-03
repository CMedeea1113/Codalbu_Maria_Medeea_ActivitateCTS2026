package ro.ase.cts.angajati;

import ro.ase.cts.exceptii.ExceptieNumeTaxa;
import ro.ase.cts.taxare.Taxe;

public class Lucrator implements Angajat {

    private String nume;
    private int nrOreLucrate;
    private double tarifOrar;

    public Lucrator() {
        this.nume = "Necunoscut";
        this.nrOreLucrate = 0;
        this.tarifOrar = 0.0;
    }

    public Lucrator(String nume, int nrOreLucrate, double tarifOrar) {
        this.nume = nume;
        this.nrOreLucrate = nrOreLucrate;
        this.tarifOrar = tarifOrar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    public void setNrOreLucrate(int nrOreLucrate) {
        this.nrOreLucrate = nrOreLucrate;
    }

    public double getTarifOrar() {
        return tarifOrar;
    }

    public void setTarifOrar(double tarifOrar) {
        this.tarifOrar = tarifOrar;
    }

    @Override
    public double calculSalariu() {
        double salariuBrut = tarifOrar * nrOreLucrate;
        double salariuNet = 0;

        try {
            salariuNet = salariuBrut
                    - salariuBrut * Taxe.getProcent("CAS")
                    - salariuBrut * Taxe.getProcent("CASS");

            salariuNet = salariuNet * (1 - Taxe.getProcent("Impozit"));
        } catch (ExceptieNumeTaxa e) {
            throw new RuntimeException(e);
        }

        return salariuNet;
    }
}