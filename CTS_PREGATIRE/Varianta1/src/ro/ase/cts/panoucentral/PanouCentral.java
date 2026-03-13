package ro.ase.cts.panoucentral;

public class PanouCentral {
    private String terminal;
    private int numarZboruriZi;
    private static PanouCentral instanta = null;

    public PanouCentral(String terminal, int numarZboruriZi) {
        this.terminal = terminal;
        this.numarZboruriZi = numarZboruriZi;
    }

    public static PanouCentral getInstance(String terminal, int numarZboruriZi) {
      if(instanta == null)
          instanta = new PanouCentral(terminal,numarZboruriZi);
      return instanta;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public int getNumarZboruriZi() {
        return numarZboruriZi;
    }

    public void setNumarZboruriZi(int numarZboruriZi) {
        this.numarZboruriZi = numarZboruriZi;
    }



    @Override
    public String toString() {
        return "PanouCentral{"+"terminal"+ terminal+"/"+",numarzboruriafisate"+numarZboruriZi+ "}";

    }
}
