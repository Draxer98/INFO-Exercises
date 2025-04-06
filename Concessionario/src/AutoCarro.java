public class AutoCarro extends Auto {
    private double tara;

    public AutoCarro(int id, String marca, String modello, double prezzo, int annoImmatricolazione, double tara) {
        super(id, marca, modello, prezzo, annoImmatricolazione);
        this.tara = tara;
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", TARA: " + tara + "q");
    }
}
