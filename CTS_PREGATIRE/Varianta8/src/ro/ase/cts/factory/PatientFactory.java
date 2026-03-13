package ro.ase.cts.factory;
import ro.ase.cts.pacienti.*;
public class PatientFactory {
    public static APatient createPacient(PatientType type, String name, int age) throws IllegalAccessException {
        switch (type){
            case ADULT:
                return new AdultPatient(name,age);
            case CHILD:
                return new AdultPatient(name,age);
            case SENIOR:
                return new AdultPatient(name,age);
            case EMERGENCY:
                return new AdultPatient(name,age);
            default:
                throw new IllegalAccessException("tip pacient invalid");
        }
    }
}
