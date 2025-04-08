import java.util.Objects;

public class Video implements Media{
    private String titolo;
    private boolean riproduzione;
    private int durata; //minuti

    public Video(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
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

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public void play() {
        System.out.println("Riproducendo video: " + titolo);
    }

    @Override
    public void stop() {
        System.out.println("Video interrotto: " + titolo);
    }

    @Override
    public void pausa() {
        System.out.println("Video in pausa: " + titolo);
    }

    @Override
    public String getTitoloInPlay() {
        return String.format("Titolo: " + titolo);
    }

    @Override
    public String toString() {
        return String.format("Titolo: " + titolo + ", Durata: " + durata);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titolo);
    }
}
