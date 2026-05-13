package ro.ase.cts;
import ro.ase.cts.*;
import ro.ase.cts.Spital.ISpital;
import ro.ase.cts.Spital.ProxySpital;
import ro.ase.cts.Spital.Spital;
import ro.ase.cts.Spital.Vizitator;
import ro.ase.cts.Virusuri.GrupVirus;
import ro.ase.cts.Virusuri.TulpinaVirus;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TESTARE PROXY SPITAL ===");

        ISpital spital = new ProxySpital(new Spital());

        Vizitator v1 = new Vizitator("Andrei", true);
        Vizitator v2 = new Vizitator("Maria", true);
        Vizitator v3 = new Vizitator("Ioana", true);
        Vizitator v4 = new Vizitator("Alex", false);

        spital.permiteAcces(v1);
        spital.permiteAcces(v2);
        spital.permiteAcces(v3);
        spital.permiteAcces(v4);


        System.out.println("\n=== TESTARE COMPOSITE VIRUSURI ===");

        GrupVirus glob = new GrupVirus("Glob");

        GrupVirus europa = new GrupVirus("Continent: Europa");
        GrupVirus asia = new GrupVirus("Continent: Asia");

        GrupVirus romania = new GrupVirus("Tara: Romania");
        GrupVirus franta = new GrupVirus("Tara: Franta");
        GrupVirus japonia = new GrupVirus("Tara: Japonia");

        romania.adaugaElement(
                new TulpinaVirus("Omicron", "ridicat", "mediu", 1200));
        romania.adaugaElement(
                new TulpinaVirus("Delta", "mediu", "ridicat", 800));

        franta.adaugaElement(
                new TulpinaVirus("Alpha", "mediu", "scazut", 600));
        franta.adaugaElement(
                new TulpinaVirus("Beta", "scazut", "mediu", 300));

        japonia.adaugaElement(
                new TulpinaVirus("Gamma", "ridicat", "ridicat", 900));
        japonia.adaugaElement(
                new TulpinaVirus("Lambda", "mediu", "mediu", 400));

        europa.adaugaElement(romania);
        europa.adaugaElement(franta);

        asia.adaugaElement(japonia);

        glob.adaugaElement(europa);
        glob.adaugaElement(asia);

        glob.afiseaza("");

        System.out.println("\nNumar total de cazuri: "
                + glob.getNumarCazuri());
    }
}
