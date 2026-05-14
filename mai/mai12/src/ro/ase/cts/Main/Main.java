package ro.ase.cts.Main;

import ro.ase.cts.Decorator.CafeaSimpla;
import ro.ase.cts.Decorator.DecoratorFrisca;
import ro.ase.cts.Decorator.DecoratorLapte;
import ro.ase.cts.Decorator.IBautura;

public class Main {
    public static void main(String[] args) {

        IBautura cafea = new CafeaSimpla();

        cafea = new DecoratorLapte(cafea);
        cafea = new DecoratorFrisca(cafea);

        System.out.println(cafea.getDescriere());
        System.out.println("Pret: " + cafea.getPret());
    }
}