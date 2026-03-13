package ro.ase.cts.program;
import ro.ase.cts.pacienti.*;
import ro.ase.cts.factory.PatientFactory;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        ClinicLicense c1 = ClinicLicense.getInstance();
        ClinicLicense c2 = ClinicLicense.getInstance();

        final ClinicLicense[] c3 = new ClinicLicense[1];

        Thread t = new Thread(()->{
            c3[0] = ClinicLicense.getInstance();
        });

        t.start();
        try {
            t.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(c1 == c2);
        System.out.println(c1==c3[0]);
        c1.setAuthorizationCode("Clinic 001");

        System.out.println(c2.getAuthorizationCode());

        APatient p1 = PatientFactory.createPacient(PatientType.ADULT, "Andrei", 30);
        APatient p2 = PatientFactory.createPacient(PatientType.CHILD, "Maria", 7);
        APatient p3 = PatientFactory.createPacient(PatientType.SENIOR, "Elena", 70);
        APatient p4 = PatientFactory.createPacient(PatientType.EMERGENCY, "Ion", 45);

        System.out.println(p1.getType());
        System.out.println(p2.getType());
        System.out.println(p3.getType());
        System.out.println(p4.getType());

    }
}
