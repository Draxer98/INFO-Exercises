import java.util.Objects;

public class Canzone implements Media{
    private String titolo;
    private String artista;
    private boolean riproduzione;

    public Canzone(String titolo, String artista) {
        this.titolo = titolo;
        this.artista = artista;
        this.riproduzione = false;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public boolean isRiproduzione() {
        return riproduzione;
    }

    public void setRiproduzione(boolean riproduzione) {
        this.riproduzione = riproduzione;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void play() {
        riproduzione = true;
        System.out.println("Riproducendo canzone: " + titolo + " di " + artista);
    }

    @Override
    public void stop() {
        riproduzione = false;
        System.out.println("Canzone interrotta: " + titolo);
    }

    @Override
    public void pausa() {
        riproduzione = false;
        System.out.println("Canzone in pausa: " + titolo);
    }

    @Override
    public String getTitoloInPlay() {
       return String.format("Titolo: " + titolo);
    }

    @Override
    public String toString() {
        return String.format("Titolo: " + titolo + ", Artista: " + artista);
    }
}
