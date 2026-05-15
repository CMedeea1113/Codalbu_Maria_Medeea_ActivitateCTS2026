package ro.ase.cts.rezervare;

public class ManagerRezervare {
    public void proceseazaRezervare(AbstractRezervareInterna rezervare){
        System.out.println("Rezervare procesata:");
        System.out.println("Client: " + rezervare.nume());
        System.out.println("Camera: " + rezervare.numarCamera());
        System.out.println("Check-in: " + rezervare.dataCheckin());
    }
}
