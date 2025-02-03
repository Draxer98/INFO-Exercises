package backEnd;

public class Rivista extends Libro {
    public Rivista(String autore, String titolo, int nPagine, Genere tipo) {
        super(autore, titolo, nPagine, tipo);
    }

    @Override
    public String toString() {
        return String.format("%s", super.toString());
    }
}
