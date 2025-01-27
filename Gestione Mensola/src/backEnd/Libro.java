package backEnd;

import java.util.Objects;

public class Libro {
    public String autore;
    public String titolo;
    public int nPagine;
    public final double COSTOPAGINE = 0.50;
    public Genere tipo;

    public Libro(String autore, String titolo, int nPagine, Genere tipo) {
        this.autore = autore;
        this.titolo = titolo;
        this.nPagine = nPagine;
        this.tipo = tipo;
    }

    public Libro() {

    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getnPagine() {
        return nPagine;
    }

    public void setnPagine(int nPagine) {
        this.nPagine = nPagine;
    }

    public double getCOSTOPAGINE() {
        return COSTOPAGINE;
    }

    public Genere getTipo() {
        return tipo;
    }

    public void setTipo(Genere tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", titolo='" + titolo + '\'' +
                ", nPagine=" + nPagine +
                ", COSTOPAGINE=" + COSTOPAGINE +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return nPagine == libro.nPagine && Double.compare(COSTOPAGINE, libro.COSTOPAGINE) == 0 && Objects.equals(autore, libro.autore) && Objects.equals(titolo, libro.titolo) && tipo == libro.tipo;
    }

    public double getCostoPagine(Libro outup) {
        return this.nPagine * this.COSTOPAGINE;
    }
}