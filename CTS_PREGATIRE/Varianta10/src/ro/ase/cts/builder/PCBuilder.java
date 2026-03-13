package ro.ase.cts.builder;
import ro.ase.cts.pc.PC;
public class PCBuilder {
    private String procesor;
    private int ram;
    private String stocare;
    private String placaVideo;

    public PCBuilder(String procesor) {
        this.procesor = procesor;
        this.ram = 0;
        this.stocare="fara stocare";
        this.placaVideo= "integrata";
    }

    public PCBuilder setRam(int ram){
        this.ram=ram;
        return this;
    }

    public PCBuilder setStocare(String stocare){
        this.stocare=stocare;
        return this;

    }

    public PCBuilder setPlacaVideo(String placaVideo){
        this.placaVideo = placaVideo;
        return this;
    }

    public PC build(){
        return new PC(procesor,stocare, placaVideo,ram);


    }

}
