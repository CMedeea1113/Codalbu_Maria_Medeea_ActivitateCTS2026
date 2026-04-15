package ro.ase.cts.turncontrol;

public class TurnControl {
    private String aeroport;
    private int numarAeronaveMonitorizate;
    private static TurnControl instanta = null;

    private TurnControl(String aeroport, int numarAeronaveMonitorizate) {
        this.aeroport = aeroport;
        this.numarAeronaveMonitorizate = numarAeronaveMonitorizate;
    }

    public static TurnControl getInstance(String aeroport, int numarAeronaveMonitorizate) {
        if (instanta == null) {
            instanta = new TurnControl(aeroport, numarAeronaveMonitorizate);
        }
        return instanta;
    }

    public String getAeroport() {
        return aeroport;
    }

    public void setAeroport(String aeroport) {
        this.aeroport = aeroport;
    }

    public int getNumarAeronaveMonitorizate() {
        return numarAeronaveMonitorizate;
    }

    public void setNumarAeronaveMonitorizate(int numarAeronaveMonitorizate) {
        this.numarAeronaveMonitorizate = numarAeronaveMonitorizate;
    }

    @Override
    public String toString() {
        return "TurnControl{" +
                "aeroport='" + aeroport + '\'' +
                ", numarAeronaveMonitorizate=" + numarAeronaveMonitorizate +
                '}';
    }
}