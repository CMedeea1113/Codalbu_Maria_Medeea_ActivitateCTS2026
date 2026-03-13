package ro.ase.cts.program;
import ro.ase.cts.pc.PC;
import ro.ase.cts.builder.PCBuilder;
public class Program {
    public static void main(String[] args){
        PC pc1 = new PCBuilder("Intel i7")
                .setRam(16)
                .setStocare("SSD 1TB")
                .setPlacaVideo("RTX 4060")
                .build();

        PC pc2 = new PCBuilder("AMD Ryzen 5")
                .setRam(8)
                .build();

        System.out.println(pc1);
        System.out.println(pc2);
    }
}
