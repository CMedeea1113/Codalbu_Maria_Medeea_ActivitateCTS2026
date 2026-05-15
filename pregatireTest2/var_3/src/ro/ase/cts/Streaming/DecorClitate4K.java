package ro.ase.cts.Streaming;

public class DecorClitate4K extends DecorAbonament{
    public DecorClitate4K(IAbonament iAbonament) {
        super(iAbonament);
    }

    @Override
    public String getDescriere() {
        return iAbonament.getDescriere()+" 4k";
    }

    @Override
    public double getPret() {
        return iAbonament.getPret()+12.0;
    }
}
