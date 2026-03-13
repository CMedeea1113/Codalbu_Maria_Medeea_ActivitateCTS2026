package ro.ase.cts.factory;
import ro.ase.cts.restaurant.*;
public class FabricaSupe {
    public Supa creareSupa(TipSupa tipSupa) throws IllegalAccessException {
        switch (tipSupa){
            case VITA:
                return new SupaVita();
            case LEGUME:
                return new SupaLegume();
            case CIUPERCI:
                return new SupaCiuperci();
            default:
                throw new IllegalAccessException("tip supa necunoscut");

        }
    }
}
