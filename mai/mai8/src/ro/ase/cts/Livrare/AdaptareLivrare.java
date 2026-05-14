package ro.ase.cts.Livrare;

public class AdaptareLivrare implements ILivrareNoua{
    private LivrareVeche livrareVeche;
    public AdaptareLivrare (LivrareVeche livrareVeche){
        this.livrareVeche=livrareVeche;
    }

    @Override
    public void livreaza() {
        livrareVeche.trimiteColet();
    }
}
