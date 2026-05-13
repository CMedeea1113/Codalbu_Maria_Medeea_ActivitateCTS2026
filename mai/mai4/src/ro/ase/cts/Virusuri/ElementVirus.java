package ro.ase.cts.Virusuri;

public abstract class ElementVirus {
    protected String denumire;

    public ElementVirus(String denumire){
        this.denumire=denumire;
    }
    public abstract void afiseaza(String identare);
    public abstract int getNumarCazuri();
}
