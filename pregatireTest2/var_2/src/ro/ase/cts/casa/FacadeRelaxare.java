package ro.ase.cts.casa;

public class FacadeRelaxare {
    private SistemAudio sistemAudio = new SistemAudio();
    private SistemLumini sistemLumini = new SistemLumini();
    private Climatizarea climatizarea = new Climatizarea();
    private Alarma alarma = new Alarma();

    public void relaxare(){
        sistemAudio.aprindeSistemAudio();
        sistemLumini.aprindeLumina();
        climatizarea.pornireClima();
        alarma.pornireAlarma();
    }

}
