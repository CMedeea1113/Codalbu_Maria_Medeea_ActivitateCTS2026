package ro.ase.cts.bazadate;

public class ConexiuneBD {
    private String conexiune;
    private static ConexiuneBD instanta = null;

    public ConexiuneBD(String conexiune) {
        this.conexiune = conexiune;
    }
    public static synchronized ConexiuneBD getInstance(String conexiune){
        if(instanta == null)
            instanta = new ConexiuneBD(conexiune);
        return instanta;
    }
    public void deschideConexiuneBD(){
        System.out.println("Conexiunea ;a baza de date este activa" + conexiune);

    }

    @Override
    public String toString() {
        return "ConexiuneBD"+ "conexiune = "+ conexiune;

    }
}
