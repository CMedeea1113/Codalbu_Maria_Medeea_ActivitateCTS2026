package ro.ase.cts.Decorator;

public class DecoratorFrisca extends DecoratorProdus{
    public DecoratorFrisca(IBautura iBautura) {
        super(iBautura);
    }

    @Override
    public String getDescriere() {
        return iBautura.getDescriere()+"frisca";
    }

    @Override
    public double getPret() {
        return iBautura.getPret()+3.0;
    }
}
