package ro.ase.cts.pantofi;
import java.util.List;

public class Pantof {

    private final TipPantof tipPantof;
    private final int numar;
    private final double dimensiuneToc;
    private final String materialBaza;
    private final List<String> materialeExtra;
    private final List<String> mesaje;

    public Pantof(TipPantof tipPantof, int numar, double dimensiuneToc, String materialBaza, List<String> materialeExtra, List<String> mesaje) {
        this.tipPantof = tipPantof;
        this.numar = numar;
        this.dimensiuneToc = dimensiuneToc;
        this.materialBaza = materialBaza;
        this.materialeExtra = materialeExtra;
        this.mesaje = mesaje;
    }

    public TipPantof getTipPantof() {
        return tipPantof;
    }

    public int getNumar() {
        return numar;
    }

    public double getDimensiuneToc() {
        return dimensiuneToc;
    }

    public String getMaterialBaza() {
        return materialBaza;
    }

    public List<String> getMaterialeExtra() {
        return materialeExtra;
    }

    public List<String> getMesaje() {
        return mesaje;
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof='" + tipPantof + '\'' +
                ", numar=" + numar +
                ", toc=" + dimensiuneToc +
                ", material='" + materialBaza + '\'' +
                ", extra=" + materialeExtra +
                ", mesaje=" + mesaje +
                '}';
    }

}
