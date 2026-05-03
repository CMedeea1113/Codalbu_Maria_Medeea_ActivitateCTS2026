package ro.ase.cts;

import ro.ase.cts.spital.ISpital;
import ro.ase.cts.spital.ProxySpital;
import ro.ase.cts.spital.Spital;
import ro.ase.cts.spital.Vizitator;
import ro.ase.cts.virusuri.StructuraVirus;
import ro.ase.cts.virusuri.Virus;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TESTARE PROXY SPITAL ===");

        ISpital spitalReal = new Spital("Spitalul Universitar");
        ISpital proxySpital = new ProxySpital(spitalReal);

        Vizitator v1 = new Vizitator("Andrei", true);
        Vizitator v2 = new Vizitator("Maria", true);
        Vizitator v3 = new Vizitator("Ioana", false);
        Vizitator v4 = new Vizitator("George", true);

        proxySpital.permiteAcces(v1);
        proxySpital.permiteAcces(v2);
        proxySpital.permiteAcces(v3);
        proxySpital.permiteAcces(v4);

        System.out.println("\n=== TESTARE COMPOSITE VIRUSURI ===");

        StructuraVirus glob = new StructuraVirus("Glob");

        StructuraVirus europa = new StructuraVirus("Europa");
        StructuraVirus asia = new StructuraVirus("Asia");

        StructuraVirus romania = new StructuraVirus("Romania");
        StructuraVirus germania = new StructuraVirus("Germania");
        StructuraVirus japonia = new StructuraVirus("Japonia");

        Virus omicron = new Virus("Omicron", 1200, 1.8, "mediu");
        Virus delta = new Virus("Delta", 800, 1.5, "ridicat");
        Virus alpha = new Virus("Alpha", 500, 1.2, "scazut");
        Virus beta = new Virus("Beta", 300, 1.1, "mediu");

        romania.adaugaElement(omicron);
        romania.adaugaElement(delta);

        germania.adaugaElement(alpha);

        japonia.adaugaElement(beta);

        europa.adaugaElement(romania);
        europa.adaugaElement(germania);

        asia.adaugaElement(japonia);

        glob.adaugaElement(europa);
        glob.adaugaElement(asia);

        glob.afisare("");

        System.out.println("\nNumar total cazuri: " + glob.getNumarCazuri());
    }
}