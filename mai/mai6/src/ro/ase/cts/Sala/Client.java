package ro.ase.cts.Sala;

public class Client {
    private String nume;
    private boolean abonamentValid;
    private boolean abonamentPremium;
    private boolean brataraPremium;

    public Client(String nume, boolean abonamentValid, boolean abonamentPremium, boolean brataraPremium) {
        this.nume = nume;
        this.abonamentValid = abonamentValid;
        this.abonamentPremium = abonamentPremium;
        this.brataraPremium = brataraPremium;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean abonamentValid() {
        return abonamentValid;
    }

    public void setAbonamentValid(boolean abonamentValid) {
        this.abonamentValid = abonamentValid;
    }

    public boolean abonamentPremium(boolean b) {
        return abonamentPremium;
    }

    public void setAbonamentPremium(boolean abonamentPremium) {
        this.abonamentPremium = abonamentPremium;
    }

    public boolean brataraPremium() {
        return brataraPremium;
    }

    public void setBrataraPremium(boolean brataraPremium) {
        this.brataraPremium = brataraPremium;
    }
}
