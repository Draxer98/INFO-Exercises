import java.util.Objects;

public abstract class Auto {
    private int id;
    private String marca;
    private String modello;
    private double prezzo;
    private int annoImmatricolazione;

    public Auto(int id, String marca, String modello, double prezzo, int annoImmatricolazione) {
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    @Override
    public String toString() {
        return String.format("ID: " + id + ", MARCA: " + marca + ", MODELLO: " + modello +
                ", PREZZO: " + prezzo + ", IMMATRICOLAZIONE: " + annoImmatricolazione);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(marca, auto.marca);
    }
}
