package ro.ase.cts.examen;

public class CentruExaminare implements ICentruExamen{

    @Override
    public void permiteAcces(Candidat candidat) {
        System.out.println("Candidatul "+ candidat.getNume()+ " a intrat in sala de examen");
    }
}
