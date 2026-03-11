package ro.ase.cts.program;

import ro.ase.cts.builder.PantofBuilder;
import ro.ase.cts.pantofi.ExceptiePantof;
import ro.ase.cts.pantofi.Pantof;
import ro.ase.cts.pantofi.TipPantof;

public class Program {
    public static void main(String[] args) {

        try {
            Pantof pantof1 = new PantofBuilder(TipPantof.TENISI, 40, 1.5, "Piele")
                    .build();
            System.out.println("Cererea 1 a fost creata cu succes:");
            System.out.println(pantof1);
            System.out.println();
        } catch (ExceptiePantof e) {
            System.out.println("Eroare la cererea 1: " + e.getMessage());
            System.out.println();
        }

        try {
            Pantof pantof2 = new PantofBuilder(TipPantof.BALERINI, 37, 0.5, "Textil")
                    .adaugaMaterialSecundar("Fundita satinata")
                    .build();
            System.out.println("Cererea 2 a fost creata cu succes:");
            System.out.println(pantof2);
            System.out.println();
        } catch (ExceptiePantof e) {
            System.out.println("Eroare la cererea 2: " + e.getMessage());
            System.out.println();
        }

        try {
            Pantof pantof3 = new PantofBuilder(TipPantof.GHETE, 42, 4.0, "Piele intoarsa")
                    .adaugaMesajPrintat("Rock")
                    .adaugaMesajPrintat("Go")
                    .build();
            System.out.println("Cererea 3 a fost creata cu succes:");
            System.out.println(pantof3);
            System.out.println();
        } catch (ExceptiePantof e) {
            System.out.println("Eroare la cererea 3: " + e.getMessage());
            System.out.println();
        }

        try {
            Pantof pantof4 = new PantofBuilder(TipPantof.STILETTO, 38, 10.5, "Lac")
                    .adaugaMaterialSecundar("Pietricele")
                    .adaugaMaterialSecundar("Dantela")
                    .build();
            System.out.println("Cererea 4 a fost creata cu succes:");
            System.out.println(pantof4);
            System.out.println();
        } catch (ExceptiePantof e) {
            System.out.println("Eroare la cererea 4: " + e.getMessage());
            System.out.println();
        }

        try {
            Pantof pantof5 = new PantofBuilder(TipPantof.TENISI, 30, 2.0, "Piele")
                    .build();
            System.out.println("Cererea 5 a fost creata cu succes:");
            System.out.println(pantof5);
            System.out.println();
        } catch (ExceptiePantof e) {
            System.out.println("Eroare la cererea 5: " + e.getMessage());
            System.out.println();
        }
    }
}