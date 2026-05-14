package ro.ase.cts.Main;

import ro.ase.cts.Livrare.AdaptareLivrare;
import ro.ase.cts.Livrare.ILivrareNoua;
import ro.ase.cts.Livrare.LivrareVeche;

public class Main {
    public static void main(String[] args){
        System.out.println("=== Testare adapter ===");
        LivrareVeche livrareVeche = new LivrareVeche();

        ILivrareNoua adapter = new AdaptareLivrare(livrareVeche);
        adapter.livreaza();
    }
}
