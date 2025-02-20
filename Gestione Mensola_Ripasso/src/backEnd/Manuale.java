package backEnd;

public class Manuale extends Libro{
    private String argomento;
    private String livello;

    public Manuale(String autore, String titolo, int nPagine, String argomento, String livello) {
        super(autore, titolo, nPagine);
        this.argomento = argomento;
        this.livello = livello;
    }

    public String getArgomento() {
        return argomento;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    @Override
    public String toString() {
        return String.format("%s; Argomento: %s; Livello: %s", super.toString(), argomento, livello);
    }
}
