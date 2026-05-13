package ro.ase.cts;
import ro.ase.cts.examen.*;
import ro.ase.cts.virusuri.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TESTARE PROXY ===");

        ProxyCentruExaminare centru =
                new ProxyCentruExaminare(new CentruExaminare());

        Candidat c1 = new Candidat("Andrei", true);
        Candidat c2 = new Candidat("Maria", true);
        Candidat c3 = new Candidat("Ioana", true);
        Candidat c4 = new Candidat("Alex", false);

        centru.permiteAcces(c1);
        centru.permiteAcces(c2);
        centru.permiteAcces(c3);
        centru.permiteAcces(c4);


        System.out.println("\n=== TESTARE COMPOSITE ===");

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
