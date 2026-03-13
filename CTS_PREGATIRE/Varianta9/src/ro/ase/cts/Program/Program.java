package ro.ase.cts.Program;
import ro.ase.cts.Pizza.Pizza;
import ro.ase.cts.Builder.PizzaBuilder;
public class Program {
    public static void main(String[] args) {
        Pizza pizza1 = new PizzaBuilder("subtire", "rosii")
                .adaugaSunca()
                .adaugaCiuperci()
                .build();

        Pizza pizza2 = new PizzaBuilder("pufos", "usturoi")
                .adaugaPorumb()
                .build();

        Pizza pizza3 = new PizzaBuilder("clasic", "dulce")
                .build();

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }

}
