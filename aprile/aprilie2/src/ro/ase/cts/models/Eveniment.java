package ro.ase.cts.models;

public class Eveniment implements Cloneable {
    private String numeClient;
    private String locatie;
    private int numarParticipanti;
    private String tipEveniment;

    public Eveniment(String numeClient, String locatie, int numarParticipanti, String tipEveniment) {
        this.numeClient = numeClient;
        this.locatie = locatie;
        this.numarParticipanti = numarParticipanti;
        this.tipEveniment = tipEveniment;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public void setNumarParticipanti(int numarParticipanti) {
        this.numarParticipanti = numarParticipanti;
    }

    public void setTipEveniment(String tipEveniment) {
        this.tipEveniment = tipEveniment;
    }

    @Override
    public Eveniment clone() {
        try {
            return (Eveniment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clonarea nu este suportata");
        }
    }

    @Override
    public String toString() {
        return "Eveniment{" +
                "numeClient='" + numeClient + '\'' +
                ", locatie='" + locatie + '\'' +
                ", numarParticipanti=" + numarParticipanti +
                ", tipEveniment='" + tipEveniment + '\'' +
                '}';
    }
}
