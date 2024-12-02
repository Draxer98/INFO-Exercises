public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        if (denominatore == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public Frazione(String frazione) {
        String[] parts = frazione.split("/");
        if (parts.length != 2) {
            throw new IllegalArgumentException("La stringa non è nel formato corretto.");
        }

        int numeratore = Integer.parseInt(parts[0]);
        int denominatore = Integer.parseInt(parts[1]);

        if (denominatore == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }

        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public Frazione sommaFrazioni(Frazione f) {
        int newNumeratore = this.numeratore * f.denominatore + this.denominatore * f.numeratore;
        int newDenominatore = this.denominatore * f.denominatore;
        return new Frazione(newNumeratore, newDenominatore);
    }

    public double sommaFrazioniValore(Frazione f) {
        double thisValue = (double) this.numeratore / this.denominatore;
        double otherValue = (double) f.numeratore / f.denominatore;
        return thisValue + otherValue;
    }

    public void visualizzaFrazione() {
        System.out.println(this.numeratore + "/" + this.denominatore);
    }

    public int getNumeratore() {
        return numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }
}

