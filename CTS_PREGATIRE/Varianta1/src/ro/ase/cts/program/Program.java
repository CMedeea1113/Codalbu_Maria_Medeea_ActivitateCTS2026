package ro.ase.cts.program;
import ro.ase.cts.panoucentral.PanouCentral;
public class Program {
    public static void main(String[] args){
        PanouCentral panou1 = PanouCentral.getInstance("Terminal Plecari", 25);
        PanouCentral panou2 = PanouCentral.getInstance("Terminal Sosiri", 100);

        System.out.println(panou1);
        System.out.println(panou2);

        if (panou1 == panou2) {
            System.out.println("Cele doua referinte pointeaza catre aceeasi instanta.");
        } else {
            System.out.println("Sunt instante diferite.");
        }
    }

}
