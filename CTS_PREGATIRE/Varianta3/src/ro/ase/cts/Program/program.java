package ro.ase.cts.Program;
import ro.ase.cts.RegistruStoc.RegistruStoc;
public class program {
    public static void main(String[] args){
        RegistruStoc registru1 = RegistruStoc.getInstance(100);
        RegistruStoc reegistru2 = RegistruStoc.getInstance(999);

        registru1.intrareStoc(20);
        reegistru2.iesireStoc(15);

        System.out.println(registru1);
        System.out.println(reegistru2);

        System.out.println(registru1=reegistru2);
    }
}
