package ro.ase.cts.program;
import ro.ase.cts.Abonamente.*;
import ro.ase.cts.Factory.FabricaAbonamente;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
     FabricaAbonamente fabricaAbonamente=new FabricaAbonamente();

     Abonament f1 = fabricaAbonamente.creareAbonament(TipAbonament.BASIC);
     Abonament f2 = fabricaAbonamente.creareAbonament(TipAbonament.PREMIUM);
     Abonament f3 = fabricaAbonamente.creareAbonament(TipAbonament.STANDARD);

     f1.afiseazaBeneficii();
     f2.afiseazaBeneficii();
     f3.afiseazaBeneficii();

    }
}
