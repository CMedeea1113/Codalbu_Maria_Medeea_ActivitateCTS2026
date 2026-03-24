package ro.ase.cts.program;

import ro.ase.cts.builder.TelefonBuilder;
import ro.ase.cts.telefon.Telefon;

public class Program {
    public static void main(String[] args) {
        TelefonBuilder builder = new TelefonBuilder("Samsung Galaxy S25");

        builder.setMemorieExtinsa(true);
        builder.setHusaProtectie(true);
        builder.setFolieEcran(true);

        Telefon telefon = builder.build();
        System.out.println(telefon);
    }
}
