package ro.ase.cts.Streaming;

public abstract class DecorAbonament implements IAbonament{
    public IAbonament iAbonament;

    public DecorAbonament(IAbonament iAbonament) {
        this.iAbonament = iAbonament;
    }



}
