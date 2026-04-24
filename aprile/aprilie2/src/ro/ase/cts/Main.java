package ro.ase.cts;

import ro.ase.cts.contracts.IServiciuEveniment;
import ro.ase.cts.factory.ServiciuFactory;
import ro.ase.cts.factory.TipServiciu;
import ro.ase.cts.models.Eveniment;

public class Main {
    public static void main(String[] args) {

        // 4 obiecte din familia IServiciuEveniment
        IServiciuEveniment s1 = ServiciuFactory.creeazaServiciu(TipServiciu.CATERING);
        IServiciuEveniment s2 = ServiciuFactory.creeazaServiciu(TipServiciu.SONORIZARE);
        IServiciuEveniment s3 = ServiciuFactory.creeazaServiciu(TipServiciu.DECOR);
        IServiciuEveniment s4 = ServiciuFactory.creeazaServiciu(TipServiciu.FOTOGRAF);

        s1.descriere();
        s2.descriere();
        s3.descriere();
        s4.descriere();

        System.out.println();

        // proiect/eveniment-model
        Eveniment evenimentModel = new Eveniment(
                "Model standard",
                "Sala evenimente centrala",
                100,
                "Corporate"
        );

        // 3 evenimente derivate din model
        Eveniment eveniment1 = evenimentModel.clone();
        eveniment1.setNumeClient("Firma Alpha");
        eveniment1.setNumarParticipanti(120);

        Eveniment eveniment2 = evenimentModel.clone();
        eveniment2.setNumeClient("Firma Beta");
        eveniment2.setLocatie("Hotel Business");

        Eveniment eveniment3 = evenimentModel.clone();
        eveniment3.setNumeClient("Firma Gamma");
        eveniment3.setTipEveniment("Lansare produs");

        System.out.println(evenimentModel);
        System.out.println(eveniment1);
        System.out.println(eveniment2);
        System.out.println(eveniment3);
    }
}