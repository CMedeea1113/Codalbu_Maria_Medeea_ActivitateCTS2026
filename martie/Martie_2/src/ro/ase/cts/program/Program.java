package ro.ase.cts.program;

import ro.ase.cts.builder.ContPremiumBuilder;
import ro.ase.cts.cont.ContPremium;

public class Program {
    public static void main(String[] args) {
        ContPremiumBuilder builder = new ContPremiumBuilder("Premium Plus");

        builder.setCursuriVideo(true);
        builder.setMentorat(true);
        builder.setCertificatDigital(true);

        ContPremium cont = builder.build();
        System.out.println(cont);
    }
}