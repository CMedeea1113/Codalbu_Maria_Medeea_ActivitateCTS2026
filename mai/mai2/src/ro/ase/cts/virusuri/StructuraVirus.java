package ro.ase.cts.virusuri;

import java.util.ArrayList;
import java.util.List;

public class StructuraVirus implements INodVirus {

    private String denumire;
    private List<INodVirus> elemente = new ArrayList<>();

    public StructuraVirus(String denumire) {
        this.denumire = denumire;
    }

    public void adaugaElement(INodVirus element) {
        if (element != null) {
            elemente.add(element);
        }
    }

    public void stergeElement(INodVirus element) {
        elemente.remove(element);
    }

    @Override
    public void afisare(String indentare) {
        System.out.println(indentare + denumire);

        for (INodVirus element : elemente) {
            element.afisare(indentare + "   ");
        }
    }

    @Override
    public int getNumarCazuri() {
        int total = 0;

        for (INodVirus element : elemente) {
            total += element.getNumarCazuri();
        }

        return total;
    }
}