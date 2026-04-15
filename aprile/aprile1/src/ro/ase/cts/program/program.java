package ro.ase.cts.program;

import ro.ase.cts.turncontrol.TurnControl;

public class program {
    public static void main(String[] args) {
        TurnControl turn1 = TurnControl.getInstance("Aeroportul Henri Coanda", 12);
        TurnControl turn2 = TurnControl.getInstance("Aeroportul Baneasa", 30);

        System.out.println(turn1);
        System.out.println(turn2);

        if (turn1 == turn2) {
            System.out.println("Cele doua referinte pointeaza catre aceeasi instanta.");
        } else {
            System.out.println("Sunt instante diferite.");
        }
    }
}