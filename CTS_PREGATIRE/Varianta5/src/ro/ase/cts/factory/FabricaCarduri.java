package ro.ase.cts.factory;
import ro.ase.cts.carduri.*;

public class FabricaCarduri {
    public CardBancar creareCard(TipCard tipCard) throws IllegalAccessException {
        switch (tipCard) {
            case DEBIT:
                return new CardDebit();
            case CREDIT:
                return new CardCredit();
            case GOLD:
                return new CardGold();
            default:
                throw new IllegalAccessException("tip card necunoscut");

        }
    }

}
