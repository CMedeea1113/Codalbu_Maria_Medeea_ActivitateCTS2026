package ro.ase.cts.Spital;
import java.util.ArrayList;
import java.util.List;

public class ProxySpital implements ISpital{
    private Spital spital;
    private List<Vizitator> salaAsteptare;

    public ProxySpital(Spital spital) {
        this.spital = spital;
        this.salaAsteptare = new ArrayList<>();
    }

    @Override
    public void permiteAcces(Vizitator vizitator) {
        if(!vizitator.areScrisoareAcceptare()){
            System.out.println("Acces refuzat pentru "+ vizitator.getNume()+". Nu arre scrisoare de acceptare");
            return;
        }


        salaAsteptare.add(vizitator);
        System.out.println(vizitator.getNume()+ "asteapta in sala de asteptare");

        if(salaAsteptare.size()>=3){
            System.out.println("s-a format un grup de minim 3 vizitatori ");
            for(Vizitator v: salaAsteptare){
                v.setEchipatProtectie();
                spital.permiteAcces(v);
            }
            salaAsteptare.clear();
        }

    }
}
