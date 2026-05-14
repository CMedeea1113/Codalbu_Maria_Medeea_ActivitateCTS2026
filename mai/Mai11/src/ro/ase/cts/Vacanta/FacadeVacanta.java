package ro.ase.cts.Vacanta;

public class FacadeVacanta {
    private SistemEmail sistemEmail = new SistemEmail();
    private SistemHotel sistemHotel = new SistemHotel();
    private SistemPlata sistemPlata = new SistemPlata();
    private SistemZbor sistemZbor = new SistemZbor();

    public void pregatireVacanta(){
        sistemEmail.confirmareaRezervarii();
        sistemHotel.rezervareCamera();
        sistemPlata.plata();
        sistemZbor.rezervaZbor();
    }
}
