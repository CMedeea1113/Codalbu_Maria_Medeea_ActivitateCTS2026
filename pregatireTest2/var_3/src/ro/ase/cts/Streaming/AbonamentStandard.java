package ro.ase.cts.Streaming;

public class AbonamentStandard implements IAbonament{
    @Override
    public String getDescriere() {
        return "Abonament standard";
    }

    @Override
    public double getPret() {
        return 25.0;
    }
}
