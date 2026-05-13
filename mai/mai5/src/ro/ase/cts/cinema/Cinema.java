package ro.ase.cts.cinema;

public class Cinema implements Icinema{
    @Override
    public void permiteAcces(Spectator spectator) {
        System.out.println("Spectatorul "+ spectator.getNume()+ " a intrat in sala de cinema");
    }
}
