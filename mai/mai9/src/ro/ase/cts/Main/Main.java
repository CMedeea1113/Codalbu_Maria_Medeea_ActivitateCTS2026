package ro.ase.cts.Main;

import ro.ase.cts.banca.AdapterBanca;
import ro.ase.cts.banca.IPlataOnline;
import ro.ase.cts.banca.TerminalBancarVechi;

public class Main {
    public static void main(String[] args){
        System.out.println("=== Testare Adapter ===");
        TerminalBancarVechi terminalBancarVechi= new TerminalBancarVechi();
        IPlataOnline adapter = new AdapterBanca(terminalBancarVechi);
        adapter.plateste();
    }
}
