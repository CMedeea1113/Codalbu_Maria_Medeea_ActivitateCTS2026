package ro.ase.cts.Virusuri;

public class TulpinaVirus extends ElementVirus{
    private String gradTransmitere;
    private String nivelRisc;
    private int numarCazuri;

    public TulpinaVirus(String denumire, String gradTransmitere, String nivelRisc, int numarCazuri) {
        super(denumire);
        this.gradTransmitere = gradTransmitere;
        this.nivelRisc = nivelRisc;
        this.numarCazuri = numarCazuri;
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare + "Tulpina: "+ denumire+ ", transmitere: "+ gradTransmitere+ ", risc: "+ nivelRisc+ ", cazuri:" + numarCazuri);

    }

    @Override
    public int getNumarCazuri() {
        return numarCazuri;
    }
}
