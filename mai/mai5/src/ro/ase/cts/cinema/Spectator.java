package ro.ase.cts.cinema;

public class Spectator {
    public String getNume;
    private String nume;
    private boolean biletValid;
    private boolean brataraVIP;

    public Spectator(String nume, boolean biletValid, boolean brataraVIP) {
        this.nume = nume;
        this.biletValid = biletValid;
        this.brataraVIP = brataraVIP;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean biletValid() {
        return biletValid;
    }

    public void setBiletValid(boolean biletValid) {
        this.biletValid = biletValid;
    }

    public boolean brataraVIP() {
        return brataraVIP;
    }

    public void setBrataraVIP(boolean brataraVIP) {
        this.brataraVIP = brataraVIP;
    }


}
