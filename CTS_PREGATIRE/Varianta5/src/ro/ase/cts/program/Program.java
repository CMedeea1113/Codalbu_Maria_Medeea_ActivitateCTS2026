package ro.ase.cts.program;
import ro.ase.cts.carduri.*;
import ro.ase.cts.factory.FabricaCarduri;
public class Program {
public static void main(String[] args) throws IllegalAccessException {
    FabricaCarduri fabricaCarduri = new FabricaCarduri();
    CardBancar c1= fabricaCarduri.creareCard(TipCard.CREDIT);
    CardBancar c2 = fabricaCarduri.creareCard(TipCard.DEBIT);
    CardBancar c3 = fabricaCarduri.creareCard(TipCard.GOLD);

    c1.afiseazaDetalii();
    c2.afiseazaDetalii();
    c3.afiseazaDetalii();


}
}
