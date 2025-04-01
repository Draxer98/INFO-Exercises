public abstract class Libro {
    private int codiceAlfanumerico;
    private String titolo;
    private String autore;
    private int prezzo;
    private int quantita;

    public Libro(int codiceAlfanumerico, int quantita, String autore, String titolo, int prezzo) {
        this.codiceAlfanumerico = codiceAlfanumerico;
        this.quantita = quantita;
        this.autore = autore;
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public int getCodiceAlfanumerico() {
        return codiceAlfanumerico;
    }

    public void setCodiceAlfanumerico(int codiceAlfanumerico) {
        this.codiceAlfanumerico = codiceAlfanumerico;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    @Override
    public String toString() {
        return String.format("Codice alfanumerico: " + codiceAlfanumerico + ", Titolo: " + titolo + ", Autore: " + autore + ", Prezzo: " + prezzo + ", Quantità: " + quantita);
    }
}
