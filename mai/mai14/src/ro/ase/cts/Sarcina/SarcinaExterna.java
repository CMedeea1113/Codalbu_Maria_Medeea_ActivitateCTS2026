package ro.ase.cts.Sarcina;

public class SarcinaExterna {
    private String descriere;
    private String prioritateTextuala;
    private String dataLimita;

    public SarcinaExterna(String descriere, String prioritateTextuala, String dataLimita) {
        this.descriere = descriere;
        this.prioritateTextuala = prioritateTextuala;
        this.dataLimita = dataLimita;
    }

    public String getDescriere() {
        return descriere;
    }

    public String getPrioritateTextuala() {
        return prioritateTextuala;
    }

    public String getDataLimita() {
        return dataLimita;
    }
}
