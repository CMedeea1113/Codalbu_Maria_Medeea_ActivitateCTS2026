package ro.ase.cts.Streaming;

public class DecorOfline extends DecorAbonament{
    public DecorOfline(IAbonament iAbonament) {
        super(iAbonament);
    }

    @Override
    public String getDescriere() {
        return iAbonament.getDescriere()+" descarcare offline";
    }

    @Override
    public double getPret() {
        return iAbonament.getPret()+ 5.0;
    }
}
