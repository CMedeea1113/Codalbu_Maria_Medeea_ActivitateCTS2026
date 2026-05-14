package ro.ase.cts.Decorator;

public class DecoratorLapte extends DecoratorProdus{
    public DecoratorLapte(IBautura iBautura) {
        super(iBautura);
    }

    @Override
    public String getDescriere() {
        return iBautura.getDescriere()+ "lapte";

    }

    @Override
    public double getPret() {
        return iBautura.getPret()+2.0;
    }
}
