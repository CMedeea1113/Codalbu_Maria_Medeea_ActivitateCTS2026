package ro.ase.cts.models;

public class PachetTuristic implements Cloneable {
    private String numeClient;
    private String destinatie;
    private int numarZile;
    private double pret;

    public PachetTuristic(String numeClient, String destinatie, int numarZile, double pret) {
        this.numeClient = numeClient;
        this.destinatie = destinatie;
        this.numarZile = numarZile;
        this.pret = pret;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public void setNumarZile(int numarZile) {
        this.numarZile = numarZile;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public PachetTuristic clone() {
        try {
            return (PachetTuristic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clonarea nu este suportata");
        }
    }

    @Override
    public String toString() {
        return "PachetTuristic{" +
                "numeClient='" + numeClient + '\'' +
                ", destinatie='" + destinatie + '\'' +
                ", numarZile=" + numarZile +
                ", pret=" + pret +
                '}';
    }
}
