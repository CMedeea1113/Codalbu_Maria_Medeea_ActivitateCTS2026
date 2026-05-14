package ro.ase.cts.abonament;

public class DecorCalitate4K extends DecorAbonament{
    public DecorCalitate4K(IAbonament iAbonament) {
        super(iAbonament);
    }

    @Override
    public String getDescriere() {
        return iAbonament.getDescriere()+ " 4k";
    }

    @Override
    public double getPret() {
        return iAbonament.getPret()+ 10.0;
    }
}
