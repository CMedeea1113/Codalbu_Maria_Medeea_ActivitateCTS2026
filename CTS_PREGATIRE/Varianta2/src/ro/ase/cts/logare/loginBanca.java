package ro.ase.cts.logare;

public class loginBanca {
    private String numeFisier;
    private static loginBanca instanta = null;

    public loginBanca(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public static synchronized loginBanca getInstance(String numeFisier){
        if(instanta == null)
            instanta = new loginBanca(numeFisier);
        return instanta;
    }

    public void logheazaTranzactie(String mesaj){
        System.out.println("S-a logat in fisierul" + numeFisier+ ":"+ mesaj);

    }

    @Override
    public String toString() {
        return "loginBanca{"+
                "numefisier="+
                numeFisier+"/"+"}";
    }
}
