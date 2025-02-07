package backEnd;

import java.util.Objects;

public class Libro {
    private String titolo;
    private String autore;
    private int nPagine;
    private final double COSTOPAGINE = 0.5;
    private Genere tipo;

    public Libro(String titolo, String autore, int nPagine, Genere tipo) {
        this.titolo = titolo;
        this.autore = autore;
        this.nPagine = nPagine;
        this.tipo = tipo;
    }

    public Genere getTipo() {
        return tipo;
    }

    public void setTipo(Genere tipo) {
        this.tipo = tipo;
    }

    public int getnPagine() {
        return nPagine;
    }

    public void setnPagine(int nPagine) {
        this.nPagine = nPagine;
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

    public static double prezzo(int nPagine, double COSTOPAGINE) {
        return COSTOPAGINE * nPagine;
    }

    @Override
    public String toString() {
        return String.format("Autore: %s, Titolo: %s, Prezzo: %.2f, Genere: %s", autore, titolo, Libro.prezzo(nPagine, COSTOPAGINE), tipo);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titolo, libro.titolo) && Objects.equals(autore, libro.autore);
    }
}
