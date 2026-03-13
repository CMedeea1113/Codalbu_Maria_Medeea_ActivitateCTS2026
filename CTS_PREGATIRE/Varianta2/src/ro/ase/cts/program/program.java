package ro.ase.cts.program;
import ro.ase.cts.logare.loginBanca;
public class program {
    public static void main(String[] args){
        loginBanca login1= loginBanca.getInstance("tranzactii.log");
        loginBanca login2 = loginBanca.getInstance("altfisier.log");

        login1.logheazaTranzactie("Transfer 500 lei");
        login2.logheazaTranzactie("Plata factura 200 lei");

        System.out.println(login1);
        System.out.println(login2);

        System.out.println(login1=login2);
    }
}
