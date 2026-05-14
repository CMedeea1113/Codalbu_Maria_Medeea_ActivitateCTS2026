package ro.ase.cts.Decorator;

public abstract class DecoratorProdus implements IBautura{
    protected IBautura iBautura;

    public DecoratorProdus(IBautura iBautura) {
        this.iBautura = iBautura;
    }
}
