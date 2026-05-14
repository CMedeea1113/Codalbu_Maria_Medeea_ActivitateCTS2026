package ro.ase.cts.universitate;

public class adapterFisier implements IIncarcareProiect{
    private TransferFisierVechi transferFisierVechi;

    public adapterFisier(TransferFisierVechi transferFisierVechi) {
        this.transferFisierVechi = transferFisierVechi;
    }

    @Override
    public void incarca() {
        transferFisierVechi.trimiteFisier();
    }
}
