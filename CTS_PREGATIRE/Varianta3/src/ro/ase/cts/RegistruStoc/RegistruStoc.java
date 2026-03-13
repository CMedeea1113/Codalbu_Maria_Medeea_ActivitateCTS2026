package ro.ase.cts.RegistruStoc;

public class RegistruStoc {
    private int numarProduse;
    private static RegistruStoc instanta = null;

    public RegistruStoc(int numarProduse) {
        this.numarProduse = numarProduse;
    }

    public static synchronized RegistruStoc getInstance(int numarProduse){
        if(instanta==null)
            instanta = new RegistruStoc(numarProduse);
        return instanta;
    }

    public void intrareStoc(int cantitate){
        numarProduse +=cantitate;
        System.out.println("Au intrat"+ cantitate+ "produse.Stoc curent"+ numarProduse);
    }

    public void iesireStoc(int cantitate){
        numarProduse -=cantitate;
        System.out.println("Au iesit"+ cantitate+ "produse.Stoc curent"+ numarProduse);
    }

    @Override
    public String toString() {
        return " RegistruStoc "+" numarproduse= "+numarProduse;
    }
}
