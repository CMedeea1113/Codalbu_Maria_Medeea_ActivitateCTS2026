package ro.ase.cts.builder;
import ro.ase.cts.pantofi.Pantof;
import ro.ase.cts.pantofi.TipPantof;
import ro.ase.cts.pantofi.ExceptiePantof;

import java.util.ArrayList;
import java.util.List;

public class PantofBuilder {
    private TipPantof tipPantof;
    private int numarPantof;
    private double dimensiuneToc;
    private String materialBaza;
    private List <String> materialeSecundare;
    private List <String> mesajePrintat;

    public PantofBuilder(TipPantof tipPantof, int numarPantof, double dimensiuneToc, List<String> materialeSecundare, String materialBaza, List<String> mesajePrintat) {
        this.tipPantof = tipPantof;
        this.numarPantof = numarPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.materialeSecundare = new ArrayList<>();
        this.materialBaza = materialBaza;
        this.mesajePrintat = new ArrayList<>();
    }

    public PantofBuilder adaugaMaterialSecundar(String material){
        this.materialeSecundare.add(material);
        return this;
    }
    public PantofBuilder adaugaMesajPrintat(String mesaj){
        this.mesajePrintat.add(mesaj);
        return this;
    }

    public Pantof build() throws ExceptiePantof{
        validareNumarPantof();
        validareDimensiunePantof();
        validareMaterialBaza();
        validareMaterialeSecundare();
        validareMesaje();

        return new Pantof(
                this.tipPantof,
                this.numarPantof,
                this.dimensiuneToc,
                this.materialBaza,
                new ArrayList<>(this.materialeSecundare),
                new ArrayList<>(this.mesajePrintat )
        );

    }
    private void validareNumarPantof() throws ExceptiePantof{
        if(this.numarPantof <35 || this.numarPantof>45){
            throw new ExceptiePantof("Numarul Pantofului trebuie sa fie intre 35 si 45");
        }
    }
    private void validareDimensiunePantof() throws ExceptiePantof{
        if(this.dimensiuneToc <0.5 || this.dimensiuneToc>12.5){
            throw new ExceptiePantof("Dimesiunea tocului trebuie sa fie intre 0.5 si 12");
        }
    }

    private void validareMaterialBaza() throws ExceptiePantof{
        if(this.materialBaza == null|| this.materialBaza.trim().isEmpty()){
            throw new ExceptiePantof("Materialul de baza nu poate fi null sau gol");

        }
    }

    private void validareMaterialeSecundare() throws ExceptiePantof{
        int numarMaximMateriale;

        switch (this.tipPantof){
            case BALERINI:
                numarMaximMateriale = 1;
                break;
            case GHETE:
                numarMaximMateriale = 4;
                break;
            case TENISI:
                numarMaximMateriale=3;
                break;
            case STILETTO:
                numarMaximMateriale = 2;
                break;
            default:
                numarMaximMateriale = 0;
        }
        if(this.materialeSecundare.size()>numarMaximMateriale)
        {
            throw new ExceptiePantof("Pentru tipul" +this.tipPantof
                    +"se accepta maximul"+numarMaximMateriale+
                    "materiale secundare");
        }

    }

    private void validareMesaje() throws ExceptiePantof{
        int sumaLungimi=0;

        for(String mesaj: this.mesajePrintat)
        {
            if(mesaj == null){
                throw new ExceptiePantof("Lista de mesaje contine un mesaj null");

            }
            sumaLungimi += mesaj.length();
        }
        if(sumaLungimi>=this.numarPantof){
            throw new ExceptiePantof("suma lungimilor mesajelor trebuie sa fie mai mica decat numarul pantofului");
        }
    }

}
