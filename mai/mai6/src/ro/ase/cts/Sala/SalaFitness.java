package ro.ase.cts.Sala;

public class SalaFitness implements ISalaFitness{

    @Override
    public void permiteAcess(Client client) {
        System.out.println("clientul "+ client.getNume()+" a intrat in sala de asteptare");
    }
}
