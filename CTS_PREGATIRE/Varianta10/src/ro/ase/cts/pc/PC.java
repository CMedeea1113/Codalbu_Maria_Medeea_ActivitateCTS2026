package ro.ase.cts.pc;

public class PC {
    private final String procesor;
    private final String stocare;
    private final String placaVideo;
    private final int ram;


    public PC(String procesor, String stocare, String placaVideo, int ram) {
        this.procesor = procesor;
        this.stocare = stocare;
        this.placaVideo = placaVideo;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "PC{" +
                "procesor='" + procesor + '\'' +
                ", ram=" + ram +
                ", stocare='" + stocare + '\'' +
                ", placaVideo='" + placaVideo + '\'' +
                '}';
    }
}
