package ro.ase.cts.program;
import ro.ase.cts.restaurant.*;
import ro.ase.cts.factory.FabricaSupe;
public class Program {
    public static void main( String[] args) throws IllegalAccessException {
        FabricaSupe fabricaSupe= new FabricaSupe();

        Supa s1= fabricaSupe.creareSupa(TipSupa.VITA);
        Supa s2 = fabricaSupe.creareSupa(TipSupa.LEGUME);
        Supa s3 = fabricaSupe.creareSupa(TipSupa.CIUPERCI);

        s1.descriere();
        s2.descriere();
        s3.descriere();
    }
}
