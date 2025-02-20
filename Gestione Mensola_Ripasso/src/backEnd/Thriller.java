package backEnd;

public class Thriller extends Libro{
    private String genereThriller;

    public Thriller(String autore, String titolo, int nPagine, String genereThriller) {
        super(autore, titolo, nPagine);
        this.genereThriller = genereThriller;
    }

    public String getGenereThriller() {
        return genereThriller;
    }

    public void setGenereThriller(String genereThriller) {
        this.genereThriller = genereThriller;
    }

    @Override
    public String toString() {
        return String.format("%s; Genere Thriller: %s", super.toString(), genereThriller);
    }
}
