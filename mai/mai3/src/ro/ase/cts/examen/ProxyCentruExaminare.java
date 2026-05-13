package ro.ase.cts.examen;
import java.util.ArrayList;
import java.util.List;

public class ProxyCentruExaminare implements ICentruExamen {
    private CentruExaminare centruReal;
    private List<Candidat> listAsteptare;

    public ProxyCentruExaminare(CentruExaminare centruReal) {
        this.centruReal = centruReal;
        this.listAsteptare = new ArrayList<>();
    }

    @Override
    public void permiteAcces(Candidat candidat) {
        if(!candidat.confirmareInscriere()){
            System.out.println("Acces refuzat pentru " + candidat.getNume());
            return;
        }

        listAsteptare.add(candidat);
        System.out.println(candidat.getNume() + " asteapta formarea grupului");

        if(listAsteptare.size()>=3) {
            System.out.println("Grup format. Candidatii sunt echipati.");

            for (Candidat c : listAsteptare) {
                c.echipat();
                centruReal.permiteAcces(c);
            }

            listAsteptare.clear();

        }
    }
}
