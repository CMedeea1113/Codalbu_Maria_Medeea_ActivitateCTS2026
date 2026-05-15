package ro.ase.cts.stadion;

public class Stadion implements IStadion{
    @Override
    public void permiteacess(Spectator spectator) {
        System.out.println("Spectatorul "+ spectator.getNume()+ " a intrat pe stadion");
    }
}
