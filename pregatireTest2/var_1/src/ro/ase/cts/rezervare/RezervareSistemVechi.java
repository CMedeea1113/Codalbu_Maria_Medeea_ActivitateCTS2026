package ro.ase.cts.rezervare;

import java.time.LocalDate;

public class RezervareSistemVechi implements AbstractRezervareInterna{

    private String numeClient;
    private int numarCamera;
    private LocalDate dataCheckin;

    public RezervareSistemVechi(String numeClient, LocalDate dataCheckin, int numarCamera) {
        this.numeClient = numeClient;
        this.dataCheckin = dataCheckin;
        this.numarCamera = numarCamera;
    }

    @Override
    public int numarCamera() {
        return numarCamera;
    }

    @Override
    public LocalDate dataCheckin() {
        return dataCheckin;
    }

    @Override
    public String nume() {
        return numeClient;
    }
}
