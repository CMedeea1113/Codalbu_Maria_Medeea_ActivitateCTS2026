package ro.ase.cts.stadion;

import java.util.ArrayList;
import java.util.List;

public class ProxyStadion implements IStadion{
    private Stadion stadion;
    private List<Spectator > saladeasteptare;

    public ProxyStadion(Stadion stadion) {
        this.stadion = stadion;
        this.saladeasteptare = new ArrayList<>();
    }

    @Override
    public void permiteacess(Spectator spectator) {
        if(!spectator.biletValid()){
            System.out.println("Acces refuzat pentru " + spectator.getNume()
                    + ". Nu are bilet valid.");
            return;
        }

        saladeasteptare.add(spectator);
        System.out.println(spectator.getNume()+ " asteapta formarea grupului");

        if(saladeasteptare.size()>=3){
            System.out.println("s-a format un grup de minim 3 oameni");

            for (Spectator s: saladeasteptare){
                s.setBrataraVIP(true);
                stadion.permiteacess(s);
            }
            saladeasteptare.clear();
        }

    }
}
