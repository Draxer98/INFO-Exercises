package backEnd;

public class Romanzo extends Libro {
    private String genereLetterario;

    public Romanzo(String autore, String titolo, int nPagine, String genereLetterario) {
        super(autore, titolo, nPagine);
        this.genereLetterario = genereLetterario;
    }

    public String getGenereLetterario() {
        return genereLetterario;
    }

    public void setGenereLetterario(String genereLetterario) {
        this.genereLetterario = genereLetterario;
    }

    @Override
    public String toString() {
        return String.format("%s; Genere Letterario", super.toString(), genereLetterario);
    }
}
