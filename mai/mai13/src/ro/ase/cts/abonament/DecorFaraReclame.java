package ro.ase.cts.abonament;

public class DecorFaraReclame extends DecorAbonament{
    public DecorFaraReclame(IAbonament iAbonament) {
        super(iAbonament);
    }

    @Override
    public String getDescriere() {
        return iAbonament.getDescriere()+ " fara reclame";
    }

    @Override
    public double getPret() {
        return iAbonament.getPret()+ 10.7;
    }
}
