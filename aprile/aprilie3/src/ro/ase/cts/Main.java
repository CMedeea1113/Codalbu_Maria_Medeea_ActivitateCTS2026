package ro.ase.cts;

import ro.ase.cts.contracts.IServiciuTuristic;
import ro.ase.cts.factory.ServiciuTuristicFactory;
import ro.ase.cts.factory.TipServiciuTuristic;
import ro.ase.cts.models.PachetTuristic;

public class Main {
    public static void main(String[] args) {

        IServiciuTuristic s1 = ServiciuTuristicFactory.creeazaServiciu(TipServiciuTuristic.CAZARE);
        IServiciuTuristic s2 = ServiciuTuristicFactory.creeazaServiciu(TipServiciuTuristic.TRANSPORT);
        IServiciuTuristic s3 = ServiciuTuristicFactory.creeazaServiciu(TipServiciuTuristic.GHID_TURISTIC);
        IServiciuTuristic s4 = ServiciuTuristicFactory.creeazaServiciu(TipServiciuTuristic.ASIGURARE_CALATORIE);

        s1.descriere();
        s2.descriere();
        s3.descriere();
        s4.descriere();

        System.out.println();

        PachetTuristic pachetModel = new PachetTuristic(
                "Model standard",
                "Grecia",
                7,
                1200
        );

        PachetTuristic pachet1 = pachetModel.clone();
        pachet1.setNumeClient("Client Alpha");
        pachet1.setPret(1350);

        PachetTuristic pachet2 = pachetModel.clone();
        pachet2.setNumeClient("Client Beta");
        pachet2.setDestinatie("Italia");

        PachetTuristic pachet3 = pachetModel.clone();
        pachet3.setNumeClient("Client Gamma");
        pachet3.setNumarZile(10);

        System.out.println(pachetModel);
        System.out.println(pachet1);
        System.out.println(pachet2);
        System.out.println(pachet3);
    }
}
