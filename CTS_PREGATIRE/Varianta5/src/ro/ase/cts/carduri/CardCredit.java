package ro.ase.cts.carduri;

public class CardCredit implements CardBancar{
    @Override
    public void afiseazaDetalii() {
        System.out.println("a fost emis un car de credit");
    }
}
