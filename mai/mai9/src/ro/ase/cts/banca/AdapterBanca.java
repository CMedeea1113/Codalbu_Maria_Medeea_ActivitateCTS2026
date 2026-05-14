package ro.ase.cts.banca;

public class AdapterBanca implements IPlataOnline{
    private TerminalBancarVechi terminalBancarVechi;

    public AdapterBanca(TerminalBancarVechi terminalBancarVechi) {
        this.terminalBancarVechi = terminalBancarVechi;
    }

    @Override
    public void plateste() {
        terminalBancarVechi.efectueazaPlata();
    }
}
