public class Manuale extends Libro{
    private String argomento;

    public Manuale(int codiceAlfanumerico, int quantita, String autore, String titolo, int prezzo, String argomento) {
        super(codiceAlfanumerico, quantita, autore, titolo, prezzo);
        this.argomento = argomento;
    }

    public String getArgomento() {
        return argomento;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Argomento: " + argomento;
    }
}
