package ro.ase.cts.examen;

public class Candidat {
    private String nume;
    private boolean confirmareInscriere;
    private boolean echipat;

    public Candidat(String nume, boolean confirmareInscriere) {
        this.nume = nume;
        this.confirmareInscriere = confirmareInscriere;
        this.echipat = false;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean confirmareInscriere() {
        return confirmareInscriere;
    }

    public void setConfirmareInscriere(boolean confirmareInscriere) {
        this.confirmareInscriere = confirmareInscriere;
    }

    public boolean echipat() {
        return echipat;
    }

    public void setEchipat(boolean echipat) {
        this.echipat = true;
    }
}
