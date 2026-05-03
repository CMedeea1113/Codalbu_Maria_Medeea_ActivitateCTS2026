package ro.ase.cts.virusuri;

public class Virus implements INodVirus {

    private String denumire;
    private int numarCazuri;
    private double rataTransmitere;
    private String gradSeveritate;

    public Virus(String denumire, int numarCazuri, double rataTransmitere, String gradSeveritate) {
        this.denumire = denumire;
        this.numarCazuri = numarCazuri;
        this.rataTransmitere = rataTransmitere;
        this.gradSeveritate = gradSeveritate;
    }

    @Override
    public void afisare(String indentare) {
        System.out.println(indentare + "Virus: " + denumire
                + ", cazuri: " + numarCazuri
                + ", rata transmitere: " + rataTransmitere
                + ", severitate: " + gradSeveritate);
    }

    @Override
    public int getNumarCazuri() {
        return numarCazuri;
    }
}