package ro.ase.cts.builder;

import ro.ase.cts.cont.ContPremium;

public class ContPremiumBuilder implements AbstractBuilderCont {
    private String tipAbonament;
    private boolean cursuriVideo;
    private boolean mentorat;
    private boolean testeSuplimentare;
    private boolean certificatDigital;

    public ContPremiumBuilder(String tipAbonament) {
        this.tipAbonament = tipAbonament;
        this.cursuriVideo = false;
        this.mentorat = false;
        this.testeSuplimentare = false;
        this.certificatDigital = false;
    }

    @Override
    public void setCursuriVideo(boolean cursuriVideo) {
        this.cursuriVideo = cursuriVideo;
    }

    @Override
    public void setMentorat(boolean mentorat) {
        this.mentorat = mentorat;
    }

    @Override
    public void setTesteSuplimentare(boolean testeSuplimentare) {
        this.testeSuplimentare = testeSuplimentare;
    }

    @Override
    public void setCertificatDigital(boolean certificatDigital) {
        this.certificatDigital = certificatDigital;
    }

    @Override
    public ContPremium build() {
        return new ContPremium(tipAbonament, cursuriVideo, mentorat, testeSuplimentare, certificatDigital);
    }
}