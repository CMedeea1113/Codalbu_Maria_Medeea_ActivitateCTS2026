import ro.ase.cts.angajati.Lucrator;
import ro.ase.cts.companie.Companie;

void main() {
    Companie companie=new Companie("SRL_SRL");
    companie.addAngajat(new Lucrator("Costel",100,12));
    companie.addAngajat(new Lucrator("Gigel",80,11));
    companie.addAngajat(new Lucrator("Viorel",66,22));
    System.out.println("Salariul total: "+companie.calculFondTotalSalarii());

}