package ro.ase.cts.rezervare;

public class RezervareExterna {
    private String client;
    private String codCamera;
    private String perioada;

    public RezervareExterna(String client, String codCamera, String perioada) {
        this.client = client;
        this.codCamera = codCamera;
        this.perioada = perioada;
    }

    public String client() {
        return client;
    }

    public String codCamera() {
        return codCamera;
    }

    public String perioada() {
        return perioada;
    }
}
