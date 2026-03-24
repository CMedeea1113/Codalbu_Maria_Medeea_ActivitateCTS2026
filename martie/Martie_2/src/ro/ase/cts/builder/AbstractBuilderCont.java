package ro.ase.cts.builder;

import ro.ase.cts.cont.ContPremium;

public interface AbstractBuilderCont {
    void setCursuriVideo(boolean cursuriVideo);
    void setMentorat(boolean mentorat);
    void setTesteSuplimentare(boolean testeSuplimentare);
    void setCertificatDigital(boolean certificatDigital);
    ContPremium build();
}