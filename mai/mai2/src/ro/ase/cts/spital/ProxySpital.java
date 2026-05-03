package ro.ase.cts.spital;

import java.util.ArrayList;
import java.util.List;

public class ProxySpital implements ISpital {

    private ISpital spital;
    private List<Vizitator> salaAsteptare = new ArrayList<>();

    public ProxySpital(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void permiteAcces(Vizitator vizitator) {
        if (!vizitator.isAreScrisoareAcceptare()) {
            System.out.println("Vizitatorul " + vizitator.getNume()
                    + " nu are scrisoare de acceptare si nu poate intra.");
            return;
        }

        salaAsteptare.add(vizitator);
        System.out.println("Vizitatorul " + vizitator.getNume()
                + " asteapta in sala de asteptare.");

        if (salaAsteptare.size() >= 3) {
            System.out.println("\nS-au strans minim 3 vizitatori. Personalul medical ii echipeaza.");

            for (Vizitator v : salaAsteptare) {
                v.echipeaza();

                if (v.isAreHaineProtectie()) {
                    spital.permiteAcces(v);
                }
            }

            salaAsteptare.clear();
            System.out.println();
        }
    }
}