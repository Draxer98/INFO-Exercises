package backEnd;

import java.util.Objects;

public class Libro {
    private String autore;
    private String titolo;
    private int nPagine;
    private static final double COSTOPAGINE = 0.05;

    public Libro(String autore, String titolo, int nPagine) {

        this.autore = autore;
        this.titolo = titolo;
        this.nPagine = nPagine;
    }

    public Libro(Libro l) {
        this.autore = l.getAutore();
        this.titolo = l.getTitolo();
        this.nPagine = l.getnPagine();

    }


    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getnPagine() {
        return nPagine;
    }

    @Override
    public String toString() {
        return String.format("titolo: %s; autore: %s; numero pagine: %d; Prezzo Libro: %f", titolo, autore, nPagine, Libro.prezzo(nPagine, COSTOPAGINE));
        //   return "pippo";

    }

    public static double prezzo(int nPagine, final double COSTOPAGINE) {
        return nPagine * COSTOPAGINE;
    }


   /* public boolean equals(Libro that) {
        boolean trovato;
        trovato=(getAutore().equals(this.autore) && getTitolo().equals(this.titolo));
        return trovato;
    }*/

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Libro libro = (Libro) object;
        return Objects.equals(autore, libro.autore) && Objects.equals(titolo, libro.titolo);
    }

}