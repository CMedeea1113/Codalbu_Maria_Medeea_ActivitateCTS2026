package ro.ase.cts.abonament;

public class AbonamentStandard implements IAbonament{
    @Override
    public String getDescriere() {
        return "Abonament Standard";
    }

    @Override
    public double getPret() {
        return 30.0;
    }
}
