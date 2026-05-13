package ro.ase.cts.Spital;

public class Spital implements ISpital{
    @Override
    public void permiteAcces(Vizitator vizitator) {
        System.out.println("Vizitatorul "+ vizitator.getNume()+ " a intrat in salon");

    }
}
