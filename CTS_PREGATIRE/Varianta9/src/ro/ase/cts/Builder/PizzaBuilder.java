package ro.ase.cts.Builder;
import ro.ase.cts.Pizza.Pizza;

public class PizzaBuilder {
    private String blat;
    private String sos;
    private boolean sunca;
    private boolean ciuperci;
    private boolean porumb;

    public PizzaBuilder(String blat, String sos) {
        this.blat = blat;
        this.sos = sos;
        this.sunca = false;
        this.ciuperci=false;
        this.porumb = false;

    }

    public PizzaBuilder adaugaSunca(){
        this.sunca=true;
        return this;

    }

    public PizzaBuilder adaugaCiuperci(){
        this.ciuperci=true;
        return this;
    }

    public PizzaBuilder adaugaPorumb(){
        this.porumb = true;
        return this;
    }

    public Pizza build(){
        return new Pizza(blat,sos,ciuperci,sunca,porumb);
    }



}
