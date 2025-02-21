package backEnd;

public class Thriller extends Libro{
    private GenereThriller genereThriller;

    public Thriller(String autore, String titolo, int nPagine, GenereThriller genereThriller) {
        super(autore, titolo, nPagine);
        this.genereThriller = genereThriller;
    }

    public GenereThriller getGenereThriller() {
        return genereThriller;
    }

    public void setGenereThriller(GenereThriller genereThriller) {
        this.genereThriller = genereThriller;
    }

    @Override
    public String toString() {
        return String.format("THRILLER = %s; Genere Thriller: %s", super.toString(), genereThriller);
    }
}
