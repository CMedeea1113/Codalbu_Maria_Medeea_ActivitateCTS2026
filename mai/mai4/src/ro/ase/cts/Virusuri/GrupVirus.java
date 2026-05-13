package ro.ase.cts.Virusuri;
import java.util.ArrayList;
import java.util.List;

public class GrupVirus extends ElementVirus {
    private List<ElementVirus> elemente;

    public GrupVirus(String denumire) {
        super(denumire);
        this.elemente = new ArrayList<>();
    }

    public void adaugaElement(ElementVirus element) {
        elemente.add(element);
    }

    public void stergeElement(ElementVirus element) {
        elemente.remove(element);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + denumire);

        for (ElementVirus element : elemente) {
            element.afiseaza(indentare + "   ");
        }
    }

    @Override
    public int getNumarCazuri() {
        int total = 0;

        for (ElementVirus element : elemente) {
            total += element.getNumarCazuri();
        }

        return total;
    }
}