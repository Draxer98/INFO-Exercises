public class AutoNuova extends Auto{
    private int alimentazione;
    private int cavalli;

    public AutoNuova(int id, String marca, String modello, double prezzo, int annoImmatricolazione, int cavalli, int alimentazione) {
        super(id, marca, modello, prezzo, annoImmatricolazione);
        this.cavalli = cavalli;
        this.alimentazione = alimentazione;
    }

    public int getCavalli() {
        return cavalli;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }

    public int getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(int alimentazione) {
        this.alimentazione = alimentazione;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", ALIMENTAZIONE: " + alimentazione + ", CAVALLI: " + cavalli);
    }
}
