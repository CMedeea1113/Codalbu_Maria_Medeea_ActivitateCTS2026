package ro.ase.cts.Sala;
import java.util.ArrayList;
import java.util.List;
public class ProxySalaFitness implements ISalaFitness {
    private SalaFitness salaFitness;
    private List<Client> saladeasteptare;

    public ProxySalaFitness(List<Client> saladeasteptare, SalaFitness salaFitness) {
        this.saladeasteptare = saladeasteptare;
        this.salaFitness = salaFitness;
    }

    @Override
    public void permiteAcess(Client client) {
        if(!client.abonamentValid()){
            System.out.println("Acces refuzat pentru " + client.getNume()
                    + ". Nu are abonament valid.");
            return;
        }
        saladeasteptare.add(client);
        System.out.println(client.getNume()
                + " asteapta formarea grupului.");

        if (saladeasteptare.size() >= 2) {
            System.out.println("S-a format un grup de minim 2 spectatori.");

            for (Client s : saladeasteptare) {
                s.abonamentPremium(true);
                salaFitness.permiteAcess(s);
            }

            saladeasteptare.clear();
        }
    }
}
