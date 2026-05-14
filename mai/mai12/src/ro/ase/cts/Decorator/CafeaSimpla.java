package ro.ase.cts.Decorator;

public class CafeaSimpla implements IBautura{
    @Override
    public String getDescriere() {
        return "Cafea Simpla";
    }

    @Override
    public double getPret() {
        return 8.0;
    }
}
