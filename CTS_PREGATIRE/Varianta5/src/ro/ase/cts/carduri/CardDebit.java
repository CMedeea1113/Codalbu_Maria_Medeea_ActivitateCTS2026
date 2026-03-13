package ro.ase.cts.carduri;

public class CardDebit implements CardBancar{
    @Override
    public void afiseazaDetalii() {
        System.out.println("a fost emis un card de debit.");
    }
}
