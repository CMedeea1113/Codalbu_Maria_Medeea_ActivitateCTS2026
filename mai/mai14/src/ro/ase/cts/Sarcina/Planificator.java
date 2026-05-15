package ro.ase.cts.Sarcina;

public class Planificator {
    public void planificaSarcina(AbstractSarcinaInterna sarcina) {
        System.out.println("Titlu: " + sarcina.obtineTitlu());
        System.out.println("Prioritate numerica: " + sarcina.obtinePrioritate());
        System.out.println("Termen limita: " + sarcina.obtineTermenLimita());
    }
}
