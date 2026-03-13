package ro.ase.cts.program;
import ro.ase.cts.bazadate.ConexiuneBD;
public class Program {
    public static void main( String[] args) {
        ConexiuneBD c1 = ConexiuneBD.getInstance("jdbc:mysql://localhost:3306/magazin");
        ConexiuneBD c2 = ConexiuneBD.getInstance("alta conexiune");

        c1.deschideConexiuneBD();
        c2.deschideConexiuneBD();

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1 == c2);
    }
}
