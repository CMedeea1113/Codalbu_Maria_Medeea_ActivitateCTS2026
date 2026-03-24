package ro.ase.cts.cont;

public class ContPremium {
    private final String tipAbonament;
    private final boolean cursuriVideo;
    private final boolean mentorat;
    private final boolean testeSuplimentare;
    private final boolean certificatDigital;

    public ContPremium(String tipAbonament, boolean cursuriVideo, boolean mentorat,
                       boolean testeSuplimentare, boolean certificatDigital) {
        this.tipAbonament = tipAbonament;
        this.cursuriVideo = cursuriVideo;
        this.mentorat = mentorat;
        this.testeSuplimentare = testeSuplimentare;
        this.certificatDigital = certificatDigital;
    }

    @Override
    public String toString() {
        return "ContPremium{" +
                "tipAbonament='" + tipAbonament + '\'' +
                ", cursuriVideo=" + cursuriVideo +
                ", mentorat=" + mentorat +
                ", testeSuplimentare=" + testeSuplimentare +
                ", certificatDigital=" + certificatDigital +
                '}';
    }
}