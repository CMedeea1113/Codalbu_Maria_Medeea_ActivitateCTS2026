package ro.ase.cts.abonament;

public abstract class DecorAbonament implements IAbonament{
    protected IAbonament iAbonament;

    public DecorAbonament(IAbonament iAbonament) {
        this.iAbonament = iAbonament;
    }
}
