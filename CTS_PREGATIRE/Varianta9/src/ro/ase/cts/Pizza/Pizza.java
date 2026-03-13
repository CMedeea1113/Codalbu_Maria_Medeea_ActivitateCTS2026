package ro.ase.cts.Pizza;

public class Pizza {
    private final String blat;
    private final String sos;
    private final boolean sunca;
    private final boolean ciuperci;
    private final boolean porumb;

    public Pizza(String blat, String sos, boolean sunca, boolean ciuperci, boolean porumb) {
        this.blat = blat;
        this.sos = sos;
        this.sunca = sunca;
        this.ciuperci = ciuperci;
        this.porumb = porumb;
    }

    @Override
    public String toString() {
        return "Pizaa cu blat " + blat+ " sos "+ sos+" sunca "+sunca + " ciuperci " + ciuperci + " porumb "+ porumb;
    }
}
