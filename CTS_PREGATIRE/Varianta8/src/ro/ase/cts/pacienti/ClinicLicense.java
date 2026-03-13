package ro.ase.cts.pacienti;

public class ClinicLicense implements IClinicLicense {
    private static volatile ClinicLicense instante;
    private String authorizationCode;

    private ClinicLicense() {
    }

    public static ClinicLicense getInstance() {
        if (instante == null) {
            synchronized (ClinicLicense.class) {

                if (instante == null)
                    instante = new ClinicLicense();
            }
        }
        return instante;
    }

    @Override
    public void setAuthorizationCode(String code) {
        if(this.authorizationCode != null){
            throw new AuthorizationCodeAlreadySetException("codul poate fi setat o singura data");
        }
        this.authorizationCode = code;
    }


    @Override
    public String getAuthorizationCode() {
        return authorizationCode;
    }
}



