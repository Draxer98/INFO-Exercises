public abstract class ProdottoElettronico {
    private int codice;
    private String marca;
    private double prezzo;

    public ProdottoElettronico(int codice, String marca, double prezzo) {
        this.codice = codice;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdottoElettronico that = (ProdottoElettronico) o;
        return codice == that.codice;
    }

    @Override
    public String toString() {
        return String.format("Codice: " + codice + ", Marca: " + marca + ", Prezzo: " + prezzo);
    }
}